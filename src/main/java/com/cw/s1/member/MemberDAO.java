package com.cw.s1.member;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.cw.s1.util.DBConnector;

public class MemberDAO {
	
	private DBConnector dbConnector;
	
	public MemberDAO() {
		dbConnector = new DBConnector();
	}
	
	public int memberJoin(MemberDTO memberDTO) throws Exception{
		Connection con=dbConnector.getConnect();
		PreparedStatement st=null;
		ResultSet rs=null;
		int result = 0;
		
		String sql="INSERT INTO MEMBER VALUES (?, ?, ?, ?, ?)";
		
		st=con.prepareStatement(sql);
		st.setString(1, memberDTO.getId());
		st.setString(2, memberDTO.getPw());
		st.setString(3, memberDTO.getName());
		st.setString(4, memberDTO.getPhone());
		st.setString(5, memberDTO.getEmail());
		result = st.executeUpdate();
			
		dbConnector.disConnect(st, con);
		
		return result;
				
	}
	

}
