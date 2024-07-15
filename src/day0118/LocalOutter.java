package day0118;

/**
 * 지역클래스
 */
public class LocalOutter {

	int i;
	
	public LocalOutter() {
		System.out.println("바깥 클래스의 생성자");
	}//LocalOutter
	
	public void test() {
		System.out.println("바깥 클래스의 method");
	}//test
	
	public void method(int paramI, final int paramJ) {
		
//		int i;	//지역변수 미사용시 warning
		int locI=2;
		final int locJ=15;
			
		////////////////////////////////지역클래스 시작////////////////////////////////
		class Local{
			int j;
			
			public Local() {
				System.out.println("지역클래스의 생성자");
			}//Local
			
			public void inMethod() {
				System.out.println("지역클래스 method");
				i=18;	//바깥클래스의 인스턴스 변수
				System.out.println(i);
				test();	//바깥 클래스의 method
//				locI=33;	//final이 붙은 변수로 선언외에 값 다시 할당 불가		
				//매개변수: JDK1.8이하에서는 final이 있는 변수만 사용가능
				System.out.println(paramI+ "/"+paramJ);
				
				//지역변수
				System.out.println(locI+ "/"+locJ);
				
			}//inMethod
		}//class
		////////////////////////////////지역클래스 끝////////////////////////////////
			
		Local lo= new Local() ;
//		lo.j=10;
//		System.out.println(lo.j);
		lo.inMethod();
	}//method
	
	
	public static void main(String[] args) {
		LocalOutter lo= new LocalOutter();
		
		lo.method(2024, 1);
	}//main

}//class
