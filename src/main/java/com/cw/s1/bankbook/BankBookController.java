package com.cw.s1.bankbook;

import java.io.IOException;
import java.util.ArrayList;

import javax.security.auth.message.callback.PrivateKeyCallback.Request;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class BankBookController {
	private BankBookDAO bankBookDAO;
	
	public BankBookController() {
		bankBookDAO = new BankBookDAO();
	}
	
	public void start(HttpServletRequest request, HttpServletResponse response) {
		System.out.println("BankBook Controller 실행");
		
		String uri = request.getRequestURI();
		String path="";
		String [] strs = uri.split("/");
		path=strs[3];
		
		if(path.equals("bankbookList.do")) {
			System.out.println("상품 목록");
			ArrayList<BankBookDTO> ar = bankBookDAO.getList();
			//for(모은타입명 변수명:컬렉션참조변수명) 
			for(BankBookDTO bankBookDTO:ar) {
				System.out.println(bankBookDTO.getBookName());
			}
			RequestDispatcher view = request.getRequestDispatcher("../WEB-INF/views/bankbook/bankbookList.jsp");
			try {
				view.forward(request, response);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
		} else if(path.equals("bankbookInsert.do")) {
			System.out.println("상품 등록");
		} else if(path.equals("bankbookSelect.do")) {
			System.out.println("상품 상세 조회");
			String num=request.getParameter("bookNum");
			System.out.println(num);
			long num2=Long.parseLong(num);
			BankBookDTO bankBookDTO = new BankBookDTO();
			bankBookDTO.setBookNum(num2);
			bankBookDTO = bankBookDAO.getSelect(bankBookDTO);
			System.out.println(bankBookDTO.getBookName());
			
			RequestDispatcher view = request.getRequestDispatcher("../WEB-INF/views/bankbook/bankbookSelect.jsp");
			try {
				view.forward(request, response);
			} catch (Exception e) {
				e.printStackTrace();
			} 
		} else {
			System.out.println("그 외 나머지");
		}
		System.out.println(path);
		System.out.println(request.getPathInfo());
	}

}
