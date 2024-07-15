package day0103;

/** (alt + shift + j)
 *  main method의 arguments 입력과 사용에 대한 연습
 *  
 *  실행) java day0103.TestArguments 값 값 값...
 *  
 */
public class TestArguments {

	public static void main(String[] args) {
		
		System.out.println(args[0]);
		System.out.println(args[1]);
		System.out.println(args[2]);
		//문자열은 연산되지 않는다
		System.out.println(args[0]+ args[1] );	//ctrl+alt+▽
		
//		int i= args[0];	참조형을 기본형에 할당할 수 없다.
//		int i= (int)args[0]; string 형을 -> int 형으로 강제 형변환 불가(참조형-> 기본형)
		
//		문자열을 정수로 변환하는일 (method)를 사용
		int num=Integer.parseInt(args[0]); 
		int num2=Integer.parseInt(args[1]);
		System.out.println(num + "+ " + num2 +" = "+ (num + num2));
		
	}//main

}//class
