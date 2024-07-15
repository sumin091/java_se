package day0108;

/**
 * 시작과 끝을 모를때 사용하는 반복문
 * 최소 0번 수행 ~ 최대 족너까지 수행
 * 문법)
 * while( 조건식 ){
 * 		반복수행문..;
 * }
 */
public class TestWhile {

	public static void main(String[] args) {
		
		int i=10;	//초기값
		
		while( i< 10) {		//조건식
			System.out.println("i="+i);	//반복수행문
			i++;	//증감소식
		}
		
		//구구단 5단 출력
		
//		int i=5;
		while(i<10) {
			System.out.println();
		}
		
		
		
	}//main

}//class
