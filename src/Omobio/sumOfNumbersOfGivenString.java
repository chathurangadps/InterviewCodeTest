/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Omobio;

/**
 *
 * @author bhanuka
 */
public class sumOfNumbersOfGivenString {

    public static void main(String[] args) {

        String txt = "45f65df4d5srew45er45f5rw3";
        int sum = 0;

        for (int i = 0; i < txt.length(); i++) {
            if (Character.isDigit(txt.charAt(i))) {
                sum += Character.getNumericValue(txt.charAt(i));
            }
        }
        System.out.println("Sum is :" + sum);
    }
}
