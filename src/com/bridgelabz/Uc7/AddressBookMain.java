package com.bridgelabz.Uc7;

import java.util.HashMap;
import java.util.Scanner;

public class AddressBookMain {
    HashMap<String , AddressBook> hashMap = new HashMap<String, AddressBook>();
    public void AddAddressbook(){
        AddressBook addressBook = new AddressBook();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name of the AddressBook");
        String name=sc.next();
        if(hashMap.containsKey(name)){
            System.out.println("Enter different name for the AddressBook");
            AddAddressbook();
        }else {
            addressBook.setAddressbookName(name);
            hashMap.put(addressBook.getAddressbookName(), addressBook);
            System.out.println("Address book added!!");
        }
    }
    public void Addcontact(){
        if(hashMap.isEmpty())
        {
            System.out.println("Your address book is empty first please add new Addressbook");
            AddAddressbook();
        }
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name of the addressbok in which you want to add contact: ");
        String name = sc.next();
        if(hashMap.containsKey(name)){
            AddressBook temp = hashMap.get(name);
            temp.addContact();
        }
    }
    public void Display(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name of the addressbok in which you want to display contact: ");
        String name = sc.next();
        if(hashMap.containsKey(name)){
            AddressBook temp = hashMap.get(name);
            temp.display();
        }
    }
    public void Delete(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name of the addressbok in which you want to Delete contact: ");
        String name = sc.next();
        if(hashMap.containsKey(name)){
            AddressBook temp = hashMap.get(name);
            temp.delete();
        }
    }
    public void Edit(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name of the addressbok in which you want to Edit contact: ");
        String name = sc.next();
        if(hashMap.containsKey(name)){
            AddressBook temp = hashMap.get(name);
            temp.Edit();
        }
    }
    public void displayAllAddressbook(){
        System.out.println("Displaying all addressbook");
        if(hashMap.isEmpty()){
            System.out.println("Addressbook is empty");
        }else {
            System.out.println(hashMap);
        }
    }

    public static void main(String[] args) {
        AddressBookMain addressBookMain = new AddressBookMain();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Welcome to AddressBook program");
            System.out.println("1) Press 1 to Add new contact");
            System.out.println("2) press 2 to Display contact");
            System.out.println("3) press 3 to Edit contact");
            System.out.println("4) press 4 to Delete contact");
            System.out.println("5) press 5 to Add AddressBook");
            System.out.println("6) press 6 to Display all AddressBook");
            System.out.println("7) press 5 to Exit");
            int input = sc.nextInt();
            switch (input) {
                case 1 -> {
                    addressBookMain.Addcontact();
                }
                case 2 -> {
                    addressBookMain.Display();
                }
                case 3 -> {
                    addressBookMain.Edit();
                }
                case 7 -> {
                    System.out.println("Thank you so much !!!");
                    System.exit(0);
                }
                case 4 -> {
                    addressBookMain.Delete();
                }
                case 5 -> {
                    addressBookMain.AddAddressbook();
                }
                case 6 -> {
                    addressBookMain.displayAllAddressbook();
                }
            }
        }
    }
}
