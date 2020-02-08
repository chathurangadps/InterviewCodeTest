/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Inheritance;

/**
 *
 * @author bhanuka
 */
class Animal {

    Animal() {
        System.out.println("animal is created");
    }
    
     void m(){}
}

class Dog extends Animal {

    public Dog(int i) {
        System.out.println("this");
    }

    Dog() {
        this(1);
        System.out.println("dog is created");
    }
}

class TestSuper4 {

    public static void main(String args[]) {
        Animal d = new Dog();
    }
}
