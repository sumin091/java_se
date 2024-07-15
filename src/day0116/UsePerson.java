package day0116;

/**
 * Person 클래스의 자식클래스를 사용하기 위해 만든 클래스
 */
public class UsePerson {

	private void usePerson() {
		
		
		HongGilDong hgd= new HongGilDong();
		
		//코드의 재사용성: 부모클래스의 method, 변수를 내 클래스에 존재하는 것처럼 사용
		hgd.setName("홍길동");
		System.out.printf("눈 %d, 코 %d, 입 %d, 이름 %s\n", hgd.getEye(), hgd.getNose(), hgd.getMouth(),hgd.getName());
		System.out.println(hgd.fight(5));//6 -> 7
		System.out.println(hgd.fight(6));//7 -> 8
		System.out.println(hgd.fight(8));//7 -> 8
		System.out.println(hgd.fight(9));//8 -> 7
		System.out.println(hgd.getLevel());
		
		System.out.println("------------------------------");
		Clark supermen= new Clark();
		//코드의 재사용성: 부모클래스의 method, 변수를 내 클래스에 존재하는 것처럼 사용
				supermen.setName("클락켄트");
				System.out.printf("눈 %d, 코 %d, 입 %d, 이름 %s\n", supermen.getEye(), supermen.getNose(), supermen.getMouth(),supermen.getName());
		
		System.out.println(supermen.power("다이아몬드"));
		System.out.println(supermen.power("크립토나이트"));
		System.out.println(supermen.power("짱돌"));
		System.out.println(supermen.power);
		
		System.out.println("------------------------------");
		
		//코드의 재사용성: 부모클래스에 존재하는 변수나 method를 자식클래스에서 
		//자식의 객체명으로 사용하는 것 => 부모에서 제공하는 기능이 자식과 맞지않을때 
		System.out.println(hgd.eat());
		System.out.println(supermen.eat());
		System.out.println(hgd.eat("뜨끈한 국밥",3));
		System.out.println(supermen.eat("스테이크",10));
		
		
		System.out.println(hgd);	//toString() method 호출로 주소값 출력	
		System.out.println(supermen);
		
		
	}//usePerson
	
	public static void main(String[] args) {
		//usePerson class 객체화
		UsePerson up = new UsePerson();
		
		up.usePerson();
		
		
		
	}

}
