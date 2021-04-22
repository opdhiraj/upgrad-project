package com.prakash.xyz;

public class Main {

    public static void main(String[] args) {
    Passenger passenger1=new Passenger("dhiraj","1234567891","abx@gmail.com","abc45","patna","bihar");
        System.out.println(passenger1.name);

        Flight flight1=new Flight("12345","alpha",300,200);

        System.out.println(flight1.airline);

        Ticket ticket1=new Ticket("1234567890","delhi","patna","alpha320","omPrakash",3000.00f);
        System.out.println(ticket1.price);

        RegularTicket  regularTicket1=new RegularTicket("food");
        System.out.println(regularTicket1.specialServices);

        TouristTicket touristTicket1=new TouristTicket("abcs delhi","l1 l2 l3 l5" );
        System.out.println(touristTicket1.selectedTouristLocation);

        Address address1=new Address("abcdr","patna","bihar");
        System.out.println(address1.state);
        Contact contact1 =new Contact("opd","91234565432","abc@gmail.com");
        System.out.println(contact1.email);
    }

}
