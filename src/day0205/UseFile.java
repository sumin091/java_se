package day0205;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * File 클래스를 사용한 파일 접근
 */
public class UseFile {

	public static void main(String[] args) {
		//1.생성
		File file= new File("c:/dev/temp/java_read.txt");	//파일 확장자 확인
		System.out.println(file);
		
		if(!file.exists()) {
			System.out.println("파일이 없습니다.");
			return;		//early return
		}//end if
		
		System.out.println(file.isFile()?"파일":"디렉토리");
		System.out.println(file.isDirectory()?"디렉토리":"파일");
		System.out.println(file.canRead()?"읽을 수 있음":"읽을 수 없음");
		System.out.println(file.canWrite()?"쓸 수 있음":"쓸 수 있음");
		System.out.println(file.canExecute()?"실행가능":"실행불가능");
		System.out.println(file.isHidden()?"숨김파일":"일반파일");
		System.out.println("파일의 크기 "+ file.length()+"byte");
		System.out.println("절대경로 "+ file.getAbsolutePath());
		
		try {
			System.out.println("규범경로 "+file.getCanonicalPath());
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("경로 "+file.getParent());
		System.out.println("파일명 "+file.getName());
		
		long lastModified= file.lastModified();
		System.out.println("파일이 마지막으로 수정된 날짜 "+lastModified);
		System.out.println("파일이 마지막으로 수정된 날짜 "+new Date(lastModified));
		
		SimpleDateFormat sdf= new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		System.out.println(sdf.format(new Date(lastModified)));
	}//main

}//class
