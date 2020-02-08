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
public class CloserToZero {

    public static void main(String[] args) {
        int data[] = {13, 54, 65, -37, -8, 97, 4};

        int closeNumber = data[0];

        for (int i = 0; i < data.length; i++) {
            if (data[i] * data[i] <= data[0] * data[0]) {
                closeNumber = data[i];
            }
        }

        System.out.println("close to 0 is " + closeNumber);
    }
}
