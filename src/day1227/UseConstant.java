/*
다른 클래스에 존재하는 Constant 사용
*/
package day1227;

class UseConstant{
	public static void main(String[] args) {
		System.out.println("최고점수: " + Constant.MAX_SCORE+ "최저점수:" + Constant.MIN_SCORE);

		System.out.println("Byte의 최고값:" +Byte.MAX_VALUE+ ", 최저 값: " +Byte.MIN_VALUE);
	}//main
}//class
