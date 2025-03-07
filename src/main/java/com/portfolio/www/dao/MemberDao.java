package com.portfolio.www.dao;

import java.util.Arrays;
import java.util.HashMap;

import javax.sql.*;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jdbc.core.JdbcTemplate;

public class MemberDao extends JdbcTemplate {
	private final static Logger log = LoggerFactory.getLogger(MemberDao.class);
	
	public MemberDao() {
		// TODO Auto-generated constructor stub
	}
	
	public MemberDao(DataSource ds) {
		super(ds);
		log.info("ds : "+ ds);
	}
	
	public int join(HashMap<String,String> params) {

		String sql = "INSERT INTO member "
				+ "( member_id, passwd, member_nm, email, auth_yn, pwd_chng_dtm, join_dtm) "
				+ "VALUES( ?, ?, ?, ?, 'N', '', DATE_FORMAT(now(),'%Y%m%d%H%i%s'))";
		
		Object[] args = { params.get("memberId"),params.get("passwd"), params.get("memberId"), params.get("email") }; 
		log.info("Arrays.toString(args) : " + Arrays.toString(args));
		return update(sql, args);
	}
	
	public int updateMemberYN(int memberSeq	) {
		String sql = " UPDATE member " 
				+ " SET auth_yn = 'Y' "
				+ " WHERE member_seq = ? "
				+ " AND auth_yn = 'N' ";
		Object[] args = { memberSeq };
		
		return update(sql, args);
	}
	
	public int getMemberCnt(String memeberId) {
		String sql = " SELECT count(1) FROM member WHERE member_id = ? ";
		Object[] args = {memeberId};
		
		return queryForObject(sql, Integer.class, args);
	}
	
	public int getMemberSeq(String memeberId) {
		String sql = " SELECT member_seq FROM member WHERE member_id = ? ";

		Object[] args = {memeberId};
		
		return queryForObject(sql, Integer.class, args);
	}
}
