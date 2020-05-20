package Constructor;

public class TestConstructor1 {

    TestConstructor1(int a, int b) {
        System.out.println("a = " + a + " b = " + b);
    }

    TestConstructor1(int a, float b) {
        System.out.println(" b = " + b + "a = " + a);
    }

    public static void main(String args[]) {
        byte a = 10;
        byte b = 15;
        TestConstructor1 test = new TestConstructor1(a, b);
    }

}