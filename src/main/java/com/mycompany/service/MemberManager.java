package com.mycompany.service;

import java.util.List;

import com.mycompany.model.Member;

public interface MemberManager extends GenericManager<Member, Integer> {

	/**
     * Test for jdbcTemplate
     * @return
     */
    public List<Member> getAllMembers();
	
}