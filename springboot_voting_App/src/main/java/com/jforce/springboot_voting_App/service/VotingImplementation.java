package com.jforce.springboot_voting_App.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jforce.springboot_voting_App.dto.User;
import com.jforce.springboot_voting_App.dto.Vote;
import com.jforce.springboot_voting_App.repository.Vote_Repository;
//import com.jforce.springboot_voting_App.dto.Vote;
//import com.jforce.springboot_voting_App.repository.Vote_Repository;
import com.jforce.springboot_voting_App.repository.Voting_Repository;
import com.jforce.springboot_voting_App.serviceinterface.VotingServiceimplement;

@Service
public class VotingImplementation implements VotingServiceimplement  {

	@Autowired
	private Voting_Repository repository;
	private Vote_Repository repository1;
	@Override
	public User saveVoting(User user) {
		// TODO Auto-generated method stub
		return repository.save(user);
	}

	@Override
	public User updateVoting(User user) {
		// TODO Auto-generated method stub
		return repository.save(user);
	}

	@Override
	public List<User> findAll() {
		// TODO Auto-generated method stub
		return (List<User>) repository.findAll();
	}

    
    public int getOptionVoteCount(int optionId)
    {
    	 ((VotingServiceimplement) repository1).getOptionVoteCount(optionId);
    	return optionId;
    }



	@Override
	public boolean hasUserVoted(int userId) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Vote saveVoting(Vote vote) {
		// TODO Auto-generated method stub
		return repository1.save(vote);
	}


	@Autowired
	public VotingImplementation(Voting_Repository repository, Vote_Repository repository1) {
		super();
		this.repository = repository;
		this.repository1 = repository1;
	}





}






	





