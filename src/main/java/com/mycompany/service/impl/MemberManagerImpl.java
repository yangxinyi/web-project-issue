package com.mycompany.service.impl;

import java.util.List;

import com.mycompany.dao.MemberDao;
import com.mycompany.model.Member;
import com.mycompany.service.MemberManager;

public class MemberManagerImpl extends GenericManagerImpl<Member, Integer> implements MemberManager {
	
	private MemberDao memberDao;
	
	public MemberManagerImpl(MemberDao memberDao) {
		super(memberDao);
		this.memberDao = memberDao;
	}
	
	public List<Member> getAllMembers() {
    	return memberDao.listAllMembers();
    }
	
}