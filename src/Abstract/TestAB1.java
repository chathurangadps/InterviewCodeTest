package Abstract;

public class TestAB1 {

    //Can we declare the static variables and methods in an abstract class?

    static int i = 102;

    static void TestMethod() {
        System.out.println("hi !! I am good !!");
    }
}

class TestClass extends TestAB1 {
    public static void main(String args[]) {
        TestAB1.TestMethod();
        System.out.println("i = " + TestAB1.i);
    }
}
