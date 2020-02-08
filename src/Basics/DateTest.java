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
public class DateTest {

    public static void main(String[] args) throws Exception {

        Date start = new Date();

        for (int i = 0; i < 1000000; i++) {
            System.out.println("dd");
            if (i == 1000000) {

                break;
            }
        }

        Date end = new Date();
        long diffInMillies = Math.abs(start.getTime() - end.getTime());

        System.out.println("--------fIndItemIdsFromGradesWhichNoRelationWithItem took--------------" + diffInMillies / 1000);
    }
}
