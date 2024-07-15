package day0108;

/**
 * static variable
 * -객체화 없이 클래스명으로 직접 접근하여 사용 할 수 있는 변수
 * -프로그램이 실행되면 메모리에 올라가고 실행이 끝나면 메모리에서 내려오는 변수
 * -자동 초기화(값 할당하지 않고 사용하더라도 에러가 발생하지 않음)
 * -하나의 변수만 만들어진다.
 * -모든 instance(객체)가 하나의 변수를 참조하고 사용한다.	-공용 
 * 
 */
public class UseStaticVariable {
	//1.선언) static 데이터형 변수명;
	static int i;			//0
	static char c;			// \u0000
	static boolean b;		//false	
	static double d;		//0.0
	static UseStaticVariable usv;	//null
	
	public static void main(String[] args) {
		//default value
		System.out.println("정수: "+i);		//System.out.println("정수:"+ UseStaticVariable.i );
		System.out.println("문자: ["+c+"] ["+ (int)c +"]");
		System.out.println("불린: "+b);
		System.out.println("실수: "+d);
		System.out.println("객체: "+usv);
		
	//2. 값 할당) 클래스명.변수명= 값;
		UseStaticVariable.i = 100;
	//3. 값 사용) 클래스명.변수명;	
		System.out.println(UseStaticVariable.i);
		
	//모든 객체(instance)가 하나의 변수를 사용
		//1.객체화)
		UseStaticVariable instance= new UseStaticVariable();
		UseStaticVariable instance2= new UseStaticVariable();
		
		//메모리의 주소가 다르므로 -> 다른 객체임
		System.out.println(instance);		
		System.out.println(instance2);
		
		//static 변수는 공용이므로 특정 객체(instance)에 속하지 않는 변수
		//특정 instance명으로 사용하면 사용가능하나 올바르지 못한 표현임
//		instance.i=200;		//instance 객체로 접근한 i값을 변경했으나
//		System.out.println(instance.i);
//		System.out.println(instance2.i);		//instance2 객체(class) 안에 있는 i값도 함께변경
		
		
		
		
		
		
	}//main

}//class
