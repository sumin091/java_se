package day0119;

import java.util.Date;

import javax.xml.crypto.Data;
/**
 * 날짜 관련 클래스: 
 * 자바에서 유일하게 날짜 정보를 얻을 수 있는 클래스는 system클래스하고
 * currentTimeMillis()를 사용하여 1970.01.01 00:00:00 초부터 현재까지 시간을 ms로 반환
 */
public class UseDate {

	public UseDate() {
		//1.생성
		Date d= new Date();
		System.out.println(d);	//data가 toString override를 했기때문
		//2.method는 비추천 많아 생략
		

	}//UseDate
	
	public static void main(String[] args) {
		new UseDate();
		
		long l= System.currentTimeMillis();
		System.out.println(l);
		Date d= new Date(l);
		System.out.println(d);
		
	}//main

}//class
