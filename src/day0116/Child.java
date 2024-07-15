package day0116;

/**
 * Parent의 자식 클래스 : 공통특징은 부모에서 제공하는 것을 사용하고, 나 자신의 특징적인 일을 구한하여 사용
 */
public class Child extends Parent{
	
	String name;
	String msg;
	
	public Child() {
		System.out.println("자식의 생성자 ");
		msg="이 편지는 아프리카에서 부터 시작 되었음";	//같은 변수명을 가질경우: msg가 선언되어있지 않으면 부모 msg를 사용 but 자신의 클래스에서 msg가 있으면 사용
	}//Child
	
	/**
	 * 자식의 method
	 * @param name
	 */
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void printMsg() {
		
//		System.out.println("자식:"+super.msg+" , "+this.msg);
		System.out.println("자식: "+msg);
//		printMsg();	//재귀호출
		super.printMsg();
	}


	
	public static void main(String[] args) {
		
		//상속관계에서는 지식 클래스로 객체화 한다. => 부모가 먼저 만들어진다.
		Child c= new Child();
		
		//코드의 재사용성 (부모가 가진 변수나 method를 자식에서 자신의 객체명(c)로 사용할수 있는 것)
		c.setAge(20);
		System.out.println(c.getAge());
		c.setName("수민");
		System.out.println(c.getAge());    		//코드의 재사용성
		System.out.println(c.getName());
		c.printMsg();	//아프리카~
		
	}//main

}//class
