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
public class Achini {

    public static void main(String[] args) {
        String txt = "Aut_canvas_stu_20200206-155330@mailinator.com";
        String newOne = "";
        
        System.out.println(txt.split("Aut_canvas_stu_")[1].split("@")[0]);

        for (int i = 0; i < txt.length(); i++) {
            if (Character.isDigit(txt.charAt(i)) || txt.charAt(i) == '-') {
                newOne += txt.charAt(i);
            }
        }

        System.out.println("Digit list :" + newOne);
    }
}
