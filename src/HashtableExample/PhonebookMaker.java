/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HashtableExample;

import java.util.Hashtable;

/**
 *
 * @author Bhanuka
 */
public class PhonebookMaker implements PhoneBook {

    private Hashtable<String, String> phoneBook;

    public PhonebookMaker() {
        phoneBook = new Hashtable<String, String>();
    }

    @Override
    public void add(String number, String name) {
        if (validateNumber(number)) {
            if (phoneBook.containsKey(number)) {
                System.out.println(number + " already exists");
            } else {
                phoneBook.put(number, name);
                System.out.println("Contact was added successfully.");
            }
        } else {
            System.out.println("Invalid formate of Phone Number");
        }

    }

    @Override
    public void find(String Number) {
        if (phoneBook.containsKey(Number)) {
            String Name = phoneBook.get(Number);
            System.out.println(Number + "'s owner is " + Name + ".");
        } else {
            System.out.println("No person named exists for this " + Number);
        }
    }

    @Override
    public void remove(String Number) {
        if (phoneBook.containsKey(Number)) {
            phoneBook.remove(Number);
            System.out.println(Number + " was removed successfully.");
        } else {
            System.out.println("No person named exists for this " + Number);
        }
    }

    @Override
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

    public boolean validateNumber(String number) {

        String regex = "^[0-9]{10}$";

        if (number.matches(regex)) {
            return true;
        }
        return false;
    }
}
