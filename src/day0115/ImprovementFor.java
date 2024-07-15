package day0115;

/**
 * 개선된 for문
 * 배열이나 collection의 처음 방 ~ 끝 방까지 순차적으로 출력해야 할때
 * 문법)
 * for( 방의 값을 저장할 변수의 선언 : 대상 )
 * 	변수명
 * }
 */
public class ImprovementFor {

	public static void main(String[] args) {
		int[] arr= {2024,1,15,12,19};
		
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}//기존 for문
		
		for(int value: arr) {
			System.out.println(value);
		}//개선된 for문
		
		String[] arr2= {"루피","쵸파","나미","샹크스","조로","샹디","우솝"};
		
		for(String value: arr2) {
			System.out.println(value);
		}
		
	}//main

}//class
