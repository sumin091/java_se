/*
강제형변환: 개발자가 필요한 데이터 형으로 일시적 변환을 하는 것.
- 원본 값은 유지되지만 상황에 따라 값 손실이 발생 할 수 있다.
- 기본형 -> 참조형 / 참조형 -> 기본형으로 casting 될 수 없다.
- boolean은 동일형으로만 casting 가능하다.
*/
package day1227;

class Casting {

	//System.out.println("잘생긴 홍성강"); class field:instance,static,constant,method만 정의가능하므로 error: java코드인 출력문 

	public static void main(String[] args) {
		double d=2023.12;
		//int i=d; // 크기, 값의종류 모두 달라 error
		//casting 문법: (변환할 데이터형)값;
		int i= (int)d; //casting시 실수가 정수로 변환과정중에 2023.12 -> 2023으로 값손실이 발생
		System.out.println("원본 값 :"+ d+" ,casting한 값 :"+i);

		float f=(float)1.23456789;		//리터럴의 값을 4byte로 변환하여 할당 1.2345679로 값 손실
		System.out.println(f);

		byte num1=10;
		byte num2=20;
		byte result=0;

		//byte 

		result= (byte)(num1+num2);		
		/* (byte)(num1+num2)에서 num의 연산결과(byte+byte=int)를 (byte) 강제 형변환으로 byte형으로 변환해준다 
			casting을 통해 연산결과를 result변수에 할당
		*/
		System.out.println(num1+ " + " +num2 +" = " + result);
		
		char c= 'A';
		
		System.out.println(c + "의 unicode는 " + (int)c); 

		//boolean형은 boolean으로면 casting 가능
		boolean b= true;
		boolean b1=(boolean)b;	//의미없음.
		System.out.println(b+ ", "+ b1);
		//int ii =(int)b;					//boolean은 다른 형으로 강제 형변환 불가

		//기본형 -> 참조형 / 참조형 -> 기본형 casting 불가
		
		/* error
		int today=27;				//int: 기본형 데이터형(값 저장)
		String strToday=today;	//String: 참조형 데이터형(주소 저장) 
		*/
		
		/* error
		String strToday="27";		//참조형
		int today=strToday;		//기본형
		*/

	}//main
}//class
