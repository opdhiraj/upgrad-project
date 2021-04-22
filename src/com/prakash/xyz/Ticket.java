package com.prakash.xyz;

public class Ticket {
    String pnr;
    String from;
    String to;
    String flightname;               //--------
    int departureDateTime;
   int arrivalDateTime;
    String name;                   //--------------
    String seatNo;
    Float price;
    boolean cancelled =false;

    public Ticket(String pnr, String from, String to, String flightname, String name, Float price) {
        this.pnr = pnr;
        this.from = from;
        this.to = to;
        this.flightname = flightname;
        this.name = name;
        this.price = price;
    }

    public String checkStatus(){
        return pnr+flightname+departureDateTime+from+to;

    }
     public  int getFlightDuration(){

        return departureDateTime-arrivalDateTime;
     }
     public boolean cancel(){
        return cancelled ;
     }

}
