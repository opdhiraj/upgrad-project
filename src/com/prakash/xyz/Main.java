package com.prakash.xyz;

public class Main {

    public static void main(String[] args) {
    Passenger passenger1=new Passenger("dhiraj","1234567891","abx@gmail.com","abc45","patna","bihar");
        System.out.println(passenger1.getName());


        RegularTicket  regularTicket1=new RegularTicket("food");
        System.out.println(regularTicket1.specialServices);

        TouristTicket touristTicket1=new TouristTicket("abcs delhi","l1 l2 l3 l5" );
        System.out.println(touristTicket1.selectedTouristLocation);



         
        }




    }

}
