package day0122;

import java.util.Calendar;
import java.util.GregorianCalendar;


/**
 * 단편적인 날짜 정보를 얻을때 사용
 */
public class UseCalendar {

	public UseCalendar() {
		//1.객체생성: 추상클래스이므로 직접 객체화 되지 않는다.
//		Calendar cal= new Calendar();
		//-> static method인 getInstance() 사용
		Calendar cal= Calendar.getInstance();
		
		//-> 자식 클래스를 사용하는 방법 : is a 관계 객체화(상속관계)
		Calendar cal2= new GregorianCalendar();
		
		System.out.println("cal:" + cal);
		System.out.println("cal2:" + cal2);
		
		StringBuilder sb= new StringBuilder();
		int year= cal.get(Calendar.YEAR);
//		int year=cal.get(1);	//년도얻기, 가독성저하
		
		int month=cal.get(Calendar.MONTH)+1;
		
		sb.append(year).append("년");
		sb.append(month).append("월");
		sb.append(cal.get(Calendar.DAY_OF_MONTH)).append("일\n");
		sb.append("오늘은 이번년의 ")
		.append(cal.get(Calendar.DAY_OF_YEAR)).append("번째 날 ");
		
		//요일을 문자열로 출력 1-일요일,2-월.. 7- 금요일
		//sb.append(cal.get(Calendar.DAY_OF_WEEK)).append("요일");
		
		int dayOfWeek= cal.get(Calendar.DAY_OF_WEEK);
		sb.append(dayOfWeek).append("요일 ");
		sb.append( "일,월,화,수,목,금,토".split(",")[dayOfWeek-1]).append("요일");
		
		int amPm= cal.get(Calendar.AM_PM);		//오전: 0, 오후: 1
		sb.append(amPm).append(" ");
		sb.append("오전,오후".split(",")[amPm]).append(" ");
		
		sb.append(cal.get(Calendar.HOUR)).append("(")
		.append(cal.get(Calendar.HOUR_OF_DAY)).append("):");
		
		sb.append(cal.get(Calendar.MINUTE)).append(" : ");
		sb.append(cal.get(Calendar.SECOND)).append(" ");
	
		System.out.println(sb);
		
		System.out.println("-----------------------------------------------");
		//생성된 객체의 특정 일 변경
		
		cal.set(Calendar.YEAR,2023);			//년도 변경
		cal.set(Calendar.MONTH,3);				//월 변경 (1 적게 설정)
//		cal.set(Calendar.DAY_OF_MONTH,2);		//일 변경 
		//현재 월에 존재하지 않는 일로 설정하면 자바에 자동으로 다음 달 1일로 변경
		cal.set(Calendar.DAY_OF_MONTH,31);		//일 변경 
		
		
		System.out.println(cal.get(Calendar.YEAR));
		System.out.println(cal.get(Calendar.MONTH)+1);
		System.out.println(cal.get(Calendar.DAY_OF_MONTH));
		System.out.println(cal.get(Calendar.DAY_OF_WEEK));
		
		
		
		
	}//UseCalendar
	
	public static void main(String[] args) {
		new UseCalendar();
	}//main

}//class
