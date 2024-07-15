package day0112;

public class Work0112 {
	
	private String residentNum;
	
	
	public Work0112(String residentNum) {
		this.residentNum=residentNum;
		
	}//Work0112
	

	
	//주민번호 글자수가 14자 인지 
	public boolean count(String residentNum) {
		boolean flag=false;
		
		if(residentNum.length() != 14) {
			return false;
		}else {
			return true;
		}
		
		
	}//setCount
	

	
	//주민번호 7번째 인덱스에 -가 있는지
	public boolean check(String residentNum) {
		
		if(residentNum.indexOf(6) == '-') {
			return true;
		}else {
			return false;
		}
	}//setCheck
	
	
	//주민번호 생년월일 연산해 문자열 반환
	public void birth(String residentNum, String year,String month, String day) {
		
		if(residentNum.equals("1") || residentNum.equals("2")|| residentNum.equals("5")|| residentNum.equals("6")) {
			
		}else if(residentNum.equals("3") || residentNum.equals("4")|| residentNum.equals("7")|| residentNum.equals("8")){
			
		}else if(residentNum.equals("9") || residentNum.equals("0")) {
			
		}
		
		year= residentNum.substring(0,2);
		month= residentNum.substring(2,4);
		day= residentNum.substring(4,6);
		
		
	}//birth
	
	
	//나이구해서 정수로 반환
	public void printAge(String residentNum, int age) {
		residentNum.substring(0,1);
		
	
		
	}//PrintAge
	
	//성별 구하기
	public void printGender(String residentNum) {
		
		if(residentNum.indexOf(7) % 2 == 1) {
			residentNum="남자";
		}else if(residentNum.indexOf(7) % 2 == 0) {
			residentNum="여자";
		}
	}//printGender
	
	
	//띠 구하기
	public void printZodiac(String residentNum, int year, String zodiac) {
		year=2024;
		
//		=residentNum.substring(0,1);
//		
//		if(zodiac)
		
	}//printZodic
	
	
	public static void main(String[] args) {
		
//		Work0112 wk= new Work0112();
		
	
		
		
		
		
	}//main

}//class
