/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hackerank;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author bhanuka
 */
public class SockMerchant {

    public static void main(String[] args) {
        int ar[] = {10, 20, 20, 10, 10, 30, 50, 10, 20, 50, 50};

        Map<Integer, Integer> colours = new HashMap<>();

        for (int i = 0; i < ar.length; i++) {
            int sock = ar[i];

            if (colours.containsKey(sock)) {
                colours.put(sock, colours.get(sock) + 1);
            } else {
                colours.put(sock, 1);
            }
        }
        
        int pairs = 0;
        
        
        for (Map.Entry<Integer, Integer> entry : colours.entrySet()) {
            if (entry.getValue()> 1) {
                pairs += entry.getValue()/2;
            }

        }

        System.out.println("pairs "+ pairs);
    }
}
