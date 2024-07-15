package day0118;

/**
 * 구현클래스가 반드시 구현해야할 일의 목록을 정의할때 사용
 * 상수, 추상메서드(abstract method)를 가진다.
 */
public interface SuperInter {
//	int i;	// instance variable 선언시 error, 선언불가능
	
//	public SuperInter() {
//		
//	}	//interface는 생성자를 가질수 없다 => 객체화가 불가하다
	
//	public void test() {
//		
//	}	//interface는 일반 method를 가질수 없다
	
	public static final int MAX=100;	//객체의 크기에 영향을 주지 않는다.
	
//	interface의 추상메서드는 abstract 접근지정자를 붙이지 않고 생성할 수 있다.
	public String toDay();
	public abstract int getAge();
	
//	default method를 작성: method body가 있는 method
	public default String defMethod() {
		return "인터페이스에서 처리된 작업";
		
	}//defMethod
	
}
