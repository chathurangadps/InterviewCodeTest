/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Basics;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author bhanuka
 */
public class Settt {

    public static void main(String[] args) {
        Set<String> sentinels = new HashSet<>();
        sentinels.add("127.0.0.1:26379");
        sentinels.add("127.0.0.1:26380");
        sentinels.add("127.0.0.1:26381");
        
        
        System.out.println(sentinels);
    }

}
