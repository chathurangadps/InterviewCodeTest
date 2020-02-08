/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Accelero;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 *
 * @author bhanuka
 */
public class SortStudentAccordingtoAge {

    public static void main(String[] args) {

        Student s1 = new Student();
        s1.setName("Rajitha");
        s1.setAge(27);
        s1.setAddress("Rathnapura");

        Student s2 = new Student();
        s2.setName("Bhanuka");
        s2.setAge(28);
        s2.setAddress("Colombo");

        Student s3 = new Student();
        s3.setName("Sajith");
        s3.setAge(29);
        s3.setAddress("Udawela");

        Student s4 = new Student();
        s4.setName("Rasali");
        s4.setAge(25);
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

        Collections.sort(students, new CustomComparator());

        for (Student student : students) {
            System.out.println(student.getName());
        }

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

class CustomComparator implements Comparator<Student> {

    
    @Override
    public int compare(Student o1, Student o2) {
        return o1.getAge() - o2.getAge();
    }

}
