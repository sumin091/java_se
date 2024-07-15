package day0109;

/** 
 * Variable Arguments (가변인수 -parameter는 하나이나 입력값이 동적)
 * 문법)
 * 데이터형... 변수명 
 */
public class UseVariableArguments {
	
	public void testVA(int ... i) {
//		parameter는 참조형 데이터형인 배열로 처리된다.
//		System.out.println(i);
//		배열은 반복문으로 처리
		for (int j = 0; j < i.length; j++) {
			System.out.println(i[j]);	//배열형태
		}
	}//testVA
	
//	V.A는 가장 마지막에서 정의
	public void test(int i,char c,String s, double d, int...j) {
		
	}//test
	
//	public void test2(int i,char c,String s, int...j, double d) {
//		
//	}//test2 -> 에러
	
	public static void main(String[] args) {
		UseVariableArguments uva=new UseVariableArguments();
		//V.A는 호출할때 데이터형만 일치하면 값의 개수에 상관없이 호출가능
//		uva.testVA();
//		uva.testVA(2024);
		uva.testVA(2024,1,9,10,43);		//값이 여러개여도 모두 출력된다.
	}//main

}//class
