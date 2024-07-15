package day0108;

public class Work0108 {
	
//	클래스 하나를 정의하고 아래의 일을 할수 있는 instance method 구현하고 호출
//	1. 자신의 이름을 출력하는 method	- 고정일
//	2. 자신의 이름 중 "성"을 반환하는 method	= 고정값
//	3. 점수를 입력받아 점수의 판정을 출력하는 method 작성	-가변일
//		점수는 0~100 사이일때만 판정하고 그렇지 않으면 "잘못된 점수"를 출력
//		0~39 : 과락 출력, 40~59: 다른 과목 참조, 60~100: 합격
//	4. 문자를 입력받아 해당 문자가 "대문자"(65),"소문자"(97),"숫자"(48) 인지를 판단하여 출력하는 method	- 가변일
//		A: 대문자 
//		그 외에는 $ : 대문자,소문자,숫자가 아닙니다 출력
//		
//	5. 태어난 해를 입력받아 나이를 반환하는 method	-가변값
//	
//	6. 3개의 수를 입력받아 가장 "작은 수"를 반환하는 일을 하는 method	-가변값 
//	---------------------------------------------------
	
//	출력
	public void printMyName() {
		
		System.out.println("내 이름: 양수민");
		
	}//printMyName
	
//	---------------------------------------------------
	
//	반환
	public char printFirstName() {
		char firstName='양';
		return firstName;
		
	}//printFirstName
	
//	---------------------------------------------------
	
	
	public void printScore(int score) {
		
		if(score>-1 && score<101) {
			
			if(score>0 && score<40) {
				System.out.println(score+" 점은 과락 입니다.");
				
			}else if(score>41 && score<60) {
				System.out.println(score+" 점은 다른과목을 참조하세요");
				
			}else if(score>61 && score<101) {
				System.out.println(score+" 점은 합격입니다.");
			}
			
		}else {
			System.out.println("잘못된 점수입니다.");
		}
	}//printScore
	
//	---------------------------------------------------
	
	
	public void printChar(char c) {
		
		
		if(c >64 && c<91) {
			System.out.println(c+" 는 대문자 입니다.");
		}else if(c>96 && c<123){
			System.out.println(c+" 는 소문자 입니다.");
		}else if(c>47 && c<58) {//제일 위로
			System.out.println(c+" 는 숫자 입니다.");
		}else {
			System.out.println(c+" 는 대문자, 소문자, 숫자가 아닙니다.");
		}
	}//printChar
	
//	---------------------------------------------------
	
//	반환
	public int printAge(int year, int birthYear) {
		
		int age=0; 
		age= year-birthYear;
		
		
		System.out.println("내 나이는 "+age);
		return age;
	}//printAge
	
//	---------------------------------------------------
	
//	반환
	public int printSmallerNum(int a, int b, int c) {
		int result = 0;
		result = ( a<b && a<c) ? a : (b<c ? b: c );	
		
		return result;
	}//printSmallerNum
	
//	---------------------------------------------------

	public static void main(String[] args) {
		Work0108 wk0108=new Work0108();	
		
		wk0108.printMyName();
		System.out.println(wk0108.printFirstName());	//반환
		wk0108.printChar('다');
		
		int age= wk0108.printAge(2024, 2001);
		System.out.println(age);
		
		wk0108.printScore(44);
		
		int result= wk0108.printSmallerNum(61, 88, 13);
		System.out.println(wk0108.printSmallerNum(61, 88, 13));
		//System.out.println(wk0108.printSmallerNum(result);
		
	}

}
