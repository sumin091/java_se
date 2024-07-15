package day0109;

/**
 * 특수문자
 * 문자열 안에서 사용하는 기능을 가지는 문자
 * \로 시작
 * 정해진 특수문자 이외의 문자를 사용하면 error
 */
public class UseEscapeCharacter {

	public static void main(String[] args) {
//		System.out.println("newfile.txt의 경로는 e:\temp\test\newfile.txt");
//		System.out.println("java.txt의 경로는 e:\temp\java.txt");	//존재하지 않음
		
		System.out.println("오늘은 대설이 내립니다. \n 이 상황이라면 강남역 용자출현");
		System.out.println("오늘은 9일 \t 내일은 10일 \t 11일");
		System.out.println("HTML 태그 링크태그는 <a href='링크'> 클릭할 이름 </a>");
		System.out.println("'안녕하세요?'");
		System.out.println("\"안녕하세요?\"");
		System.out.println("newfile.txt의 경로는 e:\\temp\\test\\newfile.txt");
		System.out.println("newfile.txt\b");
	}

}
