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
public class Ambiguty {

    void msg() {
        System.out.println("Hello");
    }
}

class B {

    void msg() {
        System.out.println("Welcome");
    }
}

//class C extends Ambiguty,B{//suppose if it were  
//   
// Public Static void main(String args[]){  
//   C obj=new C();  
//   obj.msg();//Now which msg() method would be invoked?  
//}  
//
//}
