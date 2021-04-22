package com.prakash.xyz;

public class Passenger {
    String name;
    String phone;
    String email;
    String street;
    String city;
    String state;


    public Passenger(String name,String phone,String email, String street,String city,String state){
       this.name=name;
        this.phone=phone;
        this.email=email;
        this.street=street;
        this.city=city;
        this.state=state;

    }

    public Passenger(){                  // default constructor

    }
     public String getContact(){
        return this.name+this.phone+this.email;
     }
 public String getAddress(){
        return this.street+this.city+this.state;
 }

}
