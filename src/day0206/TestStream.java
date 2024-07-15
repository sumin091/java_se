package day0206;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

import javax.swing.JOptionPane;

public class TestStream {

	public TestStream() throws IOException {
		
		//C:/dev/temp/java_write4.txt 파일을 생성한 후 
		//C:/dev/temp/java_read.txt를 읽어들여 java_write4.txt 쓰는 코드를 작성해보세요
		
		File file= new File("C:/dev/temp/java_write4.txt");
		FileInputStream fis= new FileInputStream(file);
		
		FileWriter fw= null;
		
		BufferedReader br= null;
		
		try {
			
			//단, C:/dev/temp/java_write4.txt 파일이 존재하지 않으면 파일 생성, 존재한다면 덮어쓸것인지 물어본후 파일에 덮어쓴다.
			if(!file.exists()) {
				file=new File("C:/dev/temp/java_write4.txt");
			}//end if
			
			JOptionPane.showMessageDialog(null, "파일이 이미 존재합니다. 덮어쓸까요?");
			
			br = new BufferedReader(new InputStreamReader(new FileInputStream((file))));
			fw = new FileWriter(file);

			String str ="";
			
			while ((str = br.readLine()) != null) {
				System.out.println(str);
				
			}//end while
			
			fw.write(str);
			
			fw.flush();
		
			
		}finally {
			if(fw != null) {fw.close();}
			if(br != null) {br.close();}
		}//end 

		
		
		
	}// TestStream

	public static void main(String[] args) {
		try {
			new TestStream();
		} catch (IOException ie) {
			ie.printStackTrace();
		}
	}// main

}// class
