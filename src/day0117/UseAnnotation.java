package day0117;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

/**
 * 
 */
public class UseAnnotation {
	
	@Deprecated 	//비추천 메소드
	public void test() {
		System.out.println("오늘은 수요일 입니다.");
		
		Date date= new Date();
		System.out.println(date.getYear() +1900);	//deprecate method
	}//test
	
	@SuppressWarnings({"unused","rawtypes"})		//method위에 올려놓는것이 편함
//	@SuppressWarnings("rawtypes")					//다양한 어노테이션 선언시 중복상황 발생 -> 배열
	public void test2() {
//		@SuppressWarnings("unused")			//경고 무시
		int day;
		int j;
		int k;
		
//		@SuppressWarnings("rawtypes")
		List list= new ArrayList();
		
	}//test2
	
//	Override는 부모클래스가 가지고 있는 method를 자식 클래스에서 그대로 정의하는 것
	@Override	//올바른 형식으로 오버라이드 되었는지 판단하는 어노테이션 : 다른 접근제한자, 같은반환형 같은메서드명
	public String toString() {		
		return "생성된 객체의 주소가 아닌 메시지";
	}//toString
		
	public static void main(String[] args) {
		UseAnnotation ua= new UseAnnotation();
		ua.test();
		
		Date d= new Date();
		SimpleDateFormat sdf= new SimpleDateFormat();
		
		//객체 다형성: 모두(ua,d,sdf) Object을 기본으로 상속받아 overriding하기에 출력시 모두 다른값을 찍어낸다. 
		System.out.println(ua);   //ua 객체(인스턴스) 출력: heap주소 출력 -> toString 오버라이딩 -> 내가 입력한 메시지 출력
		System.out.println(d);	  //자바제공 객체: 메시지
		System.out.println(sdf);  //자바제공 객체: 주소
		
		int i=10;
		System.out.println(i);
		long l=20;
		System.out.println(l);
	}//main

}//class
