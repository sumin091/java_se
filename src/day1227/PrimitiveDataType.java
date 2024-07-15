/*
기본형 데이터 형: 변수에 값(상수값)을 저장하는 데이터 형 
*/
package day1227;


class  PrimitiveDataType{
	public static void main(String[] args){
		/////////////////////정수상수를 저장할 수 있는 데이터형//////////////////////
		byte a=10;		//byte는 -128 ~ +127
		//byte a=127;		//error 이미 a 변수가 존재
		//byte b=128;		// 데이터 형은 저장할 수 있는 범위 초과시 error
		short b=10;
		int c=10;
		long d=10;

		//자신이 평생 모으고 싶은 현실적인 자산을 변수에 할당
		long asset=3100000000L;		//리터럴의 크기를 변경하여 상수값을 저장하고, 변수에 할당된다.
//		long asset=2147483648;

		System.out.println(" byte: " + a + ", short : " + b + ", int : " +c +
			", long : " +d);
		System.out.println("나의자산 : " + asset);

		///////////////////////////char형///////////////////////
		char e='A';		//문자에 해당하는 2byte 유니코드값 할당 char e=65; 와 동일
		char f='0';		//char f=48;
		char g='가';		//char g='가';
		//char h='u0000';
		System.out.println("char :" + e +", " + f +", " +g /*+ ", " +h*/); 

		////////////////////////////실수형////////////////////////////
		//float f= 12.27;	//실수 리터럴은 8byte 이고, float형은 4byte이기에 크기가 달라서 값이 할당될수 없다.
		float i=12.27f;	//8bytr릐 리터럴이 4byte로 축소되어 할당된다.
		float j=12.28F;
		double k=2023.12D;	//double k=2023.12;와 동일

		System.out.println("float : " +i+ ", "+j+ ", double :" +k);

		/////////////////////////////boolean/////////////////////////////////
		boolean l=true;
		boolean m=false;
		// true / false 이외의 값은 저장 불가하다.
		//boolean n=0;
		System.out.println("boolean : " +l+", " +m);
		
	}//main
}//class
