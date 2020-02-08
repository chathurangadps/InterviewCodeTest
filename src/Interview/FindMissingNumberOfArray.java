/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interview;

/**
 *
 * @author bhanuka
 */
public class FindMissingNumberOfArray {

    public static void main(String[] args) {

        int myarr[] = {1, 2, 3, 4, 5, 6, 7, 9};
        int missing = 0;

        int sumofAll = 9 * (9 + 1) / 2;
        int summofArray = 0;

        for (int i = 0; i < myarr.length; i++) {
            summofArray += myarr[i];
        }

        missing = sumofAll - summofArray;

        System.out.println("missing -" + missing);

    }
}
