/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interview;

import java.util.HashMap;

/**
 *
 * @author bhanuka
 */
public class FindDuplicatesInArray {

    public static void main(String[] args) {

        int myArry[] = {1, 4, 3, 2, 5, 6, 8, 9, 6, 4, 5, 3, 2, 3, 3,100};


        HashMap<Integer, Integer> repetitions = new HashMap<Integer, Integer>();

        for (int i = 0; i < myArry.length; ++i) {
            int item = myArry[i];

            if (repetitions.containsKey(item)) {
                repetitions.put(item, repetitions.get(item) + 1);
            } else {
                repetitions.put(item, 1);
            }
        }

        System.out.println(repetitions);

    }
}
