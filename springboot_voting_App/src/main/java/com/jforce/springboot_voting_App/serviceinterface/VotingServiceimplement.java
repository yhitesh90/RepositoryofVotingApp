package com.jforce.springboot_voting_App.serviceinterface;

import java.util.List;


import com.jforce.springboot_voting_App.dto.User;
import com.jforce.springboot_voting_App.dto.Vote;
//import com.jforce.springboot_voting_App.dto.Vote;

public interface VotingServiceimplement {
	
	public User saveVoting(User user);
	public User updateVoting(User user);
	public List<User> findAll();
	public Vote saveVoting(Vote vote);
	public int getOptionVoteCount(int optionId);
	public boolean hasUserVoted(int userId);

	 
}
