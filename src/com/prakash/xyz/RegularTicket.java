package com.prakash.xyz;

public class RegularTicket extends Ticket {
    String specialServices;

    public RegularTicket(String specialServices) {
        super() ;
    }

    public String getSpecialServices(){
        return "abc+efg+sdf";
    }
    public String updateSpecialServices( String specialServices){

        return "abc" ;
    }

    public int getFlightDuration(){                               // override
        return  departureDateTime-arrivalDateTime;
    }
}
