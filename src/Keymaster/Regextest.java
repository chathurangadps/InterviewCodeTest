/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Keymaster;

/**
 *
 * @author bhanuka
 */
public class Regextest {
    public static void main(String[] args) {
        String consumerKey= "deleteroute1.blackboard.com";
        String[] cKey = consumerKey.split("\\.");
        System.out.println(cKey[0]);
    }
}
