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
public class Loop2 {

    public static void main(String[] args) {

        int a = 0;
        int b = 2;
        int n = 10;

        for (int j = 0; j < n; j++) {
            a = a + (int) Math.pow(2, j) * b;
            System.out.print(a + " ");
        }
        System.out.println("");

    }
}
