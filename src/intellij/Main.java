/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package intellij;

import java.util.Random;

/**
 *
 * @author Bhanuka
 */
public class Main {

    //Intellij IDEA 14 License Key
    public static void main(String[] args) {
        KeyGenerator keyGenerator = new KeyGenerator();
        String name = "Gurkan CAKIR";

        Random r = new Random();
        System.out.println(keyGenerator.MakeKey(name, 0, r.nextInt(100000)));
    }
}
