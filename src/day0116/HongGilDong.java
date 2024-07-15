package day0116;

/**
 * 사람의 공통 특징은 Person에 정의되어있고, 자식클래스인 HongGilDong은 자신의 특별한 기능만 정의
 * HongGilDong은 자신의 특별한 기능만을 정의
 * 싸움 레벨은 1~10까지 존재,
 */
public class HongGilDong extends Person{

	private int level;
	
	/**
	 * 홍길동의 기본 생성자, 눈2, 코1, 입1 개인 사람이 태어남
	 * 홍길동은 싸움을 평민보다 잘한다. 
	 */
	public HongGilDong() {
//		super();	//숨겨져있다.
		level=6;
	}//HongGilDong
	
	/**
	 * 싸움을 하는 일
	 * @param yourLevel 상대방의 레벨
	 * @return 싸움의 결과
	 */
	public String fight(int yourLevel) {
		String result="";
		
		if( level < yourLevel) {	//싸움에서 지는 경우
			result="싸움에서 졌음. O(>.<)O";
			level--;
			if(level < 1) {
				level=1;
			}//
		}else if(level < yourLevel ) {//싸움에서 이기는 경우	
			result="이겼음";
			level++;
			if(level >10) {
				level=10;
			}
		
		}else {		////싸움에서 비기는 경우
			result="비겼음";
		}//end else
		
		return result;
	}//fight
	
	public int getLevel() {
		return level;
	}//getLevel
	
	/**
	 * 식당에서 화폐단위가 원인 일 -> 주막에서 화폐단위가 푼으로 변경되는 일 Override
	 */
	@Override
	public String eat(String menu, int price) {
		return getName()+"이 주막에서 \""+menu+"\"인 음식을 "+price+"푼 주고 사 먹는다.";
	}//eat

//	@Override
//	public String toString() {
//		return "나는 "+getName()+"이다.";
//	}//toString
//	
	
}//class
