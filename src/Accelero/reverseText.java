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
public class reverseText {

    public static void main(String[] args) {
        String txt = "Bhanuka";
        String reverseText = "";

        StringBuilder builder = new StringBuilder(txt);
        System.out.println("First Way is to reverse " + builder.reverse());

        for (int i = txt.length(); i > 0; i--) {
            reverseText += txt.charAt(i - 1);
        }

        System.out.println("Second Way is to reverse " + reverseText);
    }
}
