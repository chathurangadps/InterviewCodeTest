/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Omobio;

import java.util.Arrays;

/**
 *
 * @author bhanuka
 */
public class SortArray {

    public static void main(String[] args) {
        int myArr[] = {100, 45, 2, 32, 5, 75, 42, 32};

        for (int i = 1; i < myArr.length; i++) {
            for (int j = i; j > 0; j--) {
                if (myArr[j] < myArr[j - 1]) {
                    int temp = myArr[j];
                    myArr[j] = myArr[j - 1];
                    myArr[j - 1] = temp;
                }
            }
        }

        System.out.println("Sort array :" + Arrays.toString(myArr));
    }
}
