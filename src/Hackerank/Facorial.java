/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hackerank;

/**
 *
 * @author bhanuka
 */
public class Facorial {

    public static void main(String[] args) {
        int number = 10;

        for (int i = 1; i < number; i++) {
            if (i % 2 == 1) {
                System.out.print(i + ",");
            }
        }

    }
}
