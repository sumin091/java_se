package day0103;
/**
 * 단일 if : 조건에 맞을때만 코드 실행하는 경우
 * 문법 <br>
 * if(조건식){ <br>
 * 		조건이 T 일경우 수행할 문장...<br>
 * } <br>
 */
public class Testif {

	public static void main(String[] args) {

//		main method에(argument) 입력된 임의의 수의 절대값을 구해 출력
//		int num=12;
		int num= Integer.parseInt(args[0]);
		int abs=num;
		
		if(num<0) {
//			임의의 수가 0보다 작으면 음수이므로 true 발생하고 if문 탄다
			abs= -num;	//2의 보수연산 수행
		}//end if
		
		System.out.println(num +"의 절대값:"+ abs);
//		문자열의 비교는 값이 동일한가 만 비교, 관계연산자를 사용하는 것이 아닌
//		equals method를 사용하여 비교한다.
		System.out.println("equals 문자열의 비교:" + args[0].equals("-48"));
		System.out.println("equals 문자열의 비교:" + args[0].equals("-47"));
		
//		main method에 두번째 입력된 arguments는 성별(여/남)이다.
//		프로그램의 출력은 입장 > 이때 여자인 경우 "수건2장 지급" > 목욕탕입실의 순서 입력된 수의 절대값 구하기
		System.out.println(args[1]+ " 성별이 입력되었습니다");
		System.out.println("출입문 입장");
		
		if(args[1].equals("여자")) {
			System.out.println("수건 2장 지급");
		}
		
		System.out.println("목욕탕 입실");
		
//		실수의 비교
//		사람이 활동하기 좋은날씨 25.0 ~ 30.0도 이다. 이때만 "좋은날씨" ~(^^~)(~^^)~ 출력
		
		double temperature= 28.7;
		System.out.println("현재온도:"+ temperature);

		if(temperature < 25.0 && temperature < 30.09) {
			System.out.println("좋은 날씨 입니다. ~(^^~)(~^^)~" );
		}
		
		
//		if(25.0 < temperature < 30.0) {
//			System.out.println("좋은 날씨 입니다. ~(^^~)(~^^)~" );
//		}
//		(25.0 < temperature < 30.0) => (temperature < 25.0 && temperature < 30.9) 
//		비교대상을 우선
		
//		문자의 비교
//		char의 변수에는 임의의 문자가 들어있다. 해당 문자가 대문자일때만 "대문자"를 출력 (A:65 ~ Z(90))
		char temp= '가'; 
		if(temp > 64 && temp < 91 ) {
			System.out.println("대문자");
		}
	}//main

}//class
