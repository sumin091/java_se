package day0108;

/**
 * instance variable 
 * - 객체마다 생성되고, 사용되는 변수 (값을 따로 사용할수있다.) 
 * - 인스턴스화 하게되면 메모리에 올라가고 객체사용이 종료되면 메모리에서 내려온다.
 * - 자동초기화 (직접 사용하더라도 에러가 발생하지 않음)
 * - 꼭 instance화 후에 사용되어져야한다. (동일영역에서는 객체명을 생략하고 사용가능) 
 */
public class UseInstanceVariable {
	
//	public int i;	//class field: 접근지정자 사용가능
//	protected int a;
//	
//	//주로 사용
//	int b;
//	private int c;
	
	int i; 	//(default 접근지정자) -> UseInstanceVariable
	
	
	//default value
	int a;		//정수 0
	char b;		//문자 \u0000
	boolean c; 	//false
	double d;	//0.0
	String s;	//참조형 데이터형-null	
	
	public void test() {
		i=10;	//동일영역 (instance 영역)에서는 객체명 없이 사용가능
	}
	public static void main(String[] args) {

//		int i; 	//local: 접근지정자 사용불가
//		i=10;	//영역이 다르므로 사용불가 -> (static 영역) 객체화 후 사용해야 한다. => error
//		객체화 - 인스턴스 변수를 사용하기 위해서
//		클래스명 객체명= new 클래스명();
//		i라는 변수를 사용하기 위해  UseInstanceVariable클래스를 객체화 한다.
		
		
		UseInstanceVariable uiv= new UseInstanceVariable();
		UseInstanceVariable uiv2= new UseInstanceVariable();
		
//		instance variable은 특정 객체가 생성되면 만들어지는 변수 (member variable)
//		특정 객체만 사용하는 변수
		uiv.i=2024;
		uiv2.i=1;
		
		//객체가 다르기에 객체마다 다른 값을 가지게 된다.
		System.out.println("uiv객체가 가진 i변수 "+uiv.i);
		System.out.println("uiv2 객체가 가진 i변수 "+uiv2.i);
		
		System.out.println("기본형");
		System.out.println("정수: "+uiv.a);
		System.out.println("문자: ["+uiv.b+"]");
		System.out.println("실수: "+uiv.d);
		System.out.println("불린: "+uiv.c);
		System.out.println("참조형: "+uiv.s);
		
		
		
	}//main

}//class
