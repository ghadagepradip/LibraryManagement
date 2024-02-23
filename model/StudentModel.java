package libraryapp.model;

import java.util.Stack;

public class StudentModel {
	private int sid;
	private String name;
	private String email;
	private String contact;
	private Stack stak =new Stack();
	public Stack getStak() {
		return stak;
	}
	public int getSid() {
		return sid; 
	}
	public StudentModel() {
	
	}
	public StudentModel(String name, String email, String contact) {
	
		this.name = name;
		this.email = email;
		this.contact = contact;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	

}
