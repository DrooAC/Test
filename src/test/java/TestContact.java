/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import com.mycompany.ice4_syst17796.Contact;
import com.mycompany.ice4_syst17796.ContactManager;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Druar
 */
public class TestContact {
    
    private ContactManager contactManager;
    
    public TestContact() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
     
    @BeforeEach
    public void createExampleContactList() {
        Contact[] contactList = new Contact[3];
        String[] firstNames = {"test1", "test2", "test3"};
        String[] lastNames = {"1", "2", "3"};
        String[] emails = {"dru@dru.com", "test@test.com", "ihate@junit.com"};
        
        for (int i = 0; i < contactList.length; i++) {
            contactList[i] = new Contact(firstNames[i], lastNames[i], emails[i]);
        }
        
        this.contactManager = new ContactManager(contactList);
    }
    
    // This tests for when the contact is in the contactList
    @Test
    public void testFindContactGood() {
        Contact contact = this.contactManager.findContact("ihate@junit.com");
        
        boolean expResult = true;
        boolean result = (contact.getFirstName().equals("test3") && contact.getLastName().equals("3"));
        
        assertEquals(expResult, result);
    }
    
    // This tests for when the contact is NOT in the contactList
    @Test
    public void testFindContactBad() {
        Contact expResult = null;
        Contact result = this.contactManager.findContact("ilove@junit.com");
        
        assertEquals(expResult, result);
    }
    
    // This tests for when the emailAddress argument is null.
    @Test
    public void testFindContactBoundary1() {
        Contact expResult = null;
        Contact result = this.contactManager.findContact(null);
        
        assertEquals(expResult, result);
    }
    
    // This tests for when the emailAddress argument is empty string.
    @Test
    public void testFindContactBoundary2() {
        Contact expResult = null;
        Contact result = this.contactManager.findContact("");
        
        assertEquals(expResult, result);
    }
    
    // This tests for when the emailAddress argument is all caps.
    @Test
    public void testFindContactBoundary3() {        
        Contact expResult = null;
        Contact result = this.contactManager.findContact("TEST@TEST.COM");
        
        assertEquals(expResult, result);
    }
}

