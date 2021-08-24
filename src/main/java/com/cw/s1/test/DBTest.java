package com.cw.s1.test;

import java.sql.Connection;
import java.util.ArrayList;

import com.cw.s1.bankbook.BankBookDAO;
import com.cw.s1.bankbook.BankBookDTO;
import com.cw.s1.util.DBConnector;

public class DBTest {

	public static void main(String[] args) {
		//Test 용도
		DBConnector dbConnector=new DBConnector();
		Connection con=dbConnector.getConnect();
		System.out.println(con);
		
		BankBookDAO bankBookDAO = new BankBookDAO();
		BankBookDTO bankBookDTO = new BankBookDTO();
		bankBookDTO.setBookNum(1000);
		bankBookDTO = bankBookDAO.getSelect(bankBookDTO);
		System.out.println(bankBookDTO.getBookName());
		
		
	
	}
}
