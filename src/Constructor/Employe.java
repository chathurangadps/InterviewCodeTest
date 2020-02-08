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
public class Employe {

    int id, age;
    String name, address;

    public Employe(int age) {
        this.age = age;
    }

    public Employe(int id, int age) {
        this(age);
        this.id = id;
    }

    public Employe(int id, int age, String name, String address) {
        this(id, age);
        this.name = name;
        this.address = address;
    }

    public static void main(String args[]) {
        Employe emp = new Employe(105, 22, "Vikas", "Delhi");
        System.out.println("ID: " + emp.id + " Name:" + emp.name + " age:" + emp.age + " address: " + emp.address);
    }

}
