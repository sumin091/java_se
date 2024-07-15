/*
자동형변환 (promotion, demotion)
JVM이 상황에 따라 크기를 변경해주는 것.
*/
package day1227;

class Promotion{
	public static void main(String[] args){

		byte num1=10;		//-128 ~ +127
		byte num2=20;

		int result=0;			// byte result=0;
		/*
		예) byte + byte = int 
			short + short = int
			byte + short= int (byte(1) -> short(2) 비트로 변환 후 형변환 이뤄짐)
			int + long = long
		*/
		result= num1+num2;	//byte+byte = int형 이기에 저장될 공간은 promotion을 고려하여 result 변수를 int형으로 변환
		System.out.println(num1+"+"+num2+"=" + result);
	}//main
}//class
