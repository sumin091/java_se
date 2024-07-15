package day0122;

import java.text.DecimalFormat;

public class UseDecimalFormat {
	 
	public UseDecimalFormat() {
		int i=9_750_000;	//JDK1.7에서부터는 숫자에 가독성을 향상싱키기 위해서
		//숫자에 _를 넣을수 있는 기능을 제공
		int j=90_000_000;
		System.out.println(i);	//_는 출력되지 않는다.
		System.out.println(j);
		
		System.out.println("----------------------------------");
		DecimalFormat dcf= new DecimalFormat("0,000,000");
		System.out.println(dcf.format(2024));	//데이터가 없으면 0 채워 반환
		
		DecimalFormat dcf2= new DecimalFormat("#,###,###");
		System.out.println(dcf2.format(2024));	//데이터가 존재하는 것까지만 반환
		
		DecimalFormat dcf3= new DecimalFormat("#,###");	//3자리마다 ,를 넣어 출력
		System.out.println(dcf3.format(2147483547));	
	}//UseDecimalFormat
	
	public static void main(String[] args) {
		new UseDecimalFormat();
	}

}
