/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ice4_syst17796;

/**
 *
 * @author Druar
 */
public class Contact {
    private String firstName;
    private String lastName;
    private String emailAddress;
    
    public String getFirstName() {return this.firstName;}
    public void setFirstName(String firstName) {this.firstName = firstName;}
    
    public String getLastName() {return this.lastName;}
    public void setLastName(String lastName) {this.lastName = lastName;}
    
    public String getEmailAddress() {return this.emailAddress;}
    public void setEmailAddress(String emailAddress) {this.emailAddress = emailAddress;}
    
    public Contact(String firstName, String lastName, String emailAddress) {
        setFirstName(firstName);
        setLastName(lastName);
        setEmailAddress(emailAddress);
    }
}
