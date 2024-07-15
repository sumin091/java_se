package day0116;

public class UseWork0116VO {

		
	public static void main(String[] args) {
		
		//1.배열선언
		Work0116VO[] wkVOArr=null;
		
		//2.생성 배열명= new 데이터형[방의수];
		wkVOArr= new Work0116VO[7];
		
		wkVOArr[0]= new Work0116VO("고한별","서울시 강남구 역삼동",25);
		wkVOArr[1]= new Work0116VO("김동수","경기도 수원시 영통구 영통동",20);
		wkVOArr[2]= new Work0116VO("김동섭","서울시 강남구 서초동",28);
		wkVOArr[3]= new Work0116VO("정명호","마계서울시 부평구 부평동",26);
		wkVOArr[4]= new Work0116VO("양수민","경기도 부천시 부천동",25);
		wkVOArr[5]= new Work0116VO("진수현","서울시 동대문구 동대문동",27);
		wkVOArr[6]= new Work0116VO("수연","서울시 구로구 구로동",26);
		
		
		//값 출력
		for(Work0116VO wkVO : wkVOArr) {
			System.out.printf("%s\t%s\t%d\n", wkVO.getName(), wkVO.getAddr(), wkVO.getAge());
			
		}//end for
		
		//이름에 "수"가 들어가는 사람 수 출력
		
		int cnt=0;
		
		for(Work0116VO wkVO : wkVOArr) {
			cnt += (wkVO.getName().contains("수"))? 1: 0;
					
		}//end for
		System.out.printf("\n이름에 '수'가 들어가는 사람 수: %s",cnt+"명");

		
		
		//서울시에 살고 있는 사람 수 출력
		int cnt2=0;
		
		for(Work0116VO wkVO : wkVOArr) {
			cnt2+= (wkVO.getAddr().startsWith("서울시"))? 1:0;
			
		}//end for
		System.out.printf("\n서울시에 살고있는 사람 수: %s",cnt2+"명");

		
		//나이의 합
		int totalAge=0;
			
		
		for(int i=0; i<wkVOArr.length; i++) {
			totalAge+= wkVOArr[i].getAge();
			
		}//end for
		
		System.out.printf("\n나이의 총 합: %d", totalAge);
		
	}//main
	
}//class
