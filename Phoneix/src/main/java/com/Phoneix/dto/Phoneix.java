package com.Phoneix.dto;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Phoneix {
	@Id
	private String Email;
	private String Frist_Name;
	private String Last_Name;
	private String Address;
	private String Password;
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getFrist_Name() {
		return Frist_Name;
	}
	public void setFrist_Name(String frist_Name) {
		Frist_Name = frist_Name;
	}
	public String getLast_Name() {
		return Last_Name;
	}
	public void setLast_Name(String last_Name) {
		Last_Name = last_Name;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	@Override
	public String toString() {
		return "Phoneix [Email=" + Email + ", Frist_Name=" + Frist_Name + ", Last_Name=" + Last_Name + ", Address="
				+ Address + ", Password=" + Password + "]";
	}
	
	
}
