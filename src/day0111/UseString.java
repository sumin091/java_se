package day0111;

/**
 * 문자열의 사용
 * 문자열 저장소에 저장된 시작주소를 저장하고 사용하기 위한 데이터형으로 java.lang.String 클래스(참조형 데이터형(class, array, String) - new사용)제공
 * 
 */
public class UseString {

	public static void main(String[] args) {

		//기본형 형식의 사용(new를 사용하지 않고 사용)
		String str= "ABCDE";
		
		
		//참조형 형식의 사용(new를 사용)
		String str1= new String("ABCDE");
		
		System.out.println("기본형: "+str);
		System.out.println("참조형: "+str1);
		
		
		//비교
		System.out.println("기본형 형식 "+ (str == "ABCDE"));	//t
		System.out.println("기본형 형식 "+ (str1 == "ABCDE"));	//t
		
		
//		equals비교: 기본형 형식과 참조형 형식이 같은 결과를 반환한다
		System.out.println("equals 기본형 형식"+ (str.equals("ABCDE")));
		System.out.println("equals 참조형 형식"+ (str1.equals("ABCDE")));
		
		System.out.println(str1+"은 "+str1.length()+"자");
		str1="yming3595@gmail.com";
		int leng= str1.length();
		
		System.out.printf("%s는 %d자 \n", str1, leng);	
		
		str="abCedF";
		System.out.println(str+"을 모두 대문자로"+ str.toUpperCase());
		System.out.println(str+"을 모두 소문자로"+ str.toLowerCase());
		System.out.println(str+"에서 3번째 문자"+ str.charAt(3));
		
		//특수 문자만 꺼내 출력: charAt
		char c= str.charAt(1);
		System.out.println(str+"에서 1번째 인덱스의 문자: "+c);
		
		//자신의 메일 주소에서 @을 변수에 저장해 출력
		c =str1.charAt(9);
		System.out.println(str1+"에서 9번째" +c);
		
		//문자열 안에서 특정 문자열의 시작인덱스 얻기: indexOf
		str="Java Oracle JDBC";
		System.out.println(str+"에서 \"Oracle\"의 인덱스"+ str.indexOf("Ora"));
		
		//존재하지 않는 문자열은 error (-1이 나옴)
		System.out.println(str+"에서 \"a\"의 인덱스 " +str.indexOf("a"));
		//같은 문자열이 있다면 처음 문자열의 인덱스만 나온다.
		System.out.println(str+"에서 두번째 \"a\"의 인덱스 " +str.indexOf("a", str.indexOf("a"+1)));
		
		
		//문자열 안에서 특정 문자열의 인덱스 얻기( R -> L) :lastIndexOf
		System.out.println(str+"에서 뒤에서 부터 찾은 'a'의 인덱스"+ str.lastIndexOf("a"));
		
		//concat
		String str2=str.concat(" HTML");
		System.out.println(str2);
		
		//자식 문자열 얻기: substring
		//Java Oracle JDBC HTML
		String str3=str2.substring(5,11);		//Oracle
		System.out.println(str3);
		
		
		//str1="yming3595@gmail.com";
		//str1에서 메일주소(로컬파트)를 얻기
		//str1에서 도메인 파트(TLD- Top Level Domain)얻기
		String str4=str1.substring(0,9);		//substring(0, str.indexOf("@"): 도메인,로컬 나눠서 출력
		String str5=str1.substring(10,19);		//substring(10, str.length())
		System.out.println("로컬파트: "+str4);
		System.out.println("도메인 파트: "+str5);
		
		//시작인덱스만 설정하면 끝까지 잘라낸다.
		str1.substring((str.indexOf("@")+1));
		
		//특정문자열로 시작했는지 구분: startsWith
		boolean flag=str2.startsWith("Java");
		System.out.println(str2+"는 Java로 시작했는가? "+flag);
		
		
		flag=str2.startsWith("java");
		System.out.println(str2+"는 Java로 시작했는가? "+flag);
		
		System.out.println("-------------------------------");
		
		String name="양수민";
		if(name.startsWith("김")) {
			System.out.println(name+"님은 '김'씨 입니다.");
		}else {
			System.out.println(name+"님은 '김'씨가 아닙니다.");
		}
		
		System.out.println("-------------------------------");
		
		
		//특정 문자열로 끝나는지: endsWith
		String addr="서울시 강남구 역삼동";		
		if(addr.endsWith("동")){
			System.out.println("도시");
		}else {
			System.out.println("시골");
		}
				
		System.out.println("-------------------------------");
		
		//Contains : 중간에 포함되던 시작되던 포함여부에 대한 판단
//		str3="오늘은 Java를 공부하였다.";
//		str3="Java는 WORA가 특징인 완벽한 OOP 언어입니다.";
		str3="오늘도 긴시간 함께 공부하시느라 고생 많으셨Java";
		
		if(str3.contains("Java")) {
			System.out.println(str3+"안에는 \"Java\"가 포함되어있다.");
		}else {
			System.out.println(str3+"안에는 \"Java\"가 없다.");
		}
		
		System.out.println("-------------------------------");
		
		
		String mail1="test@test.com";	
		String mail2="testtest.com";
		String mail3= "us123@test.com";
		//아래의 method를 호출하여 mail1~3을 넣고 유효한지 출력
		
		
		
		UseString us= new UseString();
		us.mailPrint(mail1);
		us.mailPrint(mail2);
		us.mailPrint(mail3);
		
	}//main
		
		
		public void mailPrint(String s) {
			System.out.println(s);
			String result="무효";
						
			if(s.length() >= 7 && s.indexOf("@") != -1 && s.indexOf(".") != -1) {
				result="유효";	
			}
			
			System.out.println(result);
			
//			if(s.length() >= 7 && s.indexOf("@") != -1 && s.indexOf(".") != -1) {
//			System.out.println("유효메일");
//		}else {
//			System.out.println("무효메일");
//		}
		}//mailPrint
		
		//mail 주소를 입력받아 유효한 메일인지 무효한 메일인지 판단하는 method 생성
		//유효한 메일은 7자 이상이면서 @과 . 포함되어야 한다.
		//그러면 유효메일을 출력, 그렇지 않으면 무효메일 출력
		
		
		
		
		
		
		
		
		
		
		
		
	}//class


