package com.jforce.springboot_voting_App.dto;

public class VoteCount {
	
	private String candidate;
    private int count;
	public String getCandidate() {
		return candidate;
	}
	public void setCandidate(String candidate) {
		this.candidate = candidate;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public VoteCount(String candidate, int count) {
		super();
		this.candidate = candidate;
		this.count = count;
	}
	public VoteCount() {
		super();
		// TODO Auto-generated constructor stub
	}
    

    


}
