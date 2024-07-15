package day0117;

import day0118.Fly;

/**
 * 사람의 공통 특징은 Person에 정의되어있고, 자식클래스인 HongGilDong은 자신의 특별한 기능만 정의
 * Clark은 자신의 특별한 기능만을 정의
 * 힘 레벨은 1~10까지 존재,
 * 01-18-2024 Fly구현 추가
 */
public class Clark extends Person implements Fly{
	public int power;
	
	/**
	 * clark의 기본 생성자, 눈2, 코1, 입1 개인 사람이 태어남
	 * clark은 힘이 쎄다. 
	 */
	public Clark() {
		power=10;
	}//Clark
	
	/**
	 * 돌에 종류에 따라 힘의강도가 달라진다.
	 * @param stone 돌의 종류
	 * @return 결과
	 */
	public String power(String stone) {
		String result="";
		
		if(stone.equals("다이아몬드")) {
			result="감사합니다";
		}else if(stone.equals("크립토나이트")) {
			result="힘이 빠집니다.";
			power=0;
		}else {
			result="열받음";
			power=12; 
		}
		
		return result;
	}//power
	
	/**
	 * 집에서 밥을 먹는 일 -> 집에서 빵을 먹는 일로 Override한 method
	 */
	@Override
	public String eat() {
		return getName()+"가 집에서 빵을 먹는 일";
	}//eat

	@Override
	public String eat(String menu, int price) {
		return getName()+"이 레스토랑에서 \""+menu+"\"인 음식을 "+price+"$ 주고 사 먹는다.";
	}//eat

	
	/**
	 * 슈퍼맨 객체가 날기위해 추력을 얻는 방법
	 */
	@Override
	public String drivingForce() {
		return "무릎을 꿇어서";
	}
	
	
	/**
	 * 슈퍼맨 객체가 날기위해 추력을 얻는 방법
	 */
	@Override
	public String lift() {
		return "망토를 사용하여";
	}	
	
	
}//class
