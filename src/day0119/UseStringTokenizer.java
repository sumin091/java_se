package day0119;

import java.util.StringTokenizer;

/**
 * 문자열을 짧은 한 마디로(token) 분리할때 사용하는 클래스 
 */
public class UseStringTokenizer {

	public UseStringTokenizer() {
		String data="월요일 화요일 수요일 목요일 금요일 퇼";
		//데이터를 자르기 위해 StringTokenizer 할당
		StringTokenizer stk= new StringTokenizer(data);
		
//		System.out.println(stk.nextToken());
//		System.out.println(stk.nextToken());
//		System.out.println(stk.nextToken());

		
//		for(int i=0; i<stk.countTokens(); i++) {
//			System.out.println(stk.nextToken());
//		}//end for 
		
		while(stk.hasMoreElements()){	//토큰이 존재하는지 모르지만 존재한다면 현재토큰을 얻고 포인터를 다음으로 옮긴다.
			System.out.println(stk.nextToken());
		}
		
		System.out.println("------------------------------------------");

		//		StringTokenizer stk= new StringTokenizer(data);
//		포인터가 한번 다 돌면 반대방향으로 back 하지않음
//		토큰을 다 추출하면 다음번에 사용할 수 없다.
		while(stk.hasMoreElements()){	//토큰이 존재하는지 모르지만 존재한다면 현재토큰을 얻고 포인터를 다음으로 옮긴다.
			System.out.println(stk.nextToken());
		}
		//end while
		System.out.println("토큰의 수:"+ stk.countTokens());
		
		
		//특정 문자열로 구분하는 생성자 StringTokenizer(데이터, "기준문자열", 토큰보호여부)
		String data2="Java,Oracle~JDBC,HTML.CSS.JavaScript,JavaScript Library";
		StringTokenizer stk2= new StringTokenizer(data2,",~. ",true);
		
		while(stk2.hasMoreTokens()) {	//현재 포인터 위치에서 토큰이 존재하는가?
			System.out.println(stk2.nextToken());
		}//end while
		
		
		
	}//UseStringBuilder
		
	public TokenDataVO csvData() {
		TokenDataVO tdVO=null;
		
		String data="오늘은,불금.입니다.주말엔 역시 자바공부죠! 그쵸? 아닌가? 데헷";
		//위의 문자열을 , 공백, .! 로 구분하여 배열과 총 토큰 수를 반환하고 출력해보세요
		StringTokenizer stk= new StringTokenizer(data,", .!");
		int tokenCnt=stk.countTokens();
		String[] temp= new String[tokenCnt];
		
		int i=0;
		//for문 while문 : 토큰의 존재여부를 모르기때문에 while문이 적합
		while(stk.hasMoreTokens()) {
			temp[i]=stk.nextToken();
			i++;
		}//end while
		
		tdVO= new TokenDataVO(temp, tokenCnt);
		
		return tdVO;
		
	}//csvData
		
//		//위의 문자열을 , 공백, .! 로 구분하여 배열과 총 토큰 수를 반환하고 출력해보세요
//		StringTokenizer str= new StringTokenizer(data,", .!");
//		
//		while(str.hasMoreTokens()) {
//			System.out.println(str.countTokens());
		
			
	public void useCsvData() {
		//csvData method를 호출해 배열에 담긴 값과 토큰수를 출력해보세요
		TokenDataVO tdVO= csvData();
		String[] temp=tdVO.getData();
		
		int cnt=tdVO.getCountToken();
		System.out.println("얻어낸 토큰 수 "+cnt);
		
		for(String value: temp){
			System.out.println(value);
		}//end for
	}//useCsvData
	
	public static void main(String[] args) {
		UseStringTokenizer ust= new UseStringTokenizer();
		ust.useCsvData();
	}//main

}//class
