package day0112;

/**
 * 문자열 클래스 사용
 * 
 */
public class UseString2 {

	public static void main(String[] args) {

		String fileName="Test.bat";
//		System.out.println("파일명 : "+fileName.substring(0,4));
//		System.out.println("확장자 : "+fileName.substring(5,8));
//		
		System.out.println("파일명: "+fileName.substring(0,fileName.lastIndexOf(".")));
		System.out.println("확장자: "+fileName.substring(fileName.lastIndexOf(".")));
		
		String str="";		//""(empty)로 초기화	=> String 클래스에서 제공하는 instance method 사용가능
		String str1=null;	//null로 초기화	=>	String 클래스에서 제공하는 instance method 사용불가
		
		System.out.println(fileName+ "는 비었니? "+fileName.isEmpty());
		System.out.println(str+"는 비었니? "+str.isEmpty());
		//System.out.println(str1+"는 비었니? "+str1.isEmpty());		//error
		//null로 초기화된 객체의 method를 호출하면 에러발생
		
		str="   A BC   ";
		String temp=str.trim();		//문자열의 앞뒤 공백을 제거, trim()은 문자열 사이 공백제거 불가
		System.out.printf("[%s][%s]\n",str,temp);
		
		str="Java Oracle JDBC JSON";
		temp= str.replace("J", "j");		//str.replaceAll() 
		System.out.println(str+" 변경된 문자열 "+ temp);
		
		String msg="나 지금 피씨방인데, 넌 어디니 ㅆ ㅣ    방새야";
		//method chain
		String filter=msg.replaceFirst("씨", "*").replaceAll("방", "*").replaceFirst("ㅆ", "*");
		System.out.println(filter);
		
		//method를 연속하여 호출하는 chain 문법은 반환형을 확인한 후 사용한다.
		temp=msg.concat(" 데헷").replaceAll("씨방", "**").trim().toUpperCase();
		System.out.println(temp);
		
		msg="내 전화번호는 010-1234-5678 내친구는 010-2222-3333 내 나이는 20살";
		temp=msg.replaceAll("\\d", "*");
		System.out.println(temp);
		
		msg="내 현재 전화번호는 010-1234-5678 내친구 전번은 010-2222-3333"+
		"내 나이는 20살 이전 전화번호는 011-123-4567 태어난 해는 1995년"+
				" 집 전화번호는 02-123-4567 아! 듀얼번호는 010-3345-7788";
		temp=msg.replaceAll("(\\d{3})-(\\d{4})-(\\d{4})", "xxx-xxxx-xxxx" );
		System.out.println(temp);
		
		System.out.println("----------------------------------------------");
		
		msg="내 현재 전화번호는 010-1234-5678 내친구 전번은 010-2222-3333 \n"+
				"내 나이는 20살 이전 전화번호는 011-123-4567 태어난 해는 1995년 \\n"+
						" 집 전화번호는 02-123-4567 아! 듀얼번호는 010-3345-7788";
		temp=msg.replaceAll("(\\d{3})-(\\d{4})-(\\d{4})", "$1-xxxx-$3" );
		System.out.println(temp);
		
		
		msg="전화번호는 010-1234-5678임";
		temp=msg.replaceAll("(\\d{3}-)\\d{1}(\\d{3}-\\d{4})", "$1x$2");
		System.out.println(temp);	//010-x1234-5678
				
		
		msg="내 메일주소는 test@daum.net 과 Hello12 Java test@sist.co. test@sist.com";
		
//		temp=msg.replaceAll("[a-z]", "");			//소문자
//		temp=msg.replaceAll("[A-Z]", "");			//대문자
//		temp=msg.replaceAll("[0-9]", "");			//숫자
//		temp=msg.replaceAll("[ㄱ-힣]","");			//한글
//		temp=msg.replaceAll("[da]", "");			// 범위(-)가 아니면 각각의 문자가 된다.
		temp=msg.replaceAll("[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}", "xxxx@xxx.xxx");
		System.out.println(temp);
		
		int i=12;
		temp=String.valueOf(i);			//Integer.parseInt와 반대
//		temp=i+"";						//가능하나 비추천
		System.out.println(temp);
		
		double d=2024.01;
		temp=String.valueOf(d);
		System.out.println(temp);
		
//		String csvData="Java, Oracle, JDBC, HTML, CSS, JavaScript";
//		String[] arr= csvData.split(",");
		
		String[] arr="Java, Oracle, JDBC, HTML, CSS, JavaScript".split(",");
		
		for(String data: arr) {
			System.out.println(data);
		}//end for
		
		String[] arr2="어쩔.저쩔.뇌절.안물.안궁.개킹받쥬".split("[.]");	//"."은 적용안됨
		
		for(String data: arr2) {
			System.out.println(data);
		}//end for
		
		
		
		
		
		
	}//main

}//class
