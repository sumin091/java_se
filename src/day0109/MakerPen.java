package day0109;

/**
 * 마카펜을 대상으로 하여 추상화한 후 작성하는 클래스
 */
public class MakerPen {
	
	int cap,body;
	private String color;
	
	/**
	 * 생성된 마카펜 객체의 뚜껑의 개수를 설정하는 일
	 * 마카펜의 뚜껑은 1개만 설정된다.
	 * @param cap 뚜껑의 개수
	 */
	public void setCap(int cap) {
		
		if(cap != 1) {
			cap=1;		//validation 
		}//if
		
		this.cap=cap;
	}//setCap
	
	
	/**
	 * 생성된 마카펜 객체 뚜껑의 개수를 반환하는일
	 * @return 마카펜 객체의 뚜껑 개수
	 */
	public int getCap() {
		return cap;
	}//getCap
	
	
	/**
	 * 생성된 마카펜 객체의 몸체 개수를 설정하는 일
	 * @param body 설정할 몸체의 수
	 */
	public void setBody(int body) {
		this.body=body;
	}//setBody

	
	/**
	 * 생성된 마카펜 객체의 몸체 개수를 반환 하는일
	 * @return 몸체의 개수
	 */
	public int getBody() {
		return body;
	}//getBody
	
	
	/**
	 * 생성된 마커펜 객체의 색을 설정하는 일
	 * 색은 "검은","파란","빨간"만 설정가능 
	 * 그 외의 색이 입력되면 검은색으로 instance variable를 설정 
	 * @param color 설정할 색
	 */
	public void setColor(String color) {
		
		if(color.equals("검은")) {
			color="검은";
		}else if(color.equals("파란")) {
			color="파란";
		}else if(color.equals("빨간")) {
			color="빨간";
		}else {
			color="검은";
		}
//		.equals()를 사용하면 기본형/참조형 모두 비교가 가능

//		if( ! (color.equals("검은") || color.equals("파란") || color.equals("빨간"))){
//			color="검은";
//		}
			
		this.color=color;
	}//setColor
	
	
	/**
	 * 생성된 마카펜 객체의 색을 반환 하는일
	 * @return 설정된 색
	 */
	public String getColor() {
		return color;
	}//getColor
	
	/**
	 * 마카펜 객체의 동사적인(칠판에 쓰는 동작) 특징을 구현
	 * @param msg 쓰고싶은 메시지
	 * @return 쓰는 동작
	 */
	public String write(String msg) {
		
		return "\""+msg+"\"를 "+color+"색으로 칠판에 쓴다.";
	}//write
	
}//class
