/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Accelero;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author bhanuka
 */
public class FindDuplicatesInArray {

    public static void main(String[] args) {

        int myArry[] = {1, 4, 3, 2, 5, 5, 5, 5, 5, 6, 8, 9, 6, 4, 5, 3, 2, 3, 3, 100};

        Map<Integer, Integer> repetetion = new HashMap<>();

        for (int i = 0; i < myArry.length; i++) {
            int item = myArry[i];

            if (repetetion.containsKey(item)) {
                repetetion.put(item, repetetion.get(item) + 1);
            } else {
                repetetion.put(item, 1);
            }
        }

        System.out.println("Repetetions " + repetetion);
    }
}
