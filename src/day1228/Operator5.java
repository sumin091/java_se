/*
논리연산자
 일반논리: 여러개의 관계연산자를 붙여서 연산할때 사용
 && (AND) - 전항과 후항이 모두 true일때 만 true반환
 || (OR) - 전항과 후항이 모두 false일때 만 false반환

 비트논리 : 비트를 연산
 & (AND): 상위비트와 하위비트가 모두 1일때만 1 연산
 | (OR): 상위비트와 하위비트가 모두 0일때만 0 연산
 ^ (XOR): 상위비트와 하위비트 둘 중 하나만 1인 경우 1연산
*/
package day1228;

class Operator5{
	public static void main(String[] args) {
	
	boolean flag= true, flag2=false, flag3=true, flag4=false;

	System.out.println("-------AND-------");
	System.out.println(flag +" && " + flag3 + " = " + (flag && flag3) );		//true 
	// System.out.println(flag +" && " + flag3 + " = " + flag && flag3 ); -> error, 우선순위
	System.out.println(flag +" && " + flag2 + " = " + (flag && flag2) );		//false
	System.out.println(flag2 +" && " + flag + " = " + (flag2 && flag) );		//false
	System.out.println(flag2 +" && " + flag4 + " = " + (flag2 && flag4) );	//false


	System.out.println("-------OR-------");
   	System.out.println(flag +" || " + flag3 + " = " + (flag || flag3) );		//true
	System.out.println(flag +" || " + flag2 + " = " + (flag || flag2) );		//true
	System.out.println(flag2 +" || " + flag + " = " + (flag2 || flag) );		//true
	System.out.println(flag2 +" || " + flag4 + " = " + (flag2 || flag4) );	//false

	//&&: 전항이 false라면 후항 연산하지 않음
	//||: 전항이 true라면 후항 연산하지 않음

	flag= false;
	flag2=false;
	flag3=false;
	flag3= (flag= 3<2) && (flag2= 5<6);		

	System.out.println(flag + " && " + flag2 + " = " + flag3);	

	
	//int octalNum=임의의 한자리 양수;			//0~9

	//octalNum이 8진수의 범위라면 true, 그렇지 않다면 false 출력
	/*
	if(0<octalNum<7){
		System.out.println("true");
	}else{
		System.out.println("false");
	*/
	
	int octalNum=9;
	System.out.println(octalNum+"은" );
	System.out.println( octalNum > -1 && octalNum < 8);	


	int i=37, j=14;
	System.out.println(i + "&" + j + "=" + (i & j) ); //0000 0100 
	//System.out.println(i + "&" + j + "=" + i & j ); => error 연산 우선순위
	
	System.out.println(i + "&" + j + "=" + (i | j) ); //0010 1111
	System.out.println(i + "&" + j + "=" + (i ^ j) ); //0010 1011

	}//main
}//class
