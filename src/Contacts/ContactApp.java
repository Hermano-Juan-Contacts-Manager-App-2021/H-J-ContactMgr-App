package Contacts;

import java.util.ArrayList;
import java.util.Scanner;

public class ContactApp {

    private static ArrayList<Contact> contactList;

    public static void main(String[] args) {

        contactList = new ArrayList<>();

        Contact ozzy = new Contact("Ozzy", "Garcia", 240 - 987 - 9545);

    }

    public static String contactApp() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Would you like to view contacts?\nView Contacts\n*******\nAdd a New Contacts.Contact\n" +
                "Search a Contacts.Contact by Name\nDelete an Existing Contacts.Contact\nEXIT\nEnter an Option (1 or 2 or 3 or 4 or 5:");

        private static void returnMenuDisplay () {
            String menu = "Would you like to view contacts?\n" +
                    "1 - View Contacts\n" +
                    "2 - Add a New Contacts.Contact\n" +
                    "3 - Search a Contacts.Contact by Name\n" +
                    "4 - Delete an Existing Contacts.Contact\n" +
                    "5 - EXIT";

            return menu;

        }
    }
}