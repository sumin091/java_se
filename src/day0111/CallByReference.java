package day0111;

/**
 * method의 매개변수로 클래스가 정의되면 주소(유일)가 넘어간다.
 */
public class CallByReference {

	int i, j;
	
	public void swap(CallByReference cbr) {
		int temp=0;
		temp=cbr.i;		//2024
		cbr.i=cbr.j;	//1		heap영역에 주소값이 바뀜 
		cbr.j=temp;
		System.out.println("swap 메서드 안 i: "+cbr.i+",j: "+cbr.j);
	}//swap
	
	public static void main(String[] args) {
		CallByReference cbr= new CallByReference();		//기본생성자를 사용해 객체화
		
		cbr.i=2024;
		cbr.j=1;
		
		System.out.println("swap 메서드 전 i: "+cbr.i+ ",j: "+cbr.j);
		cbr.swap(cbr);
		System.out.println("swap 메서드 후 i: "+cbr.i+ ",j: "+cbr.j);
	}//main

}//class
