package day0124;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import javax.swing.JOptionPane;

public class Work0124 {

//	2. 위의 Dialog에서 “1”이 입력 되면 학생번호,이름,자바,오라클 점수를 입력 받을 수 있는
//	   InputDialog를 제공한다. 
//	   CSV형식의 데이터를 입력받아, 학생의 번호가 존재한다면 “이미 존재하는 번호입니다.”
//	  를 MessageDialog에 보여주세요. 그렇지 않으면 VO에 입력.
//		Map<번호, {번호, 자바점수, 오라클점수}>,Set, iterator 사용
//
//	3.1번 메뉴에서 “2”가 입력되면 저장된 모든 값을 console에 출력하는 코드 작성
//	  번호 이름 자바점수 오라클점수 합계 평균
//	    1   xxx    90           90           90  90.xx
//
//	4. 1메뉴에서 “3” 이 입력되면 프로그램을 종료한다.
	

	
	public Work0124() {
		//Map<"번호", {""}> 
		
	}//Work0124
		
	
	public void inputMenu() {
		
		String menuNum="";
		String inputDialog="";
		Map<String, String[]> map= new HashMap<String, String[]>();
		Set<String> set = new HashSet<String>();
		//Iterator<String> ita= new I
		
		
//		do {
//			
//			if(menuNum.equals("1")) {
//				JOptionPane.showInputDialog("학생의 정보를 아래와 같이 입력해주세요.\n예)학생번호,이름,자바점수,오라클점수");
//			}
//			
//			
//		}while("");
			
			
			
		
		
		
		
	}//inputMenu
	
//	import javax.swing.JOptionPane;
//
//	public class StudentManagementSystem {
//	    public static void main(String[] args) {
//	        Student[] students = new Student[100]; // 최대 100명의 학생을 저장할 배열
//
//	        while (true) {
//	            // 메뉴 선택 다이얼로그
//	            String menu = JOptionPane.showInputDialog("1. 입력\n2. 검색\n3. 종료");
//
//	            if (menu == null) {
//	                // 사용자가 다이얼로그를 닫거나 "취소"를 눌렀을 때 종료
//	                break;
//	            }
//
//	            switch (menu) {
//	                case "1":
//	                    // 학생 정보 입력 다이얼로그
//	                    String input = JOptionPane.showInputDialog("학생번호,이름,자바,오라클을 입력하세요 (CSV 형식)");
//
//	                    if (input == null) {
//	                        break; // 사용자가 다이얼로그를 닫거나 "취소"를 눌렀을 때 메뉴로 돌아감
//	                    }
//
//	                    String[] inputArray = input.split(",");
//	                    if (inputArray.length == 4) {
//	                        int studentNumber = Integer.parseInt(inputArray[0]);
//	                        String name = inputArray[1];
//	                        int javaScore = Integer.parseInt(inputArray[2]);
//	                        int oracleScore = Integer.parseInt(inputArray[3]);
//
//	                        // 중복된 학생 번호 확인
//	                        boolean isDuplicate = false;
//	                        for (Student student : students) {
//	                            if (student != null && student.getStudentNumber() == studentNumber) {
//	                                isDuplicate = true;
//	                                break;
//	                            }
//	                        }
//
//	                        if (isDuplicate) {
//	                            JOptionPane.showMessageDialog(null, "이미 존재하는 번호입니다.");
//	                        } else {
//	                            // VO에 입력
//	                            Student newStudent = new Student(studentNumber, name, javaScore, oracleScore);
//	                            // 배열에 저장
//	                            for (int i = 0; i < students.length; i++) {
//	                                if (students[i] == null) {
//	                                    students[i] = newStudent;
//	                                    break;
//	                                }
//	                            }
//	                        }
//	                    } else {
//	                        JOptionPane.showMessageDialog(null, "올바른 형식으로 입력하세요.");
//	                    }
//	                    break;
//
//	                case "2":
//	                    // 저장된 모든 값을 console에 출력
//	                    System.out.println("번호\t이름\t자바점수\t오라클점수\t합계\t평균");
//	                    for (Student student : students) {
//	                        if (student != null) {
//	                            System.out.println(student);
//	                        }
//	                    }
//	                    break;
//
//	                case "3":
//	                    // 프로그램 종료
//	                    System.exit(0);
//	                    break;
//
//	                default:
//	                    JOptionPane.showMessageDialog(null, "잘못된 입력입니다. 다시 입력하세요.");
//	                    break;
//	            }
//	        }
//	    }
//
//	
	
	public void printData() {
		System.out.println("번호\t이름\t자바점수\t오라클점수\t합계\t평균");
		WorkVO2 wkVO2= null;
		
	}//printData
	
	
	public static void main(String[] args) {
		
		JOptionPane.showInputDialog("메뉴\n1.입력 2.검색 3.종료");
		//JOptionPane.showInputDialog("학생의 정보를 아래와 같이 입력해주세요.\n예)학생번호,이름,자바점수,오라클점수");
		JOptionPane.showMessageDialog(null, "메시지 다이얼로그");
	}

}
