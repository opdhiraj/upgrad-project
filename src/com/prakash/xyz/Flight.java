package com.prakash.xyz;

public class Flight {
    String flightNumber;
    String airline;
    int capacity;
    int bookedSeats;
    boolean availability;

    public Flight(String flightNumber, String airline, int capacity, int bookedSeats) {
        this.flightNumber = flightNumber;
        this.airline = airline;
        this.capacity = capacity;
        this.bookedSeats = bookedSeats;

    }

    public String getFlightDetails(){
        return this.flightNumber+this.airline+this.capacity+this.bookedSeats;
    }
    public boolean checkAvailability(){
       if (bookedSeats>=capacity) {
           availability = true;
       }
           else{
               availability=false;
       }
        return availability;
    }

}
