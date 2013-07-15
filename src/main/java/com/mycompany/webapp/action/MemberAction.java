package com.mycompany.webapp.action;

import java.util.ArrayList;
import java.util.List;

import com.mycompany.model.Member;
import com.mycompany.service.MemberManager;


public class MemberAction extends BaseAction{
	private static final long serialVersionUID = 7775572588462277973L;
	private MemberManager memberManager;
	private String testName;
	private Member member;
	private Integer memberId;
	private List<Member> members = new ArrayList<Member>();
	
	public String actionTest() {
		testName = "北京";
		return SUCCESS;
	}
	
	public String memberFind() {
		member = memberManager.get(member.getId());
		testName = "测试用户";
		System.out.println(testName);
		return SUCCESS;
	}
	
	public String memberCreate() {
		member = memberManager.save(member);
		log.info("new member id :" + member.getId());
		return SUCCESS;
	}
	
	public String listMember() {
		members = memberManager.getAllMembers();
		return SUCCESS;
	}

	public String getTestName() {
		return testName;
	}

	public void setTestName(String testName) {
		this.testName = testName;
	}

	public List<Member> getMembers() {
		return members;
	}

	public void setMembers(List<Member> members) {
		this.members = members;
	}

	public MemberManager getMemberManager() {
		return memberManager;
	}

	public void setMemberManager(MemberManager memberManager) {
		this.memberManager = memberManager;
	}

	public Member getMember() {
		return member;
	}

	public void setMember(Member member) {
		this.member = member;
	}

	public Integer getMemberId() {
		return memberId;
	}

	public void setMemberId(Integer memberId) {
		this.memberId = memberId;
	}
	
}