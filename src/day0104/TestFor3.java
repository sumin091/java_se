package day0104;

/**
 *  다양한 for의 형태
 *  
 *  -무한 루프
 *  for(초기값;  ; 증/감소식){
 *  }
 *  
 *  for( ; ; ){
 *  }
 */
public class TestFor3 {

	public static void main(String[] args) {
		
//		for(int i=0; ; i++) {
//			System.out.println(i);
//			if(i==50) {
//				break;
//			}
//		}
		
		
//		System.out.println("무한루프");
//		
//		for( ; ;) {
//			System.out.println("무한루프");
//		}

		
//		여러개의 초기 값을 가진 for
		for(int i=0, j=10, k=100 ; i < 10; i++, j+=100, k--) { 
			System.out.println("i:"+ i+ ", j:" +j+", k:"+k);
		}
		
//		continue
//		1~100까지 홀수만 출력
		for(int i=1; i<101; i++) {
			if(i%2==1) {
			continue;
			}// if end
			System.out.println(i+ " ");
		}
					
			
			
			
			
			
			
			
			
			
	}//main

}//class
