/*
관계연산자: 대소비교
>, <, >=, <=, ==, !=
*/
package day1228;

class Operator4 {
	public static void main(String[] args) {

		int num=10, num2=20, num3=10;

		System.out.println(num +" == "+ num3 +" = " +( num == num3));	//true
		//error: System.out.println(num +" == "+ num3 +" = " + num == num3);  우선순위
		System.out.println(num +" == "+ num2 +" = " +( num == num2));	//false

		System.out.println(num +" != "+ num3 +" = " +( num != num3));	//false
		System.out.println(num +" != "+ num2 +" = " +( num != num2));	//true
	}//main
}//class
