package day0116.sub;

public class ConParent {
	
	public ConParent() {
		super();	//object 호출
		System.out.println("부모의 기본생성자");
	}
	
	public ConParent(int i) {
		this();	//4 기본생성자 호출
		
		System.out.println("부모의 인자 생성자"+i);
	}
	
	
}
