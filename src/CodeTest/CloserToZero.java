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
public class CloserToZero {

    public static void main(String[] args) {

        int data[] = {13, 54, 65, -37, -8, 97, 4};

        int near = data[0];

        // Arrays.sort(data);
        for (int i = 0; i < data.length; i++) {

            if (data[i] * data[i] <= (near * near)) {
                near = data[i];
            }
        }
        System.out.println(near);

    }
}
