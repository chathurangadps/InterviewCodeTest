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
public class FindMissingNumberOfArray {

    public static void main(String[] args) {
        int myarr[] = {1, 2, 3, 4, 5, 6, 7, 9};

        int missing = 0;
        int sum;
        int sumofarray = 0;

        sum = 9 * (9 + 1) / 2;

        for (int i = 0; i < myarr.length; i++) {
            sumofarray += myarr[i];
        }

        System.out.println("Missing is : " + (sum - sumofarray));
    }
}
