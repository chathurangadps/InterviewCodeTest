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
public class FinalTest {
    final int i;

    public FinalTest() {
        i=1000;
    }
    
    public static void main(String[] args) {
        final int j = 120;
        FinalTest finalTest =new FinalTest();
        System.out.println(finalTest.i);
    }
    
}
