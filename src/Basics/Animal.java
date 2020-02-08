/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Basics;

/**
 *
 * @author bhanuka
 */
public class Animal {

    Animal() {
        System.out.println("animal is created");
    }
    
     void m(){
    };
}

class Dog extends Animal {

    Dog() {
        System.out.println("dog is created");
    }
   
    
}

class TestSuper4 {

    public static void main(String args[]) {
        Dog d = new Dog();
    }
    
    
}
