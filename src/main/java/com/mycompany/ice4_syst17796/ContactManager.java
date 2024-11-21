/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ice4_syst17796;

/**
 *
 * @author Druar
 */
public class ContactManager {
    private Contact[] contactList;
    
    public Contact[] getContactList() {return this.contactList;}
    public void setContactList(Contact[] contactList) {this.contactList = contactList;}
    
    public ContactManager(Contact[] contactList) {
        this.contactList = contactList;
    }

    /*
	Locate a Contact record that matches the email address provided.
	Returns the Contact record if found, null if not found.
    */
    public Contact findContact(String emailAddress) {
        for (Contact contact: contactList) {
            if (contact.getEmailAddress().equals(emailAddress)) {
                return contact;
            }
        }
        return null;
    }
    

    /*
	 Removes all contacts
    */
    public void clearContacts() {}

}
