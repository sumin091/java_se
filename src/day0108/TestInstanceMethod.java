package day0108;

/**
 * instance method
 *  -instance variable를 사용해 동작을 처리해야할때 사용
 *  -객체화 후 객체명으로 method호출
 *  
 * 
 */
public class TestInstanceMethod {

	int day;		//instance variable
	
	public void printDay() {
		System.out.println(day+"일");
	}//printDay
	
	public static void main(String[] args) {
//		TestInstanceMethod.printDay;		
//		인스턴스 변수는 클래스명.객체명으로 호출불가 => 객체화 후 객체명.method명으로 호출
		
		TestInstanceMethod tim= new TestInstanceMethod();	//인스턴스화
		tim.day=8;	//instance variable 사용
		
		tim.printDay();	//instance variable 호출
		tim.day++;
		tim.printDay();
	}//main

}//class
