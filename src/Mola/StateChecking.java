/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mola;

/**
 *
 * @author bhanuka
 */
public class StateChecking {

    public static void main(String[] args) {
        Man s1 = new Man();
        s1.setName("Nuwan");
        s1.setAge(27);
        s1.setAddress("Rathnapura");

        Man s2 = new Man();
        s2.setName("Bhanuka");
        s2.setAge(31);
        s2.setAddress("Balangoda");

        s1 = s2;

        System.out.println("Name is : " + s1.getName());
    }
}

class Man {

    private int age;
    private String name;
    private String address;

    /**
     * @return the age
     */
    public int getAge() {
        return age;
    }

    /**
     * @param age the age to set
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the address
     */
    public String getAddress() {
        return address;
    }

    /**
     * @param address the address to set
     */
    public void setAddress(String address) {
        this.address = address;
    }

}
