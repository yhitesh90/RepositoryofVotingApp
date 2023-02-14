package com.jforce.springboot_voting_App.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jforce.springboot_voting_App.dto.Vote;
@Repository
public interface Vote_Repository extends JpaRepository<Vote, Integer> {
	
	

}
