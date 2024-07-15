package day0110;

/**
 * polymorphism(다형성)
 * method overloading: 하나의 클래스 안에서 같은 이름의 method를 여러개 정의하는 것
 * 편의성
 */
public class TestOverloading {

	//별 하나 출력
//	private  int star() {		접근지정자와 반환형이 달라도 된다.
	public void star() {
		System.out.print("★");
		
	}//star
	
	//입력되는 수만큼 별을 가로로 출력하는 일
	public void star(int cnt) {
		for(int i=0; i<cnt; i++) {
			System.out.print("☆");
		}
	}//star
	
	public static void main(String[] args) {
		TestOverloading to= new TestOverloading();
		to.star(8);		//overload된 method 호출
		to.star();		//overload된 method 호출
		
	}//main

}//class
