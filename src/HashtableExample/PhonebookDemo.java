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
public class PhonebookDemo {

    public static void main(String[] args) {

        System.out.println("Perfome any action [add , find, remove, show_all]");
        Scanner scanner = new Scanner(System.in);
        PhonebookMaker phonebookMaker = new PhonebookMaker();

        while (true) {

            System.out.println("Type action");
            String action = scanner.next();

            if (action.equalsIgnoreCase("add")) {
                System.out.println("Enter Phone Number");
                String number = scanner.next();
                System.out.println("Enter Name");
                String name = scanner.next();
                phonebookMaker.add(number, name);
            } else if (action.equalsIgnoreCase("find")) {
                System.out.println("Enter Number to Find");
                String number = scanner.next();
                phonebookMaker.find(number);
            } else if (action.equalsIgnoreCase("remove")) {
                System.out.println("Enter Number to Remove");
                String number = scanner.next();
                phonebookMaker.remove(number);
            } else if (action.equalsIgnoreCase("show_all") || action.equalsIgnoreCase("showall")) {
                phonebookMaker.showall();
            } else if (action.equalsIgnoreCase("exit")) {
                break;
            }
        }
        scanner.close();
    }
}
