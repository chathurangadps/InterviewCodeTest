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
public class Palindromes {

    public static void main(String[] args) {
        String txt = "POP";

        StringBuilder builder = new StringBuilder(txt);
        String txtReverse = builder.reverse().toString();
//        System.out.println("rev " + txtReverse);

        if (txt.equals(txtReverse)) {
            System.out.println("Palindromed");
        }

    }
}
