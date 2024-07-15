/*
단항 연산자: 연산에 필요한 항이 하나인 연산자.
~, !, +, -, ++, --
*/
package day1228;

class Operator1{
	public static void main(String[] args){
		
		//~: tilde -1 의 보수 연산
		//~양수: 부호변경 1 증가, ~음수: 부호변경 1감소
		int i= 10, j=-10;
		System.out.println("~"+ i + " = " + ~i);	//-11
		System.out.println("~"+ j + " = " + ~j);	//9

		//~를 사용하여 부호만 변경하고 싶다.
		System.out.println(~i);	//-11
		System.out.println(~i + 1 );	//-10
        
		
		i=12;
		j=28;
		System.out.println( i <  j );		//System.out.println( ! i <  j ); => error: !은 T/F 앞에서만 정의가능
        System.out.println( i +"<" + j + "=" + (!(i<j)));	//!true -> false
		boolean flag1= true, flag2=false;
		System.out.println( " ! " +flag1+ " = " + !flag1 );		// true -> false
        System.out.println( "i" +flag2+ "=" + flag2);			//false -> true

		i=12;
		j=-12;
		System.out.println( "-" +i+ " = " + -i);				//12 -> -12
		System.out.println( "-" +j+ " = " + -j);				//-12 -> 12

		// i=5;
		// J=10;
		//System.out.println( "설정된 값" +i+", " + j );				

		++i;		//전위연산 6
		--j;			//전위연산 9
		++i;		//6 -> 7
		--j;			//9 -> 8

		System.out.println( "전위연산 후: i = " + i + ", j= " + j);				

		i++;		//후위연산: 7 -> 8
		j--;			//후위연산: 8 -> 7

		System.out.println("후위연산 후: i=" + i+ ", j= " + j);

		//전위와 후위는 대입연산과 함께 사용되면 각자 다른 값을 대입한다.
		i=10;
		int result=0;

		//전위연산 : 증감 먼저 (단항 수행 후 대입 수행)
		result= ++i;
		System.out.println("result:" +result+ ", i:" +i );

		i=10;
		//후위연산: 증감은 연산이 모두 끝난 후 실행(대입 후 단항을 수행)
		result= i++;
		System.out.println("후위연산 result:" +result+ ", i: " + i);

		i=10;
		j=10;
		System.out.println("전위:" + ++i );
		System.out.println("후위:" + j++ );

		System.out.println("method 호출 후 i :" + i + ", j:" +j); 
		

	}//main
}//class
