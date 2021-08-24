package com.cw.s1.member;

import javax.servlet.http.HttpServletRequest;

public class MemberController {
	
	public void start(HttpServletRequest request) {
		String uri = request.getRequestURI();
		String path="";
		
		int index=uri.lastIndexOf("/");
		path = uri.substring(index+1);
		
		System.out.println(path);
		
		if(path.equals("memberLogin.do")) {
			System.out.println("로그인 진행");
			String id = request.getParameter("id");
			System.out.println(id);
			String pw = request.getParameter("pw");
			System.out.println(pw);
			
		} else if(path.equals("memberJoin.do")) {
			System.out.println("회원가입 진행");
		} else if(path.equals("memberPage.do")) {
			System.out.println("my Page 진행");
		} else {
			System.out.println("그 외 나머지");
		}
		
	}

}
