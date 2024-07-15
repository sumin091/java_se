package day0108.sub;

import day0108.TestAccessModifier;

/**
 * 패키지가 다른 상태에서 public 접근지정자가 있는 클래스의 접근
 * UsePublicModifier2는 TestAccessModifier를 상속받는 자식클래스
 */
public class UsePublicModifier2 extends TestAccessModifier {

	public static void main(String[] args) {
		
		//TestAccessModifier는 클래스의 접근지정자가 public이므로 접근가능 
		TestAccessModifier tam= new TestAccessModifier();
		tam.a=10;	//a변수는 접근지정자 public으로 접근가능
		
//		tam.b=10;	//b변수는 접근지정자 protected이므로 접근불가
//		tam.c=10;	//c변수는 접근지정자 default이므로 접근불가
//		tam.d=10;	//d변수는 접근지정자 private이므로 접근불가
		
//		TestAccessModifier2 tam= new TestAccessModifier2(); 	클래스 접근지정자가 package이므로 접근불가
		
		UsePublicModifier2 upm2= new UsePublicModifier2();
		//부모클래스에 존재하는  public,protected 에 대해 접근가능 (default, private 접근불가)
		upm2.a=100;		//public
		upm2.b=200;		//protected
//		upm2.c=;		//default 사용불가
//		upm2.d=;		//private 사용불가
		
	}//main

}//class
