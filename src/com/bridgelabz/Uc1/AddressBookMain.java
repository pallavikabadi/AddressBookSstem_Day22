package com.bridgelabz.Uc1;

public class AddressBookMain {
    public static void main(String[] args) {
        System.out.println("Welcome to Address Book program");
        System.out.println("--------------------------");
        System.out.println("Contact created in address book is: ");
        AddressBook addressBook = new AddressBook();
        addressBook.createContact();
    }
}
