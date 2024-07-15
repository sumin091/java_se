/*
산술연산자 : +, -  *,  /, %
*/
package day1228;

class Operator2 {
	public static void main(String[] args) {
		int i=10;
		System.out.println(i +"를 2로 나눈 나머지:" + (i%2));			//0 또는 1

		i=112823829;
		System.out.println(i +"를 2로 나눈 나머지:" + (i%2));			//0 또는 1

		int birth=2001;
		System.out.println(birth +"를 12로 나눈 나머지:" + (birth%12));			//띠 (0~11: 원숭이,닭,개,돼지,쥐,소,호랑이,토끼,용,뱀,말,양)

		// 정수/정수 = 정수
		int num=10;
		int num2= 3;
		System.out.println(num+ "/" + num2 + "=" + (num / num2) ); // 10/3= 3 항상 정수값만 

		// 정수 / 실수 = 실수 : 연산 결과를 실수로 얻고싶다면 나누는 값 중 하나는 실수여야만 한다.
		System.out.println(num+ "/" + num2 + "=" + (num / (double)num2) ); // int -> double => double형으로 출력
	}//main
}//class
