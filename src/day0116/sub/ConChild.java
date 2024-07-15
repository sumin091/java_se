package day0116.sub;

public class ConChild extends ConParent {

	public ConChild() {
		this(100);		//2 기본생성자 호출
		
		System.out.println("자식의 기본생성자");
	}
	
	public ConChild(int i) {
		super(100);	//3 부모 인자생성자 호출
		
		System.out.println("자식의 인자 생성자"+i);
		
	}
	
	public static void main(String[] args) {
		new ConChild();		//1
		//new ConChild(10);
		
		
	}//main
}//class
