package day0103;

public class work0103 {

//	대중교통 기본요금
	public static final int MINIBUS_CHARGE=1200;
	public static final int BUS_CHARGE=1500;
	public static final int SUBWAY_CHARGE=1400;
	
	public static final int MONTH=20;
	
	
		
	public static void main(String[] args) {
		
//		제시된 요금표를 사용하여 아래 출력코드 작성
//		대증교통 수단과 이동거리 입력받아 처리하는 프로그램
//		입력한 대중교통 수단 1)마을버스 2)버스 3)지하철인 경우만 그렇지 않다면 "대중교통 수단이 아닙니다." 출력
//		출력형식) 
//		입력하신 교통수단은 [xx]이고, 이동거리는 [xx] km 입니다. (10km는 기본요금, 초과시 5km마다 +100원)
//		교통수단의 기본요금: [xx]원, 편도요금: [xx]원, 왕복요금: [xx]원, 한달20일기준 총 교통요금[xx]원
//		+플로우차트 작성
		
		String traffic= args[0];					//교통수단
		int movement= Integer.parseInt(args[1]);	//이동거리 
		
		int plus=0;			//초과요금
		
//		입력한 교통수단의 수단 별 기본요금 구하기
		if(traffic.equals("마을버스") || traffic.equals("버스") ) {
			plus=((movement-10) / 5) * 100;
		}
		
//		입력한 교통수단이 대중교통 일때 출력한다. 그렇지 않으면 "대중교통수단이 아님" 출력
		
		if(traffic.equals("마을버스")) {
			System.out.println("입력하신 교통수단은 "+ traffic + "이고,");

//			이동거리 조건문
			if(movement > 10) {		//10km 초과
				System.out.println("이동거리는" +movement+ "km 입니다.");
				System.out.println("교통수단의 기본요금:" +MINIBUS_CHARGE+ "원, 편도요금:" +(MINIBUS_CHARGE+plus)+"원, 왕복요금:" +((MINIBUS_CHARGE+plus)*2)+ " 한달 20일 기준 총 교통요금" +(((MINIBUS_CHARGE+plus)*2)*MONTH));
//				기본요금+초과요금(plus)
			} else {				//10km 이내
				System.out.println("이동거리는" +movement+ "km 입니다.");
				System.out.println("교통수단의 기본요금:" +MINIBUS_CHARGE+ "원, 편도요금:" +MINIBUS_CHARGE+"원, 왕복요금:" +(MINIBUS_CHARGE *2)+ " 한달 20일 기준 총 교통요금" +((MINIBUS_CHARGE*2)*MONTH));
			}
			
		}else if(traffic.equals("버스")) {
			System.out.println("입력하신 교통수단은 "+ traffic + "이고,");
			
			if(movement > 10) {
				System.out.println("이동거리는" +movement+ "km 입니다.");
				System.out.println("교통수단의 기본요금:" +BUS_CHARGE+ "원, 편도요금:" +(BUS_CHARGE+plus)+"원, 왕복요금:" +((BUS_CHARGE+plus)*2)+ " 한달 20일 기준 총 교통요금" +(((BUS_CHARGE+plus)*2)*MONTH));
			} else {
				System.out.println("이동거리는" +movement+ "km 입니다.");
				System.out.println("교통수단의 기본요금:" +BUS_CHARGE+ "원, 편도요금:" +BUS_CHARGE+"원, 왕복요금:" +(BUS_CHARGE*2)+ " 한달 20일 기준 총 교통요금" +((BUS_CHARGE*2) *MONTH));
			}
			
		}else if(traffic.equals("지하철")) {
			System.out.println("입력하신 교통수단은 "+ traffic + "이고,");
			
			if(movement > 10) {
				System.out.println("이동거리는" +movement+ "km 입니다.");
				System.out.println("교통수단의 기본요금:" +SUBWAY_CHARGE+ "원, 편도요금:" +(SUBWAY_CHARGE+plus)+"원, 왕복요금:" +((SUBWAY_CHARGE+plus)*2)+ "한달 20일 기준 총 교통요금" +(((SUBWAY_CHARGE+plus)*2)*MONTH));
			} else {
				System.out.println("이동거리는" +movement+ "km 입니다.");
				System.out.println("교통수단의 기본요금:" +SUBWAY_CHARGE+ "원, 편도요금:" +SUBWAY_CHARGE+"원, 왕복요금:" +(SUBWAY_CHARGE*2)+ "한달 20일 기준 총 교통요금" +((SUBWAY_CHARGE*2)*MONTH ));
			}
			
		}else {
			System.out.println("대중교통 수단이 아닙니다.");
		}
		
	}

}
