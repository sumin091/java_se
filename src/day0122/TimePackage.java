package day0122;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

/**
 * JDK1.8에서 지원하는 날짜 관련 클래스
 */
public class TimePackage {

	public TimePackage() {
		
//		LocalDate ld= new LocalDate();	//생성자가 없으므로 객체화 불가
		
		//현재 날짜 정보만
		LocalDate ld= LocalDate.now();
		//현재 시간 정보만
		LocalTime lt=LocalTime.now();
		//현재 날짜와 시간 정보
		LocalDateTime ldt=LocalDateTime.now();
		
		System.out.println("날짜:"+ld);
		System.out.println("시간:"+lt);
		System.out.println("날짜와 시간:"+ldt);
		
		System.out.println("---------------------------------");
		//특정날짜정보: of()
		//현재 날짜 정보만
		LocalDate ld2= LocalDate.of(2025,2,12);
		//현재 시간 정보만
		LocalTime lt2=LocalTime.of(17,50,10);
		//현재 날짜와 시간 정보
//		LocalDateTime ldt2=LocalDateTime.of(2024,3,1,14,15);
		LocalDateTime ldt2= LocalDateTime.of(ld2, lt2);
		
		System.out.println("날짜:"+ld2);
		System.out.println("시간:"+lt2);
		System.out.println("날짜와 시간:"+ldt2);
	}//TimePackage
	
	public static void main(String[] args) {
		new TimePackage();
	}//main

}//class
