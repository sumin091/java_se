package day0111;

public class TestThis {

	int i;
	int j;
	
	/**
	 * this를 사용하지 않고 인스턴스 변수 i에 할당된 값을 설정해 보세요
	 * @param i
	 */
	
//	instance method
	public void setI(int i, TestThis t2) {	
		
		t2.i=i;
		
	}//setI
	
	int cnt=0;
	public void setJ(int j){
		System.out.println(this+"번지에서 호출");
		this.j=j;
		System.out.println(cnt++);

	}//setJ
	
	public static void main(String[] args) {
		TestThis t= new TestThis();
		System.out.println(t+"객체의 주소");
		
		t.setI(2024,t);	//주소를 받아서
		System.out.println(t.i);		
		t.setJ(2024);
		System.out.println(t.j);
		
		
		System.out.println("-------------------------------");
		TestThis t2= new TestThis();
		System.out.println(t2+"객체의 주소");
		t2.setJ(1);
		
//		System.out.println(this);
//		static 영역은 객체명없이 호출가능 => this가 있을 수 없다.
	}//main

}//class
