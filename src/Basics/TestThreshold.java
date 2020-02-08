/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Basics;

import java.util.Date;

/**
 *
 * @author bhanuka
 */
public class TestThreshold {
    public static void main(String[] args) {
        long now = new Date().getTime();
        Date d = new Date(now - 30000);
        
        System.out.println(d);
        
    }
}
