package day0104;

/**
 * switch~case 사용: 일치하는 정수를 비교할때 사용
 * 문법)
 * switch (변수명) {
 * case 상수: 변수가 상수와 일치했을때 수행문..;
 * case 상수: 변수가 상수와 일치했을때 수행문..;
 * 		<br>
 * default: 변수와 일치하는 상수가 없을때 수행문..;
 * 	}  
 */
public class TestSwitchCase {

	public static final int GRADE_A_PLUS=10;
	public static final int GRADE_A=9;
	public static final int GRADE_B=8;
	public static final int GRADE_C=7;
	public static final int GRADE_D=6;
	
	public static void main(String[] args) {

		int i= 1;
		
		switch(i) {
//		case 2147483648L: System.out.println("영");		//Long 형 사용불가
//		case "ABC": System.out.println("영");
		case 0: System.out.println("일");
		case 1: System.out.println("일");
		case 2: System.out.println("이");	break;
		case 3: System.out.println("삼");
		
		default: System.out.println("변수와 일치하는 상수 없음.");
		}
		
		
		int score= 69;
//		char grade='\u0000';
//		
//		switch(score/10) {
//		case GRADE_A_PLUS:  constant명으로 
//		case GRADE_A: grade='A';		break;
//		case GRADE_B: grade='B';		break;
//		case(7): grade='C';				break;
//		case(6): grade='D';				break;
//		
//		default: grade='F';
//				
//		}
		
		
		char grade=64;
		
		if(score > -1 && score < 101 ) {
		switch(score/10) {
		case GRADE_D: grade++;
		case GRADE_C: grade++;
		case GRADE_B: grade++;
		case GRADE_A: grade++;
		case GRADE_A_PLUS: grade++;		break;
		
		default: grade+=6;
		}
		System.out.println(score+ "점의 학점은 "+grade);	
		
//		69점의 학점은 E -> 64() 65(A) 66(B) 67(C) 68(D) 69(E)
		
		}else {
			System.out.println(score+"점은 잘못된 점수입니다.");
		}
	}//main

}//class
