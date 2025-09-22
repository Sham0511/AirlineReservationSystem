package com.kce.airline.model;


public class Passenger {
    private String passengerId;
    private String name;
    private String email;
    private String phone;

    public Passenger(String passengerId, String name, String email, String phone) {
        this.passengerId = passengerId;
        this.name = name;
        this.email = email;
        this.phone = phone;
    }

    public String getPassengerId() {
        return passengerId;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

	@Override
	public String toString() {
		return "Passenger [passengerId=" + passengerId + ", name=" + name + ", email=" + email + ", phone=" + phone
				+ "]";
	}

    
}
