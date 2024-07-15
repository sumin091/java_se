package day0206;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 * 16bit Stream을 사용한 텍스트 파일의 내용읽기
 */
public class UseFileReader {

	public UseFileReader() throws IOException {
		File readFile = new File("C:/dev/temp/java_read.txt");
		if (!readFile.exists()) {
			System.out.println(readFile.getAbsolutePath() + "는 존재하지 않습니다.");
			return;
		} // end if

		// 2.Stream 생성
//		FileReader fr= new FileReader(readFile);	//파일과 연결을 위한 길
//		BufferedReader br= new BufferedReader(fr);	//줄 단위로 읽기 위한 길

		BufferedReader br = null;
		try {
			br = new BufferedReader(new FileReader(readFile));

			// 3.스트림에 연결되어있는 파일을 읽어들인다.
			String str = "";
			while ((str = br.readLine()) != null) {
				System.out.println(str);
				
			} // end while
			
		} finally {
			if (br != null) {br.close();}	//end if
		}//end finally
	}// UseFileReader

	public static void main(String[] args) {
		try {
			new UseFileReader();
		} catch (IOException e) {
			e.printStackTrace();
		} // end catch

	}// main

}// class
