package day0202;

import java.util.Random;

/**
 * throw: 사용자 정의 예외처리 클래스와 함께 사용 -사용자 정의 예외처리 클래스는 Java API에서 제공하는 예외처리 클래스가 내가
 * 구현하는 업무의 성격과 같은 이름으로 존재하지 않을때 정의하여 만든다.
 */
public class MuYeong {

	public String walk() throws Exception { // 일 => 구현해야하는 업무
		String msg = "";
		int flag = new Random().nextInt(4); // 0-초,1-중,2-고,3-대

		String[] title = { "초딩", "중딩", "고딩", "대딩" };

		msg = title[flag] + "님 흡연 중 모른척 지나간다.('' )( '')";
		if (flag == 0) { // 초딩이 흡연중이면 예외를 강제로 발생시킨다.

			throw new Exception(title[flag] + "님 지나친 흡연은 건강에 해롭습니다.");

//			try{
//			throw new Exception(title[flag]+"님 지나친 흡연은 건강에 해롭습니다.");
//			}catch(Exception e) {
//				e.printStackTrace();
//			}
		} // end if
		return msg;
	}// walk

	public String walk2() throws TabaccoException { // 일 => 구현해야하는 업무
		String msg = "";
		int flag = new Random().nextInt(4); // 0-초,1-중,2-고,3-대

		String[] title = { "초딩", "중딩", "고딩", "대딩" };

		if (flag == 0) { // 초딩이 흡연중이면 예외를 강제로 발생시킨다.

			throw new TabaccoException(title[flag] + "님 지나친 흡연은 건강에 해롭습니다.");

		} // end if
			// 예외가 발생하지 않았을때만 반환메시지를 생성한다.
		msg = title[flag] + "님 흡연 중 모른척 지나간다.('' )( '')";

		return msg;
	}// walk2

	public static void main(String[] args) {
		MuYeong my = new MuYeong();
		try {
//			String msg=my.walk();	
			// 내부에서 try~catch를 실행하면 밖에서 봤을때 method 내부에서 어떤 문제가 발생할지 모른다.

			String msg = my.walk2();

			System.out.println(msg);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}// main

}// class
