//1. 지역변수 사용
package day1226;

class UseLocalVariable{
	int i;	//instance variable
	//main method: class를 단독으로 실행시켜야 할때 정의
	//단독으로 실행가능한 프로그램: java application
	public static void main(String[] args){
	
	//지역변수
	//1. 선언	: 데이터 형 변수명;
		int maxScore=100;	//초기화 값 (선언과 할당 동시에)	
		int myScore=0;	//초기화 되지 않은 변수

		System.out.println( myScore );	//초기화 되지 않은 변수를 사용하면 에러발생
	//2. 값 할당: 변수명 = 값;
		maxScore= 100;
		myScore= 80;
	//3. 값 사용: 출력
		System.out.println("최고점수" +maxScore+ "점");
		System.out.println("차이:" + (maxScore - myScore) + "점");
	
	//1. 올해를 저장할 수 있는 변수를 선언하고 초기값으로 올해를 할당
		int thisYear = 2023;
	//2. 자신의 나이를 저장할 수 있는 변수를 선언하세요.
		int myAge;
	//3. 2번의 변수에 자신의 나이를 할당하세요.
		myAge= 22;
	//4. 두개의 변수를 사용하여 자신이 태어난 해를 출력
		System.out.println("내가 태어난 해:" + ( thisYear - myAge) + "년" );

	//int myScore=10000;	//영역이 같다면 같은이름의 변수는 하나만 선언가능, error
	int i;	//영역(filed/local)이 다르므로 같은 변수명의 변수 선언가능
	}

}