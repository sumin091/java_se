package day0118;

import java.util.Iterator;

/**
 * java.lang.Math 클래스의 사용
 * 객체생성을 하지 않고, 제공되는 기능을 사용하는 클래스
 */
public class UseMath {

	public UseMath() {
//		Math m= new UseMath();	//생성자가 없으므로 객체화 할 수 없다.
		
		double d= Math.abs(-2024.01);
		int i= Math.abs(-2024);
		
		System.out.println(d+", "+i);
		d=10.5;
		long l=Math.round(d);
		System.out.println(d+", "+l);
		
		d=10.1;
		System.out.println(Math.ceil(d));
		
		d=10.9;
		System.out.println(Math.floor(d));
		
		d=12.3456;
		System.out.println((int)d);
		
		System.out.println(Math.random());
		
		double num= Math.random();	//0.00000~16 ~ 0.999~16수 중 하나
		System.out.println("발생한 난수: "+num);
		System.out.println("범위의 난수: "+num*10);	//0~9까지 10개 난수
		System.out.println("정수범위의 난수: "+((int)(num*10)+1));	//0~9까지 10개 난수
		

		//1~10까지의 10개의 난수 발생
		char[] randomUppercase= new char[8];
		//위의 배열에 무작위의 알파벳 대문자를 입력 
		//A-Z 26자, 65~90 난수를 0~25 26개의 난수를 발생시키고 65를 더하는 방법
				
		for(int a=0; a<randomUppercase.length; a++) {
			randomUppercase[a]=(char)((Math.random()*26)+65);
			//System.out.println(randomUppercase[j]+" ");
		}
		
		System.out.println(randomUppercase);//char형 배열은 주소가 아니라 문자열 출력
		
		
	}//UseMath
	
	public static void main(String[] args) {

		new UseMath();
		
	}//main

}//class
