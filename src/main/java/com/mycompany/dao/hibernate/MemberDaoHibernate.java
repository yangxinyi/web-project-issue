package com.mycompany.dao.hibernate;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.orm.hibernate4.SessionFactoryUtils;

import com.mycompany.dao.MemberDao;
import com.mycompany.model.Member;

public class MemberDaoHibernate extends GenericDaoHibernate<Member, Integer> implements MemberDao{

	public MemberDaoHibernate() {
		super(Member.class);
		// TODO Auto-generated constructor stub
	}
	
	public List<Member> listAllMembers() {
		JdbcTemplate jdbcTemplate =
                new JdbcTemplate(SessionFactoryUtils.getDataSource(getSessionFactory()));
		List results = jdbcTemplate.queryForList("select * from member");
		Iterator it= results.iterator();
		List<Member> members = new ArrayList<Member>();
	    while(it.hasNext()){
	        Map result=(Map)it.next();
	        Integer id = (Integer)result.get("id");
	        String mobile = (String)result.get("mobile");
	        Logger.getLogger(MemberDaoHibernate.class.getName()).warn("member id is :" + id + ", mobile:" + mobile);
	        Member member = new Member();
	        member.setId(id);
	        member.setMobile(mobile);
	        members.add(member);
	     }
	    return members;
	}

}