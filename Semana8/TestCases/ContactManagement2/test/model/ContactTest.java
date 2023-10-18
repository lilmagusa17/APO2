package model;

import static org.junit.Assert.*;

import org.junit.Test;

public class ContactTest {
	
	private ContactBook contacts;
	
	private void setupScenary1() {
	}
	
	private void setUpScenary2() {
		contacts=new ContactBook();
		
	}
	
	private void setUpScenary3() {
		contacts=new ContactBook();
		
		String n = "Juan Reyes";
		String e = "jmreyes@icesi.edu.co";
		String p = "3019876543";
		
		Contact newContact = new Contact(n, e, p);
		
	}
	
	private void setUpScenary4() {
		contacts=new ContactBook();
		
		String n = "Juan Reyes";
		String e = "jmreyes@icesi.edu.co";
		String p = "3019876543";
		
		String n1 = "Juan Reyes";
		String e1 = "mreyes@icesi.edu.co";
		String p1 = "3019876543";
		
		String n2 = "Juan Reyes";
		String e2 = "reyes@icesi.edu.co";
		String p2 = "3019876543";
		
		String n4 = "Juan Reyes";
		String e4 = "mreyes@javeriana.edu.co";
		String p4 = "3019876543";
		
		String n5 = "Juan Reyes";
		String e5 = "mreyes@uao.edu.co";
		String p5 = "3019876543";
		
		contacts.add(n, e, p);
		contacts.add(n1, e1, p1);
		contacts.add(n2, e2, p2);
		contacts.add(n4, e4, p4);
		contacts.add(n5, e5, p5);
		
	}
	
		
	@Test
	public void testContact() {
		setupScenary1();
		
		String n = "Juan Reyes";
		String e = "jmreyes@icesi.edu.co";
		String p = "3019876543";
		
		Contact newContact = new Contact(n, e, p);
		
		assertNotNull("Fail creating a new contact", newContact);
		
		assertTrue("The contact name assignment fail", n.equals(newContact.getName()));
		assertTrue("The contact email assignment  fail", e.equals(newContact.getEmail()));
		assertTrue("The contact phone assignment fail", p.equals(newContact.getPhone()));
	}
	
	public void emptyBookTest() {
		setUpScenary2();
		
		String e = "jmreyes@icesi.edu.co";
		
		assertNull("The calculator is empty",contacts.search(e));
		
	}
	
	public void oneContactSuccessTest() {
		setUpScenary3();
		
	
		String n = "Juan Reyes";
		String e = "jmreyes@icesi.edu.co";
		String p = "3019876543";
		
		Contact newContact = new Contact(n, e, p);
		
		assertTrue("The contact is not the same", contacts.search(e).equals(newContact));
		
	}
	
	public void oneContactFailTest() {
		
		setUpScenary3();
		
		String n = "Juan Reyes";
		String e = "reyes@icesi.edu.co";
		String p = "3019876543";
		
		Contact newContact = new Contact(n, e, p);
		
		assertFalse("The contact was the same", contacts.search(e).equals(newContact));
		
	}
	
	public void moreContactsSuccessTest() {
		
		setUpScenary4();
		String n="pepito";
		String p="3211234345";
		String e="mreyes@uao.edu.co";
		
		Contact newContact=new Contact(n,e,p);
		
		assertEquals("The contact was not found",newContact,contacts.search(e));
		
	}
	
public void moreContactsFailTest() {
		
		setUpScenary4();
		
		String n="pepito";
		String p="3211234345";
		String e="mreyes@usaca.edu.co";
		
		Contact newContact=new Contact(n,e,p);
		
		assertNotEquals("The contact was not found",newContact,contacts.search(e));
		
	}
	
	
	
	
	
	

}
