package com.kce.airline.main;

import com.kce.airline.model.*;
import com.kce.airline.service.*;
import com.kce.airline.util.IDGenerator;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);
	static FlightService flightService = new FlightService();
	static PassengerService passengerService = new PassengerService();
	static BookingService bookingService = new BookingService();
	static CheckInService checkInService = new CheckInService();

	public static void main(String[] args) {
		int choice = 0;
		do {
			showMenu();
			choice = sc.nextInt();
			sc.nextLine();
			switch (choice) {
			case 1:
				addFlight();
				break;
			case 2:
				addPassenger();
				break;
			case 3:
				createBooking();
				break;
			case 4:
				makePayment();
				break;
			case 5:
				checkIn();
				break;
			case 6:
				cancelBooking();
				break;
			case 7:
				flightService.displayFlights();
				break;
			case 8:
				System.out.println("Exiting...");
				break;
			default:
				System.out.println("Invalid choice, try again.");
			}
		} while (choice != 8);
	}

	static void showMenu() {
		System.out.println("\n=== Airline Reservation System ===");
		System.out.println("1. Add Flight");
		System.out.println("2. Add Passenger");
		System.out.println("3. Create Booking");
		System.out.println("4. Make Payment");
		System.out.println("5. Check-in & Issue Boarding Pass");
		System.out.println("6. Cancel Booking");
		System.out.println("7. Display Flights");
		System.out.println("8. Exit");
		System.out.print("Enter your choice: ");
	}

	static void addFlight() {
		System.out.print("Enter origin: ");
		String origin = sc.nextLine();
		System.out.print("Enter destination: ");
		String dest = sc.nextLine();
		System.out.print("Enter departure time: ");
		String depTime = sc.nextLine();
		System.out.print("Enter arrival time: ");
		String arrTime = sc.nextLine();
		System.out.print("Enter aircraft model: ");
		String model = sc.nextLine();
		System.out.print("Enter aircraft capacity: ");
		int capacity = sc.nextInt();
		sc.nextLine();

		Aircraft ac = new Aircraft(model, capacity);

		List<Seat> seats = new ArrayList<>();
		for (int i = 1; i <= capacity; i++) {
			seats.add(new Seat("S" + i));
		}

		String flightId = IDGenerator.getFlightId();
		Flight f = new Flight(flightId, origin, dest, depTime, arrTime, ac, seats);
		flightService.addFlight(f);
		System.out.println("Flight added: " + f);
	}

	static void addPassenger() {
		System.out.print("Enter passenger name: ");
		String name = sc.nextLine();
		System.out.print("Enter email: ");
		String email = sc.nextLine();
		System.out.print("Enter phone: ");
		String phone = sc.nextLine();

		String pid = IDGenerator.getPassengerId();
		Passenger p = new Passenger(pid, name, email, phone);
		passengerService.addPassenger(p);
		System.out.println("Passenger added: " + p);
	}

	static void createBooking() {
		System.out.print("Enter passenger ID: ");
		String pid = sc.nextLine();
		Passenger p = passengerService.findPassengerById(pid);
		if (p == null) {
			System.out.println("Passenger not found.");
			return;
		}

		System.out.print("Enter flight number: ");
		String fid = sc.nextLine();
		Flight f = flightService.findFlightByNumber(fid);
		if (f == null) {
			System.out.println("Flight not found.");
			return;
		}

		List<Seat> availableSeats = f.getSeats();
		System.out.println("Available seats:");
		for (Seat s : availableSeats) {
			if (!s.isBooked())
				System.out.print(s.getSeatNumber() + " ");
		}
		System.out.println();

		System.out.print("Enter seat number to book: ");
		String seatNo = sc.nextLine();
		Seat selectedSeat = null;
		for (Seat s : availableSeats) {
			if (s.getSeatNumber().equalsIgnoreCase(seatNo)) {
				selectedSeat = s;
				break;
			}
		}

		if (selectedSeat == null || selectedSeat.isBooked()) {
			System.out.println("Seat not available.");
			return;
		}

		List<Seat> seatsToBook = new ArrayList<>();
		seatsToBook.add(selectedSeat);

		String bid = IDGenerator.getBookingId();
		Booking b = bookingService.createBooking(bid, f, p, seatsToBook);
		if (b != null)
			b.setConfirmed(false); 
	}

	static void makePayment() {
		System.out.print("Enter booking ID: ");
		String bid = sc.nextLine();
		Booking b = bookingService.findBookingById(bid);
		if (b == null) {
			System.out.println("Booking not found.");
			return;
		}

		System.out.print("Enter payment amount: ");
		double amt = sc.nextDouble();
		sc.nextLine();

		System.out.print("Choose payment type (1-Card, 2-UPI): ");
		int type = sc.nextInt();
		sc.nextLine();

		Payment payment = null;
		int payId = Integer.parseInt(IDGenerator.getPaymentId().replaceAll("[^0-9]", ""));

		if (type == 1) {
			System.out.print("Enter card number: ");
			String cardNo = sc.nextLine();
			System.out.print("Enter expiry date (MM/YY): ");
			String exp = sc.nextLine();
			payment = new CardPayment(payId, amt, cardNo, exp);
		} else if (type == 2) {
			System.out.print("Enter UPI ID: ");
			String upiId = sc.nextLine();
			payment = new UpiPayment(payId, amt, upiId);
		} else {
			System.out.println("Invalid payment type.");
			return;
		}

		payment.processPayment();
		if (payment.isSuccess()) {
			System.out.println("Payment completed successfully!");
			b.setConfirmed(true);
		} else {
			System.out.println("Payment failed.");
		}
	}

	static void checkIn() {
		System.out.print("Enter booking ID: ");
		String bid = sc.nextLine();
		Booking b = bookingService.findBookingById(bid);
		if (b == null || !b.isConfirmed()) {
			System.out.println("Booking not confirmed.");
			return;
		}

		System.out.print("Enter gate number: ");
		String gate = sc.nextLine();

		Seat seat = b.getSeats().get(0);
		String bpId = IDGenerator.getBoardingPassId();
		BoardingPass bp = checkInService.checkIn(bpId, b, seat, gate);
	}

	static void cancelBooking() {
		System.out.print("Enter booking ID to cancel: ");
		String bid = sc.nextLine();
		bookingService.cancelBooking(bid);
	}
}
