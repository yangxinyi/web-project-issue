package com.mycompany.dao;

import java.util.List;

import com.mycompany.model.Member;

public interface MemberDao extends GenericDao<Member, Integer> {

	public List<Member> listAllMembers();
	
}