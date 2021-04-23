package com.prakash.xyz;

public   class TouristTicket extends Ticket {
    String hotelAddress;
    String selectedTouristLocation;

    public TouristTicket(String hotelAddress, String selectedTouristLocation) {
        this.hotelAddress = hotelAddress;
        this.selectedTouristLocation = selectedTouristLocation;
    }

    public String getHotelAddress(){
    return "abcds";

   }
    public String getTouristLocations() {
       return "gdjds";
    }
    public String removeTouristLocations(String locations) {
        return "abcd";
    }

    @Override
    public  int getFlightDuration(){
        return departureDateTime-arrivalDateTime;
    }
}
