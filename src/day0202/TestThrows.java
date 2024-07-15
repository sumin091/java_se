package day0202;

import java.util.Random;

public class TestThrows {
	
	/**
	 * method에서 throws로 예외를 던지면, 호출한 곳에서 예외를 잡아 처리하게 된다.
	 * 예외발생 예상 코드를 가진 method안에서는 try~catch로 처리할 필요가 없다. 
	 */
	public void loadClass() throws ClassNotFoundException {
		String clsName="java.lang.String";
		
		if(new Random().nextBoolean()) {
			clsName="java.lang.String2";
		}//end if
		
		Class cls= Class.forName(clsName);
		//정상일때의 코드
		System.out.println(cls+" 클래스를 로딩하였습니다.");
	}//loadClass

	public static void main(String[] args) {
		TestThrows tt= new TestThrows();
		//throws로 날렸기 때문에 날린곳에서 try~catch 해주기
		try {
			tt.loadClass();
		} catch (ClassNotFoundException e) {
			//비정상적일때의 코드
			e.printStackTrace();
		}//end catch
		
//		throw new Exception();
	}//main

}//class
