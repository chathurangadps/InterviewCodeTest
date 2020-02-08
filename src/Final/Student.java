/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Final;

/**
 *
 * @author bhanuka
 */
public class Student {

    int id;
    String name;
    final String PAN_CARD_NUMBER;

    public Student(int id, String name, String PAN_CARD_NUMBER) {
        this.id = id;
        this.name = name;
        this.PAN_CARD_NUMBER = PAN_CARD_NUMBER;
    }

}
