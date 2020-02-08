/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mola;

import java.util.ArrayList;

/**
 *
 * @author bhanuka
 */
interface calculations {

    abstract int getAbove30Age(ArrayList<Student> students);

}

public class GetAbove30 implements calculations {

    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setName("Rajitha");
        s1.setAge(27);
        s1.setAddress("Rathnapura");

        Student s2 = new Student();
        s2.setName("Bhanuka");
        s2.setAge(31);
        s2.setAddress("Colombo");

        Student s3 = new Student();
        s3.setName("Sajith");
        s3.setAge(29);
        s3.setAddress("Udawela");

        Student s4 = new Student();
        s4.setName("Rasali");
        s4.setAge(32);
        s4.setAddress("Mathara");

        Student s5 = new Student();
        s5.setName("Wasantha");
        s5.setAge(24);
        s5.setAddress("Kegalle");

        ArrayList<Student> students = new ArrayList<>();
        students.add(s1);
        students.add(s2);
        students.add(s3);
        students.add(s4);
        students.add(s5);

        GetAbove30 above30 = new GetAbove30();
        int countofabove30 = above30.getAbove30Age(students);
        System.out.println("People who is above 30 : " + countofabove30);
    }

    @Override
    public int getAbove30Age(ArrayList<Student> students) {

        int count = 0;

        for (Student student : students) {
            if (student.getAge() > 30) {
                count++;
            }
        }

        return count;
    }

}

class Student {

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
