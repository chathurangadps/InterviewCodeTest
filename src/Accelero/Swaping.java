/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Accelero;

/**
 *
 * @author bhanuka
 */
public class Swaping {

    public static void main(String[] args) {
        int x = 10;
        int y = 5;

        x = x + y;
        y = x - y;
        x = x - y;

        System.out.println("New X is " + x + " and New Y is " + y);

    }

}
