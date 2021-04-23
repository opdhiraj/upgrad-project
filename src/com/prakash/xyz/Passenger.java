package com.prakash.xyz;

public class Passenger {

    static int idCounter;
    int id;

   private String name;
     private String phone;
     private String email;
    private  String street;
    private String city;
    private  String state;

    private static class Contact{                                        // nested inside passenger class..........
        String name, phone, email;
        public Contact(String name,String phone, String email){
            this.name=name;
            this.phone=phone;
            this.email=email;
        }
    }


    private static class Address{                                        // nested inside passenger class.....
        String street, city,state;
        public  Address(String street,String city, String state){
            this.street=street;
            this.city=city;
            this.state=state;
        }

    }
    Address address;                              // reference memory for  nested contact and address class......
    Contact contact;

       static {                                  // idCounter for counting no.object created in passenger class...
           idCounter=0;
       }

    public Passenger(String name,String phone,String email, String street,String city,String state){
;       this.id=++idCounter;
        this.address=new Address( "abcdr","patna","bihar");
        this.contact=new Contact("opd","91234565432","abc@gmail.com") ;
    }

    public Passenger(){                  // default constructor

    }

      String getContact(){
        return this.name+this.phone+this.email;
     }

         String getAddress(){
        return this.street+this.city+this.state;
 }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public int getPassengerCount(){
           return idCounter;
    }
}
