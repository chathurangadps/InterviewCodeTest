/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HashtableExample;

/**
 *
 * @author Bhanuka
 */
public interface PhoneBook {

    public void add(String number, String name);

    public void find(String Number);

    public void remove(String Number);

    public void showall();
}
