/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Inheritance;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author bhanuka
 */
public class Car extends Vehicle {

    public static void main(String[] args) {
        Vehicle v = new Car();
        v.speed = 100;
        
        List<Integer> l = new ArrayList<>();
        l.add(1);
        l.size();
        
        System.out.println(v.speed);
    }
    
    
    public void m(){
    
    }
}
