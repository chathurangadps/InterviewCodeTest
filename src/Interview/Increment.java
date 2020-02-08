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
public class Increment {

    public static void main(String[] args) {
        int v = 2;
        v = v + v++;
        System.out.println("v"+ v);
        v = --v;
        System.out.println("v--"+ v);
        v = ++v;

        System.out.println(v);
    }
}
