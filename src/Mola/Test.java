/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mola;

/**
 *
 * @author bhanuka
 */
public class Test {
    
    static int count =0;

    public Test() {
        count++;
    }
    
    
    
    public static void main(String[] args) {
        
        for (int i = 0; i < 10; i++) {
            Test t = new Test();
        }
        
        System.out.println(count);
    }
    
}
