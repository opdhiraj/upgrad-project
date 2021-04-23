package com.prakash.xyz;

public abstract class Ticket {
    static Ticket ticketInstance =null;


    String pnr;
    String from;
    String to;
                                                          //-------int departureDateTime;
   int arrivalDateTime;
    String name;                   //--------------
    String seatNo;
    Float price;
    boolean cancelled =false;

     public  Ticket (){

    }

    private static class Flight{                          // flight class nested inside ticket
         String flightNumber,airline;
         int capacity, bookedSeat;
        Flight ( String flightNumber,String airline,int capacity,int bookedSeat){
            this.flightNumber=flightNumber;
            this.airline=airline;
            this.capacity=capacity;
            this.bookedSeat=bookedSeat;

         }
    }



         Flight flight;                   // reference memory for Flight class........



    Ticket (String pnr, String from, String to,String name, Float price) {
        this.pnr = pnr;
        this.from = from;
        this.to = to;
        this.name = name;
        this.price = price;
        this.flight= new Flight ("flightNumber123", "airline xyz", 500, 300);
    }

       public String checkStatus(){
        return this.pnr+this.from+this.to;

    }





     public  abstract  int getFlightDuration();



     public boolean cancel(){
        return cancelled ;
     }

}
