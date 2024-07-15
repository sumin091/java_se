package day0110;

/**
 * 생성자 연습
 *  - 생성자는 직접 호출 불가하고, new(객체 생성용 키워드)로만 호출 가능.
 *  - 생성자는 반환형 없이, 클래스의 이름과 동일하게 생성
 */
public class TestConstructor {		//instance 영역
	//컴파일시 기본생성자가 만들어져있음
	
	/**
	 * 매개변수 없는 기본생성자 
	 */
	public TestConstructor() {
		System.out.println("default constructor 기본 생성자");
	}//TestConstructor
	
	
	//생성자의 오버로딩
	/**
	 * 매개변수 있는 생성자
	 * @param i
	 */
	public TestConstructor(int i) {
		System.out.println("overload된 constructor 생성자의 다형성");
	}
	
	
	
	
	public void test() {
		System.out.println("나는 test method");
	}//test
	
	public void temp() {
		System.out.println("나는 temp method");
		
		//test method 호출		
		test();	//영역이 같다면 객체명없이 바로 호출가능
//		TestConstructor();			//영역이 같다고 호출가능x -> 생성자는 직접호출x
		new TestConstructor();		//생성자는 new붙여주기
	}//temp
	
	public static void main(String[] args) {		//static 영역
		
//		new TestConstructor();
//		temp()는 인스턴스 영역 main은 static 영역으로 영역이 다르기 때문에
//		static영역에서 인스턴스 영역의 method를 호출하려면 객체화 후 호출
		TestConstructor tc= new TestConstructor();		//기본생성자를 사용한 객체화
		tc.temp();
		
		TestConstructor tc2= new TestConstructor(2024);	//오버로딩된 생성자를 사용한 객체화
		tc2.temp();
		
		
	}//main

}//class
