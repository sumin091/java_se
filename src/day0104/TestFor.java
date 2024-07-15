package day0104;

/**
 * for문: 시작과 끝을 알때  사용하는 반복문 
 * 문법)
 * for (시작값(초기값); 조건식(끝값); 증감소식){
 *  반복수행될 문장문..;
 *  	}
 */
public class TestFor {

	public static void main(String[] args) {

		//안녕하세요를 10번 출력하는 코드
		
		for(int i=0; i < 10; i++) {
			System.out.println("안녕하세요? " + i);
		}
		
		//1~100까지 옆으로 출력하는 코드를 작성
		for(int i=1; i < 101; i++) {
			System.out.print(i+ " ");
		}
		
		System.out.println();
		
		//1~100까지 홀수만 옆으로 출력
		for(int i=1; i< 101; i+=2) {	//증감식은 대상체의 값을 변화시키고 저장할 수 있는 모든 연산자를 사용할수있다.
			System.out.print(i +" ");
		}
		System.out.println();
		
		//100~1까지 옆으로 출력하는 코드 출력
		for(int i=100; i > 0 ; i--) {
			System.out.print(i+ " ");
		}
		System.out.println();
		
		//1~9까지 1씩 증가하는 
		for(int i=1; i < 10; i++) {
			System.out.println("4 x"+i+"="+(i*4));
		}
		
		System.out.println("-----------------------------------");
		
		//입력된 메인메서드에 처음입력된 값이 구구단의 범위 였을때 (2~9)
		//해당 단의 구구단 출력하는 코드
		
		int num=Integer.parseInt(args[0]);
		if(num > 1 && num < 10) {
			System.out.println(" ");
			
			for(int i=1; i < 10; i++ ) {
				System.out.println("9 x "+ i +" = " + (i*num));
			}
		}else {
			System.out.println("구구단의 범위가 아닙니다.");
		}
		
		//1~100의 합을 출력 5050
		int sum = 0;
		
		for(int i=1; i < 101; i++) {
			sum += i;
			System.out.println("1~100 까지의 합은 "+sum);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}//main

}//class
