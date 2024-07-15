package day0109;

/**
 * V.A를 사용하여 console에 출력한s method
 * System.out.format(), System.out.printf() - 출력후 줄 변경하지 않음 (\n으로 줇바꿈)
 * 
 */
public class UseVariableArguments2 {

	public static void main(String[] args) {
		
		int year=2024, month=1, day=9;
		System.out.println("오늘은"+year+"년 "+ month+"월"+ day+"일 입니다.");
		System.out.format("오늘은 %d년 %d월 %d일 입니다.\n", year,month,day);
		
		System.out.printf("정수출력: [%d][%5d][%-5d]\n", 19,19,19);		
		System.out.printf("문자출력: [%c][%5c][%-5c]\n",'A','A','A');
		System.out.printf("불린출력: [%b][%5b][%-5b]", true,true,true);
		
		System.out.printf("실수출력: [%f][%10.2f][%.3f]\n", 2024.0109,2024.0109,2024.0109);
		System.out.printf("문자열출력: [%s][%10s][%-10s]\n","자바","자바","자바" );
		
		String name="양수민";
		int javaScore=68;
		int oracleScore=70;
		int htmlScore=33;
		
		//아래와 같이 출력해보세요 (평균은 소수점 이하 1자리까지만 출력) 
		//XXX님 Java SE XX점, Oracle XX점, HTML XX점
		//총점: xx점 평균 xx점
		int sum=0;
		int average=0;
		
		sum= (javaScore+oracleScore+htmlScore);
		average= sum/3;
		System.out.printf("%s님 Java SE %d점, Oracle %d점, HTML %d점\n 총점: %d점 평균: %d점",
				name, javaScore, oracleScore, htmlScore, sum, average);
		
	}//main

}//class
