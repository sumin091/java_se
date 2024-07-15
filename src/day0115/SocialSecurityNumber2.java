package day0115;

public class SocialSecurityNumber2 {
	private String ssn;
	
 /**
  * 주민등록번호를 입력받아 instance 변수에 저장하는 일
 * @param ssn 주민등록번호
 */
public	SocialSecurityNumber2(String ssn){
	 this.ssn = ssn;
	}//SocialSecurityNumber
  public void  setSsn(String ssn) {
	  this.ssn = ssn;
  }//setSsn
  
  public String getSsn() {
	  return ssn;
  }//getSsn
  
  /**
   * 생성자를 통해 객체가 가지고 있는 주민등록번호의  (member 변수, instance변수)
   * 자릿수 14자리인지 체크
   * 
   * @return
   */
public boolean checkDigit() {
//	  int leng =ssn.length();
	  boolean flag=false;
//	  if (leng == 14) {
//		flag=true;
//	  }else {
//		  flag=false;
//	  }
	  
//	  if(ssn.length()==14) {
//		  flag=true;
//	  }
//	  return flag;

	  return ssn.length() == 14;
  }//checkDigit

  /**
   * 생성자를 통해 객체가 저장하고 있는 주민등록번호의 -의 위치를 체크
   * @return -가 정상적인 위치에 존재
   */
public boolean checkDash() {
//	  int index = ssn.indexOf("-");
//	  boolean flag=false;
//	  if(index == 6) {
//		  flag=true;
//	  }
//	  return flag;
	  
//	  boolean flag= ssn.indexOf("-") ==6;
//	  return flag;
	  
	  return ssn.indexOf("-") ==6;
  }//checkDash
  

  /**
   * 생성자를 통해 객체가 저장하고 있는 주민등록번호를 사용하여 생년월일을 구하여 반환
   *  xxxx년 xx월 xx일의 문자열 반환
   * @return 년도가 4자리 형식의 생년월일
   */
public String birthDays() {
	  String birthday =ssn.substring(0,6);		//950101
	  
	  
	  String year="";
	  String yearBirth="";
	  String result="";
	  
	  int genderFlag= ssn.charAt(7)-'0';		//변수를 여러번 호출해 사용할때
	  
	  String[] tempYear= {"18","19","19","20","20","19","19","20","20","18"};
	  
//	  if (genderFlag==1 ||genderFlag==2 ||genderFlag==5 ||genderFlag==6) {
//		  year ="19";
//		  //19940728/ \\d{4}년\\d{2}월\\d{2}일 //$1년$2월$일
////		  yearBirth = year.concat(birthday);	//19950101
////		  result = yearBirth.replaceAll("(\\d{4})(\\d{2})(\\d{2})", "$1년$2월$3일");
////		  return result;
//		  
//	  }else if(genderFlag==3||genderFlag==4 ||genderFlag==7 || genderFlag==8){
//		  year ="20";
//		  
//		   }else{
//			   year ="18";
//			
//		   }
//	  		yearBirth=year.concat(birthday);
	  
			yearBirth=tempYear[genderFlag].concat(birthday);
	  		result =yearBirth.replaceAll("(\\d{4})(\\d{2})(\\d{2})", "$1년$2월$3일");
	  		return result;
  
  }//birthDays
  
  /**
   * 생성자를 통해 객체가 저장하고 있는 주민등록번호를 사용하여 나이를 연산하는일
   * @return 연산된 나이
   */
public int age() {
  String birthday =ssn.substring(0,2);
  
  int genderFlag=Integer.parseInt(ssn.substring(7,8));
  String year="18";	//변수의 초기값이 설정되어 있다면 if문의 else문 생략가능
  String yearBirth="";
  int numBirth=0;
  
  if (genderFlag==1 ||genderFlag==2 ||genderFlag==5||genderFlag==6) {
	  year ="19";
	  //19940728/ \\d{4}년\\d{2}월//d{2}일 //$1년$2월$일
	 	  
  }else if(genderFlag==3||genderFlag==4 ||genderFlag==7 || genderFlag==8){
	  year ="20";
  }//else를 사용하지 않는 이유는 변수 선언시 초기값이 들어가 있기 때문이다.
  	yearBirth = year.concat(birthday);
  	numBirth =Integer.parseInt(yearBirth);

  	return 2024-numBirth+1;

  }//age

  /**
   * 생성자를 통해 객체가 저장하고 있는 주민등록번호를 사용하여 성별을 연산 하는 일
   * @return 연산된 성별
   */
public String gender() {
	  
//	  String gender="여자";
//	  int genderFlag=
//	  
//	  if(genderFlag=='1'||genderFlag=='3'||genderFlag=='5'||genderFlag=='7'||genderFlag=='9') {
//		  return "남자";
//	  }
//	  return gender;
	  
	  int genderFlag=ssn.charAt(7)-'0';
	  String[] genderText= {"여자","남자"};
	  return genderText[genderFlag%2];
//	  return "여자, 남자".split(",")[genderFlag%2]
  }//gender

//  7. 입력된 주민번호에서 띠를 구하여 문자열로 반환하는 method를 작성하세요.
  /**
   * 생성자를 통해 객체가 저장하고 있는 주민등록번호를 사용하여 띠를 연산 하는 일
   * @return 연산된 띠 반환
   */

public String zodiac() {
  String birthday =ssn.substring(0,2);
  int genderFlag=Integer.parseInt(ssn.substring(7,8));
  
  String[] tempYear= {"18","19","19","20","20","19","19","20","20","18"};
  String yearBirth= tempYear[genderFlag].concat(birthday);
  String[] zodiacTitle={"원숭이","닭","개","돼지","쥐","소","호랑이","토끼","용","뱀","말","양"};
  
  return zodiacTitle[Integer.parseInt(yearBirth)%12];
  
  }//zodiac
  
}//end class

