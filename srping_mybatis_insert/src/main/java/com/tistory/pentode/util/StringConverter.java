package com.tistory.pentode.util;


public class StringConverter {
	//스트링 컨버터 클래스 나중에 예외처리할 문자들을 더 추가할 예정임 
	public String convert(String inputString) {
		
		String a = inputString;
		
		a = a.replaceAll("<", "&lt;");
		a = a.replaceAll(">", "&gt;");
		
		
		return a;
	}
	
}
