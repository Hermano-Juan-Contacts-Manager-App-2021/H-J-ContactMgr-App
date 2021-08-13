

import java.util.ArrayList;
import java.util.Scanner;

public class ContactApp {

    private static ArrayList<Contact> contactList;

    public static void main(String[] args) {

        contactList = new ArrayList<>();

        Contact ozzy = new Contact("Ozzy", "Garcia", 240-987-9545);

    }

    public static void contactApp() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Would you like to view contacts?\nView Contacts\n*******\nAdd a New Contact\n" +
                "Search a Contact by Name\nDelete an Existing Contact\nEXIT\nEnter an Option (1 or 2 or 3 or 4 or 5:");

        private static String returnMenuDisplay() {
            String menu = "Would you like to view contacts?\n" +
                    "1 - View Contacts\n" +
                    "2 - Add a New Contact\n" +
                    "3 - Search a Contact by Name\n" +
                    "4 - Delete an Existing Contact\n" +
                    "5 - EXIT";

            return menu;

        }
    }



}