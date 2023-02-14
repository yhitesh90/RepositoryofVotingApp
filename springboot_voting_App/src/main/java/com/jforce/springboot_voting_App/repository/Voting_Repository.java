package com.jforce.springboot_voting_App.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.jforce.springboot_voting_App.dto.User;

@Repository
public interface Voting_Repository extends JpaRepository<User, Integer> {



	public User findByUsrername(String usrername);

}
