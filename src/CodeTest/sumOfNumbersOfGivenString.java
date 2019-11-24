/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CodeTest;

/**
 *
 * @author bhanuka
 */
public class sumOfNumbersOfGivenString {

    public static void main(String[] args) {

        String text = "1HU&6L*8k4oo1";
        int sum = 0;

        for (int i = 0; i < text.length(); i++) {
            if (Character.isDigit(text.charAt(i))) {
                sum += Character.getNumericValue(text.charAt(i));
            }
        }
        System.out.println("Sum is :" + sum);

    }
}
