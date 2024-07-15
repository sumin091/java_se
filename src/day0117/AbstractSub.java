package day0117;

/**
 * 추상클래스를 구현한 클래스
 * 부모클래스의 모든 추상 method를 override 해야한다.
 */
public class AbstractSub extends AbstractSuper {

	public AbstractSub() {
		System.out.println("자식의 생성자");
	}//AbstractSub
	
	@Override
	public String msg() {
		return "Override한 method";
	}//msg
	
	@Override
	public String msg(String msg) {
		//부모의 method는 추상메서드로 body가 없어 호출 될 수 없다.
//		super.msg("안녕");	//error: 추상메서드 메서드는 바로 호출 불가
		return msg+"입니다.";
	}//msg

	
	public static void main(String[] args) {
//		new AbstractSuper();	//에러: 객체화 불가
		AbstractSub as= new AbstractSub();	//자식클래스가 생성되면서 부모클래스 부터 생성된다.(이때만 객체화 가능)
		System.out.println(as.msg());
		System.out.println(as.msg("수요일"));
	}//main


}//class
