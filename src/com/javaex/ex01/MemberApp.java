package com.javaex.ex01;

public class MemberApp {

	public static void main(String[] args) {

		Member M01 = new Member();
		M01.setName("정우성");
		M01.setId("jws");
		M01.setPoint(50000);
		M01.showInfo();
			
		Member M02 = new Member();
		M02.setName("유재석");
		M02.setId("yjs");
		M02.setPoint(30000);
		M02.showInfo();
		
		Member M03 = new Member(); 
		M03.setName("이효리");
		M03.setId("lhr");
		M03.setPoint(40000);
		M03.showInfo();
				
	}

}
