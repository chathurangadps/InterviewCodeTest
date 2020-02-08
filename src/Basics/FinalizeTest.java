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
public class FinalizeTest {

    int j = 12;

    void add() {
        j = j + 12;
        System.out.println("J=" + j);
    }

    public void finalize() {
        System.out.println("Object is garbage collected");
    }

    public static void main(String[] args) {
        new FinalizeTest().add();
        System.gc();
        new FinalizeTest().add();
    }
}
