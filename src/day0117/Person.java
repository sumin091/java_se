package day0117;

/**
 * 사람을 추상화하여 구현하는 클래스 => 사람의 공통 특징만 정의 => 
 * 추상클래스로 변환(추상클래스 => 상속관계에서 부모클래스를 만들때 사용)
 * 명사적 특징) 눈,코,입
 * 동사적 특징) 먹는 일 => (자식클래스가 부모에 정의한 먹는 일을 사용하지 않지만
 *  사람은 먹는 일을 반드시 해야한다.)
 * 객체생성하여 사용하는 일반 클래스
 * 사용법) 
 * Person 객체명= new Person();
 * 객체명.method() 호출해 사용
 */
public abstract class Person {
	
//	인스턴스 변수: 메모리 생성-> heap 영역(자동초기화)
	private int eye, nose, mouth;
	private String name;
	public String nick;
	
	
	
	/**
	 * 눈 2개, 코 1개, 입 1개인 사람 객체를 생성할때 사용하는 기본생성자
	 */
	public Person() {
//		eye=2;
//		nose=1;
//		mouth=1;
		this(2,1,1);
		
	}//Person
	
	
	/**
	 * 눈 n개, 코 n개, 입 n개인 사람 객체를 생성할때 사용하는 Overloading된 기본생성자
	 * @param eye	눈의 수
	 * @param nose	코의 수
	 * @param mouth	입의 수
	 */
	public Person(int eye, int nose, int mouth) {
		this.eye=eye;
		this.nose=nose;
		this.mouth=mouth;
	}
	
	
	/**
	 * 생성된 사람객체에 눈의개수를 설정 하는 일
	 * @param eye 눈의 개수
	 */
	public void setEye(int eye) {
		this.eye=eye;
		
	}//setEye
	
	
	/**
	 * 생성된 사람객체가 가지고 있는 눈의 개수를 반환 하는 일
	 * @return
	 */
	public int getEye() {
		return eye;
	}//getEye
	
	
	/**
	 * 생성된 사람객체에 코의 개수를 설정 하는 일 
	 * @param nose 설정할 코의 개수
	 */
	public void setNose(int nose) {
		this.nose=nose;
	}//setNose
	
	
	/**
	 * 생성된 사람객체가 가지고 있는 코의 개수를 반환 하는 일
	 * @return 코의 수
	 */
	public int getNose() {
		return nose;
	}//getNose
	
	
	/**
	 * 생성된 사람객체에 입의 개수를 설정 하는 일 
	 * @param mouth 설정할 입의 개수
	 */
	public void setMouth(int mouth) {
		this.mouth=mouth;
	}//setMouth
	

	/**
	 * 생성된 사람객체가 가지고 있는 입의 개수를 반환 하는 일 
	 * @return 입의 수
	 */
	public int getMouth() {
		return mouth;
	}//getMouth
	
	
	/**
	 * 생성된 사람객체에 이름을 설정 하는 일 
	 * @param name 설정할 이름
	 */
	public void setName(String name) {
		this.name=name;
	}//setName
	
	
	/**
	 * 생성된 사람객체의 이름을 반환 하는 일
	 * @return 설정된 이름 
	 */
	public String getName() {
		return name;
	}//getName
	
	
	
	/**
	 * 사람의 동사적인 특징 중 집에서 밥을 먹는일 정의한 method
	 * 집에서 먹는 일은 자식 클래스에서 자신에 맞게 정의한다.
	 * @return 집에서 먹는 행동
	 */
	public abstract String eat();
	
	//메서드 오버로딩(다른 매개변수)
	/**
	 * 사람의 동사적 특징 중 외부에서 사먹는 일 정의한 method
	 * 밖에서 사먹는일은 자식 클래스에서 자신에 맞게 구현한다.
	 * @param menu 음식종류
	 * @param price 음식가격
	 * @return 사먹는 행동
	 */
	public abstract String eat(String menu, int price);


	@Override
	public String toString() {
		return "닝겐입니다.";
	}
	
	
}//class
