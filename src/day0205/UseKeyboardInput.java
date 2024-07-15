package day0205;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 키보드의 입력값 받기
 */
public class UseKeyboardInput {

	public UseKeyboardInput() throws IOException {

		System.out.println("아무키나 누르고 엔터");
//		int readData= System.in.read();
//		System.out.println("입력값: "+readData);

		// 입력한 문자열이 그대로 출력되는 코드 -> 한글을 출력할수없다.
//		int readData=0;
//		while(( readData= System.in.read()) != 13) {
//			
//			System.out.print((char)readData);
//		}//end while

		// 한글을 줄단위로 읽어서 보여줄 수 있는 16bit stream의 사용
		BufferedReader br = null;

		try {
			br = new BufferedReader(new InputStreamReader(System.in));
			String readData = br.readLine();
			System.out.println("입력값: " + readData);

		} finally {
			if (br != null) {br.close();}	//end if

		} // end finally

	}// UseKeyboardInput

	public static void main(String[] args) {

		try {
			new UseKeyboardInput();
		} catch (IOException e) { // UseKeyboardInput()생성자안에서 발생하는 여러개의 예외를 묶어 처리할수 있다.
			e.printStackTrace();
		}
	}// main

}// class
