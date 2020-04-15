/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HashtableExample;

import java.util.Hashtable;
import java.util.Scanner;

/**
 *
 * @author Bhanuka
 */
public class PhonebookMaker {

    public static void main(String[] args) {

        System.out.println("Perfome any action [add , find, remove, show_all]");
        Scanner scanner = new Scanner(System.in);
        PhoneBook phoneBook = new PhoneBook();

        while (true) {

            System.out.println("Type action");
            String action = scanner.next();

            if (action.equalsIgnoreCase("add")) {
                System.out.println("Enter Phone Number");
                String number = scanner.next();
                System.out.println("Enter Name");
                String name = scanner.next();
                phoneBook.add(number, name);
            } else if (action.equalsIgnoreCase("find")) {
                System.out.println("Enter Number to Find");
                String number = scanner.next();
                phoneBook.find(number);
            } else if (action.equalsIgnoreCase("remove")) {
                System.out.println("Enter Number to Remove");
                String number = scanner.next();
                phoneBook.remove(number);
            } else if (action.equalsIgnoreCase("show_all") || action.equalsIgnoreCase("showall")) {
                phoneBook.showall();
            } else if (action.equalsIgnoreCase("exit")) {
                break;
            }
        }
        scanner.close();
    }
}

class PhoneBook {

    private Hashtable<String, String> phoneBook;

    public PhoneBook() {
        phoneBook = new Hashtable<String, String>();
    }

    public void add(String number, String name) {
        if (phoneBook.containsKey(number)) {
            System.out.println(number + " already exists");
        } else {
            phoneBook.put(number, name);
            System.out.println("Contact was added successfully.");
        }
    }

    public void find(String Number) {
        if (phoneBook.containsKey(Number)) {
            String Name = phoneBook.get(Number);
            System.out.println(Number + "'s owner is " + Name + ".");
        } else {
            System.out.println("No person named exists for this " + Number);
        }
    }

    public void remove(String Number) {
        if (phoneBook.containsKey(Number)) {
            phoneBook.remove(Number);
            System.out.println(Number + " was deleted successfully.");
        } else {
            System.out.println("No person named exists for this " + Number);
        }
    }

    public void showall() {
        if (phoneBook.size() > 0) {
            System.out.println(phoneBook.size() + " Contact Details ara available");
            for (String key : phoneBook.keySet()) {
                System.out.println(key + " : " + phoneBook.get(key));
            }
        } else {
            System.out.println("No available Contacts");
        }

    }

}
