package day0117;

/**
 * OverrideSub는 OverrideSuper의 자식클래스
 */
public class OverrideSub extends OverrideSuper {

	int j;
	
	public OverrideSub() {
		System.out.println("자식클래스의 생성자");
	}//OverrideSub
	
	public void temp() {
		System.out.println("자식의 method");
	}//temp
	
	/**
	 * Override 규칙: 접근지정자는 광의의 접근 지정자로 (protected -> public)달라도 되고, (default, private : x)
	 * 반환형, 메소드명, 매개변수는 동일해야 한다.
	 */
	@Override
	protected void printI() {
		super.printI();
		System.out.println("자식: "+j+ ", i"+this.i);		//내 객체주소로부터 부모의 객체에 접근가능
//		System.out.println("자식: "+j+ ", i"+super.i);	
	}//printI
	
	public static void main(String[] args) {
		//자식클래스로 객체화: 부모의 모든 자원과 자식의 모든 자원을 사용 할 수 있다.
		OverrideSub oSub= new OverrideSub();
		oSub.i=2024;	//부모의 변수
		oSub.j=1;		//자식의 변수

		oSub.test();    //부모의 method
		oSub.temp();  //자식의 method
		
		oSub.printI();  //자식의 method
		
		System.out.println("------------------------------------------------");
//		is a 관계의 객체화
		OverrideSuper oSuper= new OverrideSub();
		oSuper.i=12;
		
//		oSuper.j=40; 		자식클래스의 변수는 사용불가: j는 자식클래스 변수,j 없음,불가
		oSuper.test();      //부모클래스의 메서드
//		oSuper.temp();      //자식클래스의 메서드 사용불가
		oSuper.printI();    //override: 자식클래스의 메서드
		
	}//main

}//class
