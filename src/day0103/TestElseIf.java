package day0103;

/**
 * 다중 if( else ~ if): 연관된 여러 조건 비교시 사용 문법)
 * 
 * if(조건식){ 조건에 맞을때 수행문 }else if(조건식){ 해당 조건에 맞을때 수행문 }else{ 위에 모든 조건에 맞지 않을때
 * 수행문 }
 */
public class TestElseIf {

	public static final int MONKEY=0;
	
	public static void main(String[] args) {
		// 점수 판별
//		점수는 0보다 작을수 없고, 100보다 클수 없다.
//		0보다 작다면 "0보다 작아서 실패" 출력,
//		100보다 크다면 "100보다 커서 실패" 출력,
//		그렇지않다면 ( 0~ 100 사이) "성공!"출력

		int score = 85;
		System.out.println(score + "점은 ");

		if (score < 0) {
			System.out.println("0보다 작아서 실패");
		} else if (score > 100) {
			System.out.println("100보다 커서 실패");
		} else {
			System.out.println("성공!");
		}

//		char 형의 변수에는 임의의 문자가 할당 되어있다. 
//		할당된 문자가 "대문자"(65)인지 "소문자"(97)인지 "숫자"(-48)인지 그렇지 않다면 "영어나 숫자가 아닙니다." 출력
		char a = 'D';
		System.out.println(a + "는");

		if (a >= 65) { 
			System.out.println("대문자");
		} else if (a >= 97) { 
			System.out.println("소문자");
		} else if (a >= 48) { 
			System.out.println("숫자");
		} else {
			System.out.println("영어나 숫자가 아닙니다.");
		}
		
//		if(a > 47 && a < 58 ) {
//			System.out.println("숫자");
//		}else if(a > 64 && a < 91) {	//대문자
//			System.out.println("대문자");
//		}else if(a > 96 && a < 123) {	//소문자
//			System.out.println("소문자");
//		}else {
//			System.out.println("영어나 숫자가 아닙니다.");
//		}
		
		
//		태어난 해를 저장하는 변수를 선언하고 자신의 태어난 해를 할당한다.
//		태어난 해의 띠를 출력		
//		12의 나머지 연산
//		0-원숭이, 1-닭, 2-개, 3-돼지, 4-쥐, 5-소, 6-호랑이, 7-토끼, 8-용, 9-뱀, 10-말, 11-양
		
		int birthYear= 2001;
		System.out.println(birthYear + "은(는)");
		
		if(birthYear%12==Zodiac.MONKEY){	
//	 if(birthYear%12==MONKEY) -> Constant사용해서 가독성 완화
//	 if(birthYear%12==Zodiac.MONKEY ->(외부 클래스에서 선언한 constant 호출하기)
			System.out.println("원숭이");	
		}else if(birthYear%12==Zodiac.ROOSTER) {
			System.out.println("닭");
		}else if(birthYear%12==Zodiac.DOG) {
			System.out.println("개");
		}else if(birthYear%12==Zodiac.PIG) {
			System.out.println("돼지");
		}else if(birthYear%12==Zodiac.RAT) {
			System.out.println("쥐");
		}else if(birthYear%12==Zodiac.CAW) {
			System.out.println("소");
		}else if(birthYear%12==Zodiac.TIGGER) {
			System.out.println("호랑이");
		}else if(birthYear%12==Zodiac.RABBIT) {
			System.out.println("토끼");
		}else if(birthYear%12==Zodiac.DRAGON) {
			System.out.println("용");
		}else if(birthYear%12==Zodiac.SNAKE) {
			System.out.println("뱀");
		}else if(birthYear%12==Zodiac.HORES){
			System.out.println("말");
		}else {
			System.out.println("양");
		}
		

		
	}// main

}// class
