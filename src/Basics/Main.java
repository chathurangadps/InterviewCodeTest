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
class Base {

    void method(int a) {
        System.out.println("Base class method called with integer a = " + a);
    }

    void method(double d) {
        System.out.println("Base class method called with double d =" + d);
    }
}

class Derived extends Base {

    @Override
    void method(double d) {
        System.out.println("Derived class method called with double d =" + d);
    }
}

public class Main {

    public static void main(String[] args) {
        new Derived().method(10.0);

        try {
        } finally {
        }

    }

}
