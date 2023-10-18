package model;

public class Contact {
	
	String name;
	String email;
	String phone;
	
	public Contact(String n, String e, String p) {
		this.name=n;
		this.email=e;
		this.phone=p;
		
	
	}
	
	public String getName() {
		return name;
	}
	public String getEmail() {
		return email;
	}
	public String getPhone() {
		return phone;
	}
	
	public boolean equals(Contact c) {
		if(c.getEmail().equals(email))
			return true;
		else
			return false;
	}
	
}
