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
public class GetMaxValueFromArray {

    public static void main(String[] args) {

        int arr[] = {100, 6, 3, 7, 87, 34, 65, 120};

        int temp = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > temp) {
                temp = arr[i];
            }
        }

        System.out.println("Max Value is :" + temp);
    }
}
