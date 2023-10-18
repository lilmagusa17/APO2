package model;

import java.util.List;

public class ContactBook {
	
	List<Contact> contactos;
	
	public ContactBook() {
		
	}
	
	public List<Contact> getContacts(){
		return null;
	}
	
	public boolean add(String name, String email, String phone) {
		contactos.add(new Contact(name,email,phone));
		return true;
	}
	
	public Contact search(String email) {
		
		for(int i=0;i<contactos.size();i++) {
			if(contactos.get(i).getEmail().equals(email)) {
				return contactos.get(i);
			}
		}
		return null;
			
		
	}
	
	public Contact remove(String email) {
		
		Contact found=null;
		for(int i=0;i<contactos.size();i++) {
			if(contactos.get(i).getEmail().equals(email)) {
				found=contactos.get(i);
				contactos.remove(i);
			}
		}
		return found;
		
	}
}
