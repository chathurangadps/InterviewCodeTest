/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CodeTest;

/**
 *
 * @author bhanuka
 */
public class reverseText {
    public static void main(String[] args) {
        String txt = "Bhanuka";
        String reverseText="";
        
        System.out.println("txt.length()" +txt.length());
        
        for (int i = txt.length()-1; i >= 0; i--) {
            reverseText +=txt.charAt(i);
        }
        
        System.out.println("This is reverse text : " + reverseText);
    }
}
