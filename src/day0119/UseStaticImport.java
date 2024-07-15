package day0119;

import static java.lang.Integer.MAX_VALUE;
//import static java.lang.Long.MAX_VALUE;		//같은이름의 constant는 여러개 static import 할수 있으나 아래의 코드에서 에러발생
import static java.lang.Integer.parseInt;
import static java.lang.Math.random;

public class UseStaticImport {

	public static void main(String[] args) {
//		System.out.println(Integer.MAX_VALUE);	//import 전
		System.out.println(MAX_VALUE);			//import 후	integer?long? 하나만 import
		
		String str= "2024";
		System.out.println(Integer.parseInt(str));	//import 전
		System.out.println(parseInt(str));			//import 후
		
		System.out.println(random());
		
	}//main

}//class
