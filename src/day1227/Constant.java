/*
Constant: 변수를 상수처럼 사용할때 사용
*/
package day1227;

class Constant {
	//constant 정의
	public static final int MAX_SCORE=100;	//기준값
	public static final int MIN_SCORE=0;
	public static void main(String[] args) {

	int maxScore=100;		
	int myScore= 80;
	//maxScore=99;			//error : constant 값은 변경 불가능

	System.out.println("many source codes...");
	System.out.println("many source codes...");
	System.out.println("many source codes...");
	System.out.println("many source codes...");
	System.out.println("many source codes...");
	System.out.println("many source codes...");
	System.out.println("many source codes...");


	System.out.println("최고점수와 획득점수 간의 차" + (MAX_SCORE-myScore));
	System.out.println("최고점수와 획득점수 간의 차" + (Constant.MAX_SCORE-myScore));
	}//main
}//class
