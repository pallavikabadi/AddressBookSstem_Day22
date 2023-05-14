package com.bridgelabz.Uc1;

public class AddressBook {
    public void createContact() {

        Contact person = new Contact("pallavi", "kabadi", "wakad", "Pune", "Maharashtra",
                "pallavikabadi08@gmail.com", 411057, "4353536636");
        System.out.println("First Name: " + person.getFirstName());
        System.out.println("Last Name: " + person.getLastName());
        System.out.println("Address: " + person.getAddress());
        System.out.println("City: " + person.getCity());
        System.out.println("State: " + person.getState());
        System.out.println("Email: " + person.getEmail());
        System.out.println("Zip Code: " + person.getZipCode());
        System.out.println("Phone Number: " + person.getPhoneNumber());
        System.out.println("Contact created successfully.....");
    }
}
