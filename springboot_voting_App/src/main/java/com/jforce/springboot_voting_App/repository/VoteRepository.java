package com.jforce.springboot_voting_App.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.jforce.springboot_voting_App.dto.VoteCount;

@Repository
public class VoteRepository {

	
    @Autowired
    private JdbcTemplate jdbcTemplate;
    
    public List<VoteCount> getVoteCounts() {
        return jdbcTemplate.query("SELECT candidate, COUNT(*) AS count FROM vote GROUP BY candidate",
            (rs, rowNum) -> new VoteCount(rs.getString("candidate"), rs.getInt("count")));
    }
}
