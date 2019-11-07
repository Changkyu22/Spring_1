package com.nuri.notice;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;
import javax.sql.DataSource;

import org.springframework.stereotype.Repository;

import com.nuri.s1.member.memberDTO;

@Repository
public class noticeDAO {
	
	@Inject
	private DataSource dataSource;
	
	public int noticeUpdate()throws Exception{
		int result = 0;
		Connection con = dataSource.getConnection();
		
		String sql = "update notice title=?, contents=? where num=?";
		
		return result;
	}
	
	public noticeDTO noticeSelect(int num)throws Exception {
		noticeDTO noticeDTO = null;
		Connection con = dataSource.getConnection();
		
		String sql = "select * from notice where num=?";
		PreparedStatement st = con.prepareStatement(sql);
		
		st.setInt(1, num);
		
		ResultSet rs = st.executeQuery();
		
		if(rs.next()) {
			noticeDTO = new noticeDTO();
			noticeDTO.setNum(rs.getInt("num"));
			noticeDTO.setTitle(rs.getString("title"));
			noticeDTO.setWriter(rs.getString("writer"));
			noticeDTO.setContents(rs.getString("contents"));
			noticeDTO.setReg_date(rs.getDate("reg_date"));
			noticeDTO.setHit(rs.getInt("hit"));
		}
		
		rs.close();
		st.close();
		con.close();
		
		
		return noticeDTO;
	}

	public List<noticeDTO> noticeList() throws Exception {
		ArrayList<noticeDTO> ar = new ArrayList<noticeDTO>();
		Connection con = dataSource.getConnection();
		
		String sql = "select * from notice order by num desc";
		
		PreparedStatement st = con.prepareStatement(sql);
		
		ResultSet rs = st.executeQuery();
		
		while(rs.next()) {
			noticeDTO noticeDTO = new noticeDTO();
			noticeDTO.setNum(rs.getInt("num"));
			noticeDTO.setTitle(rs.getString("title"));
			noticeDTO.setWriter(rs.getString("writer"));
//			noticeDTO.setContents(rs.getString("contents"));
			noticeDTO.setReg_date(rs.getDate("reg_date"));
			noticeDTO.setHit(rs.getInt("hit"));
			ar.add(noticeDTO);
		}
		
		rs.close();
		st.close();
		con.close();
		
		return ar;
	}
}
