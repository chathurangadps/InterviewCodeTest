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
public class MapTesy {
    public static void main(String[] args) {
        Map<Integer, Integer> repetetion = new HashMap<>();
        
        repetetion.put(1, 100);
        repetetion.put(1, 101);
        repetetion.put(1, 102);
        repetetion.put(1, 103);
        
        System.out.println(repetetion);
    }
}
