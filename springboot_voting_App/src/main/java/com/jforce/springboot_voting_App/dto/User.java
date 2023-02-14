package com.jforce.springboot_voting_App.dto;

import jakarta.persistence.Entity;

 import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name = "VOTEBANK")
public class User {
	@Id
	private int id;
	private String usrername;
	private String password;
	private String emailId;
	private String phoneno;
	
	public User(int id, String usrername, String password, String emailId, String phoneno) {
		super();
		this.id = id;
		this.usrername = usrername;
		this.password = password;
		this.emailId = emailId;
		this.phoneno = phoneno;
	}
	public String getUsrername() {
		return usrername;
	}
	public void setUsrername(String usrername) {
		this.usrername = usrername;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getPhoneno() {
		return phoneno;
	}
	public void setPhoneno(String phoneno) {
		this.phoneno = phoneno;
	}

	@Override
	public String toString() {
		return "Voting [id=" + id + ", usrername=" + usrername + ", password=" + password + ", emailId=" + emailId
				+ ", phoneno=" + phoneno + "]";
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public User(String usrername, String password) {
		super();
		this.usrername = usrername;
		this.password = password;
	}
	
	
	
	
	

}
