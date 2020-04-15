/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HashtableExample;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Scanner;

/**
 *
 * @author Bhanuka
 */
public class MakePhoneBook {

    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);
        PhoneBook1 phoneBook = new PhoneBook1();

        while (true) {
            System.out.print("$");

            String command = scanner.next();

            if (command.equals("add")) {
                String name = scanner.next();
                String number = scanner.next();
                phoneBook.add(name, number);
            } else if (command.equals("find")) {
                String name = scanner.next();
                phoneBook.find(name);
            } else if (command.equals("status")) {
                phoneBook.status();
            } else if (command.equals("delete")) {
                String name = scanner.next();
                phoneBook.delete_entry(name);
            } else if (command.equals("load")) {
                String fileName = scanner.next();
             //   phoneBook.loadFile(fileName);
            } else if (command.equals("save")) {
                String fileName = scanner.next();
             //   phoneBook.saveFile(fileName);
            } else if (command.equals("exit")) {
                break;
            }
        }
        scanner.close();
    }
}

class PhoneBook1 {

    private Hashtable<String, String> phoneBook;

    public PhoneBook1() {
        this.phoneBook = new Hashtable<String, String>();
    }

    public void add(String name, String number) {
        if (this.phoneBook.containsKey(name)) {
            System.out.println(name + " exists.");
        } else {
            this.phoneBook.put(name, number);
            System.out.println(name + " was added successfully.");
        }
    }

    public void find(String name) {
        if (this.phoneBook.containsKey(name)) {
            String number = this.phoneBook.get(name).toString();
            System.out.println(name + "'s number is " + number + ".");
        } else {
            System.out.println("No person named '" + name + "' exists.");
        }
    }

    public void status() {
        Enumeration names;
        names = this.phoneBook.keys();
        int total = 0;
        while (names.hasMoreElements()) {
            String str = (String) names.nextElement();
            System.out.println(str + " " + this.phoneBook.get(str));
            total++;
        }
        System.out.println("Total " + total + " persons.");
    }

    public void delete_entry(String name) {
        if (this.phoneBook.containsKey(name)) {
            this.phoneBook.remove(name);
            System.out.println(name + " was deleted successfully.");
        } else {
            System.out.println("No person named '" + name + "' exists.");
        }
    }

    public void saveFile(String fileName) throws IOException {
        FileWriter fw = new FileWriter(fileName);
        Enumeration names = this.phoneBook.keys();
        Enumeration nums = this.phoneBook.elements();
        int total = 0;
        while (names.hasMoreElements()) {
            String name = names.nextElement().toString();
            String num = nums.nextElement().toString();
            fw.write(name + " " + num + "\r\n");
            total++;
        }
        System.out.println("Saved " + total + " persons");
        fw.close();
    }

    public void loadFile(String fileName) throws IOException {
        BufferedReader read = new BufferedReader(new FileReader(fileName));
        String line = read.readLine();
        int total = 0;
        while (line != null) {
            String[] arr = line.split(" ");
            String name = arr[0];
            String num = arr[1];

            this.phoneBook.put(name, num);
            total++;
            line = read.readLine();
        }
        System.out.println("Total " + total + " persons.");
        read.close();
    }
}
