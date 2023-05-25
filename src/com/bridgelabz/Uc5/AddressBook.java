package com.bridgelabz.Uc5;

import java.util.ArrayList;
import java.util.Scanner;

public class AddressBook {
    /*
    Create ArrayList of Contact object called contact
    for store the contact of each person.
 */
    private String AddressbookName;

    public String getAddressbookName() {
        return AddressbookName;
    }

    public void setAddressbookName(String addressbookName) {
        AddressbookName = addressbookName;
    }
    ArrayList<Contact> contactBook = new ArrayList<>();
    Scanner sc = new Scanner(System.in);
    public void AddContact(){

        Contact contact = new Contact();
        System.out.print("Enter First name :");
        String firstname = sc.next();
        contact.setFirstName(firstname);
        System.out.print("Enter last name :");
        String lastname = sc.next();
        contact.setLastName(lastname);
        System.out.print("Enter Address :");
        String address = sc.next();
        contact.setAddress(address);
        System.out.print("Enter City :");
        String city = sc.next();
        contact.setCity(city);
        System.out.print("Enter State :");
        String state = sc.next();
        contact.setState(state);
        System.out.print("Enter zip code :");
        String zipCode = sc.next();
        contact.setZipCode(Integer.parseInt(zipCode));
        System.out.print("Enter phone number : ");
        String phone = sc.next();
        contact.setPhoneNumber(phone);
        System.out.print("Enter Email :");
        String email = sc.next();
        contact.setEmail(email);
        contactBook.add(contact);
        System.out.println("Contact added Successfully!!!");
    }
    public void display(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter name of the contact : ");
        String name = sc.next();
        for(int i=0;i<contactBook.size();i++){
            System.out.println(contactBook.get(i));
        }
    }

    public void Edit() {
        System.out.println("Enter name of the contact which you want to edit");
        String name = sc.next();
        for(int i =0;i<contactBook.size();i++)
        {
            Contact contact = contactBook.get(i);
            if(contact.getFirstName().equals(name)){
                System.out.println("Contact Found!!");
                System.out.println("Please update the details");
                System.out.print("Enter First name :");
                String firstname = sc.next();
                contact.setFirstName(firstname);
                System.out.print("Enter last name :");
                String lastname = sc.next();
                contact.setLastName(lastname);
                System.out.print("Enter Address :");
                String address = sc.next();
                contact.setAddress(address);
                System.out.print("Enter City :");
                String city = sc.next();
                contact.setCity(city);
                System.out.print("Enter State :");
                String state = sc.next();
                contact.setState(state);
                System.out.print("Enter zip code :");
                String  zipCode= sc.next();
                contact.setZipCode(Integer.parseInt(zipCode));
                System.out.print("Enter phone number : ");
                String phone = sc.next();
                contact.setPhoneNumber(phone);
                System.out.print("Enter Email :");
                String email = sc.next();
                contact.setEmail(email);
                System.out.println("Contact Edited Successfully");
            }
            else {
                System.out.println("please Enter valid contact name!!!!");
                Edit();
            }
        }
    }
    public void delete(){
        System.out.println("Enter name of the contact which you want to delete: ");
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        for(int i=0;i<contactBook.size();i++) {
            Contact contact =contactBook.get(i);
            if(contact.getFirstName().equals(name))
            {
                contactBook.remove(contact);
            }
        }
        System.out.println("Contact deleted!!!!");
    }
    @Override
    public String toString() {
        return "AddressBook{" +
                "AddressbookName='" + AddressbookName + '\'' +
                ", contactBook=" + contactBook +
                '}';
    }
}
