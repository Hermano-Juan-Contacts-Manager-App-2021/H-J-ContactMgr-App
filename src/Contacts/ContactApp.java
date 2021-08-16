package Contacts;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static java.nio.file.Files.readAllLines;

public class ContactApp {

    private static ArrayList<Contact> contactList;


    public static void main(String[] args) {

        contactList = new ArrayList<>();

//        Contact ozzy = new Contact("Ozzy", "Garcia", 240 - 987 - 9545);

    }


    public static void contactApp() throws IOException {
        Scanner sc = new Scanner(System.in);

//        private static void MenuDisplay() {
        String menu = "Would you like to view contacts?\n" +
                "1 - View Contacts\n" +
                "2 - Add a New Contacts.Contact\n" +
                "3 - Search a Contacts.Contact by Name\n" +
                "4 - Delete an Existing Contacts.Contact\n" +
                "5 - Adios";
        System.out.println(menu);
        String userInput = sc.nextLine();
        if (userInput.equals("1")) {
            System.out.println("View Contacts. ");
            viewAllContacts();
        } else if (userInput.equals("2")) {
            addNewContact();
        } else if (userInput.equals("3")) {
            searchContact();
        } else if (userInput.equals("4")) {
            deleteContact();
        } else if (userInput.equals("5")) {
            System.out.println("Adios");
        }

    }


    private static void deleteContact() {
    }

    private static void searchContact() {
    }

    private static void addNewContact() {
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