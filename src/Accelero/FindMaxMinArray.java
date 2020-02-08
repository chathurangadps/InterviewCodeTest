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
public class FindMaxMinArray {

    public static void main(String[] args) {
        int arr[] = {2, 64, 43, 767, 23, 76, 3, 32, 6, 12};

        int min = arr[0];
        int max = arr[0];

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] > max) {
                max = arr[i];
            }
            
            if (arr[i] < min) {
                min = arr[i];
            }
        }

        System.out.print("\nThe smallest value is: " + min);
        System.out.print("\nThe largest value is: " + max);
    }
}
