package day0108;

/**
 * 시작과 끝을 모를때 사용하는 반복문
 * 최소 1번 수행 ~ 최대 조건까지 수행
 * 
 * 문법)
 * do{
 * 	반복 수행문..
 * 	}while(조건식);
 * 
 */
public class TestDoWhile {

	public static void main(String[] args) {
//		int i=1000;
//		
//		do {
//			System.out.println("i="+i);		//무조건 1번은 수행
//			i++;
//		}while(i <10);
//		
		
		//1~100까지 합 출력	//5050
		
		int sum=0;
		
//		i의 시작 값 1
		int i=1;
		
		do {
						
			sum+=i;
			System.out.println("합:"+sum);
			i++;
		}while(i<101);
		
	}//main

}//class
