package day0118;

/**
 * 인터페이스를 구현하는 클래스 
 */
public class SuperInterImpl implements SuperInter {	//abstract을 붙이면 본래 속성을 없애게 되기에 추상메서드를 오버라이딩 해줘야 한다.


	/**
	 * 추상메서드는 반드시 구현(override)해야한다.
	 */
	@Override
	public String toDay() {
		return "오늘은 목요일 입니다.";
		}
	
	@Override
	public int getAge() {
		return 20;
		}
	
	public static void main(String[] args) {
		
		//인터페이스는 객체화 될 수 없다.
//		SuperInter is= new SuperInter(); 
		
		//구현클래스가 생성되고 그 주소를(객체) 저장할 수 있다.
		//is a 객체화
		SuperInter 	si= new SuperInterImpl();
		System.out.println(si);		//SuperInterImpl의 주소
		
		//si 객체로 호출가능 method Override한 method
		System.out.println(si.toDay());
		System.out.println(si.getAge());
		
		//JDK1.8이후 부터 default method를 호출
		System.out.println(si.defMethod());
		
	}//main
	
}//class
