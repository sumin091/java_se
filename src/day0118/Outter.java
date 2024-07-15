package day0118;

import java.awt.im.spi.InputMethod;

/**
 * inner class
 * -디자인 클래스안에서 이벤트를 처리할때 사용
 * -안쪽클래스를 인스턴스 변수처럼 사용할때
 */
public class Outter {

	int outI;
	
		
	public Outter() {
		System.out.println("바깥 클래스의 생성자");
	}//Outter
	
	public void outMethod() {
		System.out.println("바깥 클래스 method");
//		intI=12;      //안쪽클래스의 자원 사용불가
//		inmethod();   //안쪽클래스의 자원 사용불가
		
		Outter.Inner in= this.new Inner();	//안쪽클래스 자원 사용시 필수로 객체롸,this 생략가능
		in.inI=12;
		in.inMethod();
	}//outMethod
	
	//////////////////////////////////////////Inner class 시작//////////////////////////////////////////
	public class Inner{
		
		int inI;
		
		public Inner() {
			System.out.println("안쪽 클래스의 생성자");
		}//Inner
		
		public void inMethod() {
			System.out.println("안쪽클래스의 method!");
			//바깥클래스의 자원을 직접사용 가능
			outI=2024;
//			System.out.println(outI);
		}//inMethod
		
		//내부클래스에서 외부클래스 직접사용 가능
		
				
	}//class
	//////////////////////////////////////////Inner class 시작//////////////////////////////////////////

	
	public static void main(String[] args) {
		//1.바깥클래스의 객체화
		Outter out= new Outter();
		out.outMethod();	//
		
		//2.안쪽클래스의 객체화: 바깥클래스명.안쪽클래스명 객체명= 바깥클래스객체명.new 안쪽생성자();
//		Inner in= new Inner();
//		/* Outter. */Inner in= out.new Inner();		//바깥클래스명 생략가능 out 생략x
		
	}//main

}//class
