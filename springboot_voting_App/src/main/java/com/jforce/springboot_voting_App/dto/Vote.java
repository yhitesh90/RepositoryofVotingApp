package com.jforce.springboot_voting_App.dto;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Vote")
public class Vote {
	@Id
	private int userId;
	private String candidate;


	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getCandidate() {
		return candidate;
	}
	public void setCandidate(String candidate) {
		this.candidate = candidate;
	}
	public Vote(int userId, String candidate) {
		super();
		this.userId = userId;
		this.candidate = candidate;
	}
	public Vote() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Vote [userId=" + userId + ", candidate=" + candidate + "]";
	}
	

	
	
	

	
	
	

}
