/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Constructor;

/**
 *
 * @author bhanuka
 */
public class TestConstructor {

    int i;
    int j;

    public TestConstructor() {
    }

    public TestConstructor(int i, int j) {
        this.i = i;
        this.j = j;
    }

}

class test {

    TestConstructor constructor = new TestConstructor(1, 2);
}
