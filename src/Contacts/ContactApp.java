package Contacts;

import javax.xml.crypto.Data;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import static java.nio.file.Files.readAllLines;

public class ContactApp {

    private static ArrayList<Contact> contactList;


    public static void main(String[] args) {

        contactList = new ArrayList<>();

    }


    public static void contactApp() throws IOException {
        Scanner sc = new Scanner(System.in);

//        private static void MenuDisplay() {
        String menu = "What would you like to do?\n" +
                "1 - View Contacts\n" +
                "2 - Add a New Contact\n" +
                "3 - Search a Contact by Name\n" +
                "4 - Delete an Existing Contact\n" +
                "5 - Adios";
        System.out.println(menu);
        String userInput = sc.nextLine();
        if (userInput.equals("1")) {
            System.out.println("View Contacts. ");
            viewAllContacts();
            contactApp();
        } else if (userInput.equals("2")) {
            System.out.println("Enter First Name ");
            String firstName = sc.nextLine();
            System.out.println("Enter Last Name ");
            String lastName = sc.nextLine();
            System.out.println("Enter Phone Number [xxx-xxx-xxxx] ");
            String phoneNumber = sc.nextLine();
            Contact newContact = new Contact(firstName, lastName, phoneNumber);
            addNewContact(newContact);
            contactApp();
        } else if (userInput.equals("3")) {
            searchContact();
            contactApp();
        } else if (userInput.equals("4")) {
            System.out.println("Enter First Name ");
            String firstName = sc.nextLine();
            System.out.println("Enter Last Name ");
            String lastName = sc.nextLine();
            System.out.println("Enter Phone Number [xxx-xxx-xxxx] ");
            String phoneNumber = sc.nextLine();
            deleteContact(firstName, lastName, phoneNumber);
            contactApp();
        } else if (userInput.equals("5")) {
            System.out.println("Adios");
        }

    }


    private static void deleteContact(String firstName, String lastName,String phoneNumber) {
        try {
            List<String> lines = Files.readAllLines(Paths.get("data", "contacts.txt"));
            List<String> newList = new ArrayList<>();

            for (String line: lines) {
                if (line.contains(firstName) && line.contains(lastName) && line.contains(phoneNumber)) {
                    continue;
                }
                newList.add(line);
            }
            Files.write(Paths.get("data", "contacts.txt"), newList);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void searchContact() {
    }

    private static void addNewContact(Contact newContact) throws IOException {
        String contactString = newContact.getFirstName() + " " + newContact.getLastName() + " | " + newContact.getPhoneNumber();
        Files.write(
                Paths.get("data", "contacts.txt"),
                Arrays.asList(contactString), // list with one item
                StandardOpenOption.APPEND
        );
    }


    private static void viewAllContacts() throws IOException {
        String directory = "data";
        String filename = "contacts.txt";
        Path dataFile = Paths.get(directory, filename);
        List<String> dataInput =  Files.readAllLines(dataFile);
        for (String contact: dataInput) {
            System.out.println(contact);
        }


    }
}
