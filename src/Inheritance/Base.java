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
public class Base {

    public Base() {
        System.out.println("Base ----called ...");
    }
    
    

    public void baseMethod() {
        System.out.println("BaseMethod called ...");
    }
}

class Derived extends Base {

    public Derived() {
        System.out.println("Derived ----called ...");
    }
    

    public void baseMethod() {
        System.out.println("Derived method called ...");
    }
}

 class Testy {

    public static void main(String args[]) {
        Base b = new Derived();
        b.baseMethod();
    }
}
