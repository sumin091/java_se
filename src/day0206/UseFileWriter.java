package day0206;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * 16bit stream을 사용한 문자열 출력
 */
public class UseFileWriter {

	public UseFileWriter() throws IOException {
		//1.파일 생성
		File file= new File("c:/dev/temp/java_write2.txt");
		
		//2.스트림 생성
		FileWriter fw= null;
		try {
			fw=new FileWriter(file);
			String str="문자열 데이터가 Java에서 생성되었음";
			
			//3.스트림에 데이터를 기록
			fw.write(str);
			
			//4.스트림의 내용을 목적지로 분출
			fw.flush();	//스트림에 기록된 내용 목적지로 밀어내기
			
		}finally {
			//5.연결끊기
			if( fw != null) {fw.close();}//end if
		}//end finally
	}//UseFileWriter
	
	public static void main(String[] args) {
		try {
			new UseFileWriter();
		} catch (IOException e) {
			e.printStackTrace();
		}//end catch
	}//main

}//class
