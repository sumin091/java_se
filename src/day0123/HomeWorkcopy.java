package day0123;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.swing.JOptionPane;



public class HomeWorkcopy {

	  public static class WorkVO {
	        private String name;
	        private int javaScore;
	        private int oracleScore;

	        public WorkVO(String name, int javaScore, int oracleScore) {
	            this.name = name;
	            this.javaScore = javaScore;
	            this.oracleScore = oracleScore;
	        }//WorkVO
	        

	        // Getter and Setter methods

	        public String getName() {
	            return name;
	        }

	        public void setName(String name) {
	            this.name = name;
	        }

	        public int getJavaScore() {
	            return javaScore;
	        }

	        public void setJavaScore(int javaScore) {
	            this.javaScore = javaScore;
	        }

	        public int getOracleScore() {
	            return oracleScore;
	        }

	        public void setOracleScore(int oracleScore) {
	            this.oracleScore = oracleScore;
	        }

	        @Override
	        public String toString() {
	            return "WorkVO{" +
	                    "name='" + name + '\'' +
	                    ", javaScore=" + javaScore +
	                    ", oracleScore=" + oracleScore +
	                    '}';
	        }
	    }

//	@SuppressWarnings("rawtypes")
	
	public static void main(String[] args) {
		
//		String inputData= JOptionPane.showInputDialog("이름을 입력해주세요","수민");
//		StringBuilder sb= new StringBuilder();
//		
//		if(("윤웅찬").equals(inputData)) {
//			sb.append("조원동의 자랑");
//			
//		}//end if
//		sb.append(inputData).append("님");
//		
//		System.out.println(sb);
		
		JOptionPane.showInputDialog("이름,자바점수,오라클점수 입력\n\"출력\"을 입력하면 출력됩니다. \n 종료하시려면 \"Y|y\"를 입력해주세요.");
		
	    Scanner scanner = new Scanner(System.in);
        List<WorkVO> workList = new ArrayList<>();

        while (true) {
            System.out.print("입력 데이터를 입력하세요 (CSV 형태, '출력' 또는 'Y' 입력하면 종료): ");
            String inputData = scanner.nextLine();

            if (inputData.equalsIgnoreCase("출력")) {
                // List에 들어있는 값을 모두 출력
                for (WorkVO workVO : workList) {
                    System.out.println(workVO);
                }
            } else if (inputData.equalsIgnoreCase("Y")) {
                // 프로그램 종료
                break;
            } else {
                // CSV 형태의 데이터 처리
                String[] values = inputData.split(",");
                if (values.length == 3) {
                    String name = values[0].trim();
                    int javaScore = Integer.parseInt(values[1].trim());
                    int oracleScore = Integer.parseInt(values[2].trim());

                    WorkVO workVO = new WorkVO(name, javaScore, oracleScore);
                    workList.add(workVO);
                } else {
                    System.out.println("잘못된 입력 형식입니다. 다시 입력하세요.");
                }
            }
        }

        System.out.println("프로그램을 종료합니다.");
        scanner.close();
    
		
//		List list= new ArrayList();
		
		
//		String inputdata="";
//		String WorkVO;
//		String[] csvType= new String[list.size()];
//		String[] csvData= {"이름","자바점수","오라클점수"};

		
//		if(inputdata.equals(csvData)) {
//			WorkVO=inputdata;
//			list.set(0, csvData);
//			
//		}else if(inputdata.equals("출력")) {
//			System.out.println();
//			System.out.println(list.get(i));
//		}else if(inputdata.equals("Y")) {
//			
//		}
		
//		for(int i=0; i<list.size(); i++) {
//			System.out.println(list.get(i));
//		}
		
	}// main

}// class
