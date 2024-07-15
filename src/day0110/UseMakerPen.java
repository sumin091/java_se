package day0110;

/**
 * MakerPen클래스에 제공하는 기능(일,method)을 사용하는 클래스이다.
 */
public class UseMakerPen {

	public static void main(String[] args) {
		
		//객체화
		MakerPen mp= new MakerPen();
		System.out.println("주소: "+mp);		//주소값(힙영역) 출력
		
		//변수에 값을 직접 할당(할당할때 마다 제어문을 써야함) => 입력값을 체크하는 중복코드, human error 발생가능성
//		mp.cap=1;		//캡슐화가 되어있어서 invisible -> 1)접근제어자 수정(위험) 2)setter 사용
//		
//		if(mp.cap != 1) {
//			mp.cap =1;
//		}
//		
//		mp.setCap(10);
//		mp.setBody(1);
//		mp.setColor("초록");
		
		
		System.out.printf("뚜껑의 개수 %d개, 몸체의 수 %d개, 색 %s색 \n",
				mp.getCap(), mp.getBody(), mp.getColor());
		
		
		
		//클래스가 제공하는 기능을 사용
		String result = mp.write("오늘은 눈내리는 화요일!");
		System.out.println(result);
		
		
		//파란색 마카펜을 생성하고 오늘은 맑은 수요일을 칠판에 써보는 코드 작성
		MakerPen blue= new MakerPen(1,1,"파란");
//		blue.setColor("파란");	//MarkerPen은 기본 검은색으로 설정되어 있는데 색을 파란색으로 변경
		
		result=blue.write("오늘은 맑은 수요일");
		System.out.println(result);
	}

}
