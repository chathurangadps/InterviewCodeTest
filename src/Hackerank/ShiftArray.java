/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hackerank;

import java.util.Arrays;

/**
 *
 * @author bhanuka
 */
public class ShiftArray {

    public static void main(String[] args) {
        int array[] = {1, 2, 3, 4, 5, 6, 7};

        int shift = 2;

        for (int i = 0; i < shift; i++) {
            int j, last;

            last = array[array.length - 1];

            for (j = array.length - 1; j > 0; j--) {   
                array[j] = array[j - 1];
            }  
            array[0] = last;
        }
        
        System.out.println(Arrays.toString(array));
    }
}
