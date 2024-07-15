/*
진수 사용
*/
package day1228;

class Radix{
	public static void main(String[] args) {

		 int i=10;		//10진수 -> 2진수로 저장
		 int j=012;	//8진수 -> 2진수로 저장
		int k=0xA;	//16진수 -> 2진수로 저장

		System.out.println(i + j + k);	//2진수를 연산하여 10진수로 보여준다.

		i= 25;
		System.out.println( i +"를 2진수로:" +Integer.toBinaryString(i));

		i= 89;
		System.out.println( i +"를 2진수로:" +Integer.toBinaryString(i));
        
		i= 300;
		System.out.println( i +"를 2진수로:" +Integer.toBinaryString(i));

		//////////////////////////////////////////////////////////////////////////////////
/*
//		i=030; 
		System.out.println("030을 2진수로:" + Integer.toHexString( 030 ));		
		System.out.println("0201을 2진수로:" + Integer.toHexString( 0201 ));
        System.out.println("0300을 2진수로:" + Integer.toHexString( 0300 ));

		System.out.println("25을 16진수로:" + Integer.toHexString( 0x25 ));			//0x25 -> 25
		System.out.println("1D을 16진수로:" + Integer.toHexString( 0x1D ));			//0x1D ->  1D
		System.out.println("FF을 16진수로:" + Integer.toHexString( 0xFF ));			//0xFF -> FF

		System.out.println("0x25를 2진수로:" +Integer.toBinary(0x25));
		System.out.println("0x1D를 2진수로:" +Integer.toBinary(0x1D));
		System.out.println("0xFF를 2진수로:" +Integer.toBinary(0xFF));

		//입력된 10진수
		System.out.println("0x1D를 2진수로:" +Integer.toOctalString(0x1D));
*/
        
		int tel= 01012341234;
		System.out.println(" 내 전화번호는 : " + tel );		
		//8진수를 출력하면 10진수로 나온다. => string 형으로 저장

        
	}//main
}//class
