package day1227;

class Exam1227 {
	public static void main(String[] args) {
		String name="양수민";
		char initial1='Y';
		char initial2='S';
		char initial3='M';
		int thisYear=2023;
		int birthYear=2001;
		int age = thisYear - birthYear; 
		System.out.println(" 내 이름은 " + name+ "이고 이니셜은" +initial1+initial2+initial3+
			"입니다. 태어난 해는" +birthYear+ "년으로 나이는" +age+ "살입니다.");

		double left=4.25;
		double right=4.50;
		double both=(left + right /2);

		System.out.println("왼눈 시력" +left+ "오른눈 시력" +right + "이고 양안시력" +both+"입니다.");

		int charge= 1500;
		int charge2= charge *2;
		int yearCharge= charge*20;
		System.out.println("편도차비" +charge+ "원 왕복차비는" +charge2+ "한달 20일 출근하면 월 교통비는 총 " 
			+yearCharge+ "입니다.");
			
		char bigA ='A';
		int smallA= (int)bigA+32;		//'A' = 65 +32 연산을 위해서 int형으로 변수선언, 강제 형변환
		
		System.out.println("대문자 ' " +bigA+ " ' unicode 값은 65 입니다. 에 32를 더하면 소문자 '" +(char)smallA+ "'를 만들수 있다."); 
		//출력문에 smallA+32 = 'a' 유니코드로 출력하기 위해서 강제 형변환
	}
}
