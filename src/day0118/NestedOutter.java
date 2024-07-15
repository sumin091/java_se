package day0118;

/**
 * nested class
 * -안쪽클래스를 static 변수처럼 사용할때 (객체화없이 직접 사용할때)
 */
public class NestedOutter {

	int outI;				//iv(instance variable)
	static int outJ;		//같은공간에 있지만 
	
	public NestedOutter() {
		System.out.println("바깥클래스의 생성자");
	}//NestedOutter
	
	public void outInsMethod() {
		System.out.println("바깥클래스의 인스턴스 method");
	}//outInsMethod
	
	public static void outStaMethod() {
		System.out.println("바깥클래스의 인스턴스 method");
	}//outStaMethod
	
	///////////////////////////////////////// nested class 시작 /////////////////////////////////////////
	static class Inner{		//생성자를 만들지 않는다.
		//변수나 method는 static으로 만들어 객체없이 사용하도록 한다.
		static int inI;
		
		public static void inMethod() {
			System.out.println("안쪽클래스의 method");
//			outI=10;		//instance 영역의 변수는 객체생성없이 사용불가
//			outInsMethod();	//instance 영역의 method는 사용할 수 없다.
			outJ=20;
			NestedOutter.outStaMethod();
		}//inMethod
		
	}//Inner
	///////////////////////////////////////// nested class 시작 /////////////////////////////////////////

	public static void main(String[] args) {
		Inner.inMethod();	//Nested class는 객체없이 클래스명으로 직접 사용가능하다.
	}//main

}//class
