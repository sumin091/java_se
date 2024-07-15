package day0104;

/**
 * 다중 for: 인덱스를 두개 사용하여 반복해야 할때 사용
 * 문법)
 *  for(초기값; 조건식; 증/감소식({
 *  	for( 초기값; 조건식; 증/감소식({
 *  		반복문 수행			//다중for 영역
 *  		}
 *  	반복문 수행		//단일for 영역
 *  	}	
 */		
public class TestFor2 {

	public static void main(String[] args) {
		
//		다중 for의 동작: 바깥 for가 한번 반복할때, 안쪽 for는 몇번 반복할까?
		for(int i=0; i< 5; i++) {		//5번 반복
			for(int j=0; j <3; j++) {	//3번 반복
				 System.out.println("i: " +i+ ", j: "+ j);
			}//다중 for end
			System.out.println("-----------------------------------");
		}//단일 for end
		
		//구구단
		for(int i=2; i< 10; i++) {
			for(int j=1; j < 10; j++) {
				System.out.println(i + "*" + j + "=" + (i*j));
			}
		}
		System.out.println("------------------------------");
		
//		안쪽 for가 바깥 for의 현재 반복번째 까지 반복
		for(int i=0; i<4; i++) {
			for(int j=0; j <= i; j++) {
				System.out.print(i+ " " +j+ " ");
			}
			System.out.println();
		}
		System.out.println("------------------------------");
		
		
//		안쪽 for의 시작이 바깥 for의 현재보다 1증가한 지점에서 반복
		for(int i=0; i<5; i++) {
			for(int j=i+1; j<6; j++) {
				System.out.print(i+ " " + j + "");
			}
			System.out.println(" ");
		}
		System.out.println("------------------------------");
		
		
		
		int a=1;		//다른 변수 하나 산언
		
		for(int i=1; i<5; i++){
			for(int j=0; j <= i; j++) {
				System.out.print(a++ + " ");
			}
			System.out.println();
			
		}
		
		
		
		
	}//main

}//class
