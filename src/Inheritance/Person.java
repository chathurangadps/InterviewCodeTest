/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Inheritance;

/**
 *
 * @author bhanuka
 */
public class Person {

    String name, address;
    int age;

    public Person(int age, String name, String address) {
        this.age = age;
        this.name = name;
        this.address = address;
    }

    public String getNaked() {
        return "Naked Girl";
    }
}

class Employee extends Person {

    float salary;

    public Employee(int age, String name, String address, float salary) {
        super(age, name, address);
        this.salary = salary;
    }

    void m() {
        String s = super.address;
        String getNaked = super.getNaked();
    }

    @Override
    public String getNaked() {
        return super.getNaked(); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}

class Test {

    public static void main(String args[]) {
        Employee e = new Employee(22, "Mukesh", "Delhi", 90000);
        System.out.println("Name: " + e.name + " Salary: " + e.salary + " Age: " + e.age + " Address: " + e.address);
    }
}
