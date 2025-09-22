# ✈️ Airline Reservation System  

## 📌 Problem Statement  
The project **Airline Reservation System** is designed to simulate a simple airline booking process.  
It allows passengers to search for flights, book seats, make payments (via Card or UPI), and generate boarding passes.  
The system demonstrates the use of **Object-Oriented Programming (OOP) concepts** such as **inheritance, abstraction, encapsulation, polymorphism**, along with **exception handling** and **utility classes**.  

---

## 🛠️ Features  
- Flight management (add/display flights & available seats)  
- Passenger registration  
- Seat booking with confirmation/cancellation  
- Payment processing (Card/UPI)  
- Boarding pass generation  
- Exception handling for invalid inputs  
- Clean modular code with packages (`model`, `exception`, `util`, `main`)  

---

## 📂 Project Structure  
com.kce.airline
│── model
│ ├── Flight.java
│ ├── Aircraft.java
│ ├── Seat.java
│ ├── Passenger.java
│ ├── Booking.java
│ ├── Payment.java (abstract)
│ ├── CardPayment.java
│ ├── UPIPayment.java
│ └── BoardingPass.java
│
│── exception
│ ├── InvalidBookingException.java
│ ├── InvalidPaymentException.java
│ └── SeatNotAvailableException.java
│
│── util
│ └── DatabaseUtil.java
│
│── main
│ └── Main.java


---

## ▶️ How to Compile & Run  

### **1. Clone the repository**  

git clone https://github.com/Sham0511/AirlineReservationSystem.git
cd AirlineReservationSystem



Here are the outputs for the following console based application:
<img width="1163" height="314" alt="image" src="https://github.com/user-attachments/assets/f3e137dc-2018-46fb-adef-5ee2e112ef9c" />
<img width="1163" height="263" alt="image" src="https://github.com/user-attachments/assets/cdd1dcb6-e22d-4c85-894a-d8e0cc4d784d" />
<img width="1163" height="391" alt="image" src="https://github.com/user-attachments/assets/1d703115-ee5b-4ef0-90bf-1b7fa717b0d5" />
<img width="1163" height="250" alt="image" src="https://github.com/user-attachments/assets/9344cecb-2d3f-4821-ab1e-e7fdc02327d8" />
<img width="470" height="318" alt="image" src="https://github.com/user-attachments/assets/5f52dd94-f3a8-47d7-9fe4-9086bd9917c6" />
<img width="489" height="317" alt="image" src="https://github.com/user-attachments/assets/0ef907f9-00d1-4342-bdf5-4d2091383929" />
<img width="1163" height="206" alt="image" src="https://github.com/user-attachments/assets/b9513c6a-7baf-4aef-8fff-0bab2c42a99f" />

👨‍🎓 Student Details

Name: SHAM M
Roll Number: 717823F150

✅ Conclusion
This project demonstrates a working Airline Reservation System using Java OOP principles, custom exceptions, and modular design. It can be further extended to connect with a real database and provide a GUI/web interface.
Here is the UML class diagram for the application:
<img width="848" height="982" alt="image" src="https://github.com/user-attachments/assets/bb23a109-3324-414c-a01e-4d89855ac692" />
