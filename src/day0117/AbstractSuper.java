package day0117;

/**
 * 추상클래스: 직접 객체화 될수 없다.
 */
public  abstract class AbstractSuper {
	
	public AbstractSuper() {
		System.out.println("부모의 기본생성자");
	}//AbstractSuper
	
	public void test() {
		System.out.println("일반 instance method");
	}//test
	
	public abstract String msg();	
	public abstract String msg(String msg);	
	
	
//	public static void main(String[] args) {
//		new AbstractSuper();	//직접 객체화 될 수 없음.
//	}//main
	
}//class
