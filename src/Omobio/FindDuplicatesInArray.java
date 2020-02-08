/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Omobio;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author bhanuka
 */
public class FindDuplicatesInArray {

    public static void main(String[] args) {
        int myArry[] = {1, 4, 3, 2, 5, 5, 5, 5, 5, 6, 8, 9, 6, 4, 5, 3, 2, 5, 3, 100};

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < myArry.length; i++) {
            int Item = myArry[i];
            if (map.containsKey(Item)) {
                map.put(Item, map.get(Item) + 1);
            } else {
                map.put(Item, 1);
            }
        }
        
        
        System.out.println("item counts by each : "+ map);
    }
}
