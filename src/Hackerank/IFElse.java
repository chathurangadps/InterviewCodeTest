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
public class IFElse {

    public static void main(String[] args) {
        int N = 5;
        System.out.println(N % 2);
        if (N % 2 == 1) {
            System.out.println("Weird");
        } else {
            if (2 <= N && N <= 5) {
                System.out.println("Not Weird");
            } else if (6 <= N && N <= 20) {
                System.out.println("Weird");
            } else if (N >= 20) {
                System.out.println("Not Weird");
            }
        }
    }
}
