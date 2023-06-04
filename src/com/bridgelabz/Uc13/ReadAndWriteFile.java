package com.bridgelabz.Uc13;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class ReadAndWriteFile extends Collection {

    public static void writeToFile() {
        String path = "D:\\intillig\\AddressBook_Day22\\src\\com\\bridgelabz\\Uc13\\AddressBook.txt";
        StringBuffer addressBookBuffer = new StringBuffer();
        addressBookMap.values().stream().forEach(contact -> {
            String personDataString = contact.toString().concat("\n");
            addressBookBuffer.append(personDataString);
        });

        try {
            Files.write(Paths.get(path), addressBookBuffer.toString().getBytes());
        }
        catch (IOException e) {
            System.out.println("Catch block");
        }
    }

    public static void readFromFile() {
        String path = "D:\\intillig\\AddressBook_Day22\\src\\com\\bridgelabz\\Uc13\\AddressBook.txt";
        System.out.println("Reading from : " + path + "\n");
        try {
            Files.lines(new File(path).toPath()).forEach(employeeDetails -> System.out.println(employeeDetails));
        }
        catch(IOException e){
            System.out.println("Catch block");
        }
    }
}
