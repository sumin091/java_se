package day0108;

/**
 * static method 작성
 */
public class TestStaticMethod {

	public static void plus(int num, int num2) {
		int result=0;
		
		result= num+num2;
		
		System.out.println(result);
	}//plus
	
	//구구단 입력받아 구구단의 범위였을때, 입력된 단을 출력하는 method작성, 호출
	
	public static void gugudan(int dan) {		//매개변수 => lv(동일한 변수선언 x)
		
		//int dan=0;  매개변수 하나만, parameter와 동일한 변수는 선언불가 => 같은 영역이기 때문
		
		if(dan>1 && dan<10) {
//			System.out.println(dan);
			for(int i=1; i<10; i++) {					
				System.out.println(dan+"*"+ i +"=" +(dan*i));
			}
		}
		
	}//gugudan
	
	public static void main(String[] args) {
		//static :객체화 없이 호출가능
		TestStaticMethod.plus(1, 8);
		TestStaticMethod.gugudan(5);
		
	}//main

}//class
