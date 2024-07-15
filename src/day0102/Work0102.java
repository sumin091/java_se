package day0102;

public class Work0102 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//문제1
		//1-1 두 정수를 저장할 수 있는 변수를 만들고, 임의의 값을 할당한다.
		//1-2 위의 변수 중의 큰 값을 반환하는 삼항 연산자를 만들어보세요.
		
		int num1= 25;
		int num2= 70;
		System.out.println(num1 > num2  ? num1 : num2 );
		
		
		//문제2
		//1-1 세개의 정수를 저장할 수 있는 변수를 만들고 각각의 변수의 임의의 값을 할당한다.
		//1-2 세개의 숫자중 가장 작은 값을 찾아서 출력하는 코드를 생성하세요.
		
		int a= 13;
		int b= 11;
		int c= 5;
		System.out.println( (b > a && c > a) ? a : (c > b ? b : c) );
		
		//문제3
		//int temp1= 10, temp2=20 이 할당된 변수를 선언하고 아래코드 작성시 어떤 값이 출력되는지 예상해보고, 
		//어떻게 결과가 도출됬는지 설명
		
		int temp1= 10, temp2= 20;
		System.out.println(++temp1 + temp2--);	// 11+20 = 31-1=30
		System.out.println(" temp1: " + temp1 + " temp2:" + temp2);
		//전위연산을 해서 temp1=11 인 상태에서 11+temp2 연산을 하고 후위연산 --를 해서 30
		
		//문제4
		//Integer.MAX_VALUE Constant를 사용하여 integer의 하위 2byte 값이 출력되도록
		//비트논리 연산자를 사용하여 출력 (65535)
		
		System.out.println(Integer.MAX_VALUE & Character.MAX_VALUE);
		//0111 1111 1111 1111 1111 1111 1111 1111 => 상위 2byte 쳐내기
		//char 비트연산 최대값 1111 1111 1111 1111 -> 10진수로 변환하면 65535
		
		//0111 1111 1111 1111 1111 1111 1111 1111
		//0000 0000 0000 0000 1111 1111 1111 1111
		System.out.println(Integer.MAX_VALUE+ "의 하위 2byte 값:"+
		(Integer.MAX_VALUE & 0x0000FFFF));
		
		
	}//main

}//class
