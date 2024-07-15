package day0115;

/**
 * 학생들의 점수를 처리하는 클래스
 */
public class UseArray2Work {

	public void scorePrint() {
		String[] namesArr= {"루피","샹디","쵸파","나미","로빈"};
		int[][] scoreArr= {
				{89,91,86},
				{91,93,90},
				{98,100,99},
				{74,85,83},
				{88,90,95}
		};
		
//		scoreArr[num][KOR]+scoreArr[num][KOR]
		
		System.out.printf("시험 응시 인원 [%d]명\n", namesArr.length);
		System.out.printf("번호\t이름\t국어\t영어\t수학\t총점\t평균\n");
		System.out.println("------------------------------------------------------");
	
		
		
		for(int i=0; i<scoreArr.length; i++) {
			System.out.printf("%d\t%s\t",i+1, namesArr[i]);
			
			for(int j=0; j<scoreArr[i].length; j++) {
				System.out.printf("%d\t", scoreArr[i][j]);
				 
				
			}//end for
			System.out.println(totalScore(scoreArr[i]));
		}//end for
		
		System.out.println("--------------------------------------------------");
		
		//각 과목의 총점 
		
	     for (int j = 0; j < scoreArr[0].length; j++) {
	            int subjectTotal = 0;

	            for (int i = 0; i < scoreArr.length; i++) {
	                subjectTotal += scoreArr[i][j];
	            }

	            System.out.printf("\t총점 %d", subjectTotal);
	        }
	    
		//국어과목만의 평균
		
	      int koreanTotal = 0;
	      
	        for (int i = 0; i < scoreArr.length; i++) {
	            koreanTotal += scoreArr[i][0]; // 국어 과목은 첫 번째 열
	        }
	        double koreanAverage = (double) koreanTotal / scoreArr.length;
	        System.out.printf("\n\t평균 %.2f", koreanAverage);
	        
	        
	        
	        // 각 학생의 총점 계산
		 
		 int[] studentTotal = new int[scoreArr.length];

	       
	        for (int i = 0; i < scoreArr.length; i++) {
	            for (int j = 0; j < scoreArr[i].length; j++) {
	                studentTotal[i] += scoreArr[i][j];
	            }
	        }
		 
	    int topStudentIndex = 0;
        for (int i = 1; i < studentTotal.length; i++) {
            if (studentTotal[i] > studentTotal[topStudentIndex]) {
                topStudentIndex = i;
            }
        }
		System.out.printf("\n 1등 학생의 번호[%d], 이름[%s]",topStudentIndex + 1, namesArr[topStudentIndex]);	
		
	}//scoreProcess
	
	
	/**
	 * 일차원 배열의 총점을 구하여 반환 하는일
	 * @return
	 */
	public int totalScore(int[] subjectScore) {
		int total=0;
		
		for(int score : subjectScore ) {
			total+=score;
		}//end for
		return total;
	}//totalScore
	
//	method로 뽑아서 만들기: 각 과목의 총점
//	public int subTotal(int[] subTotalScore) {
//		int[] sum=null;
//		
//		for(int subSum : subTotalScore) {
//			     
//		}
//		return sum ;
//		
//	}
	
//	public int printAvg(int[] koreaAvg) {
//		int[] koreaSum=
//		int avg=0;
//		
//		for(int[] koreaSum: )
//	}//printAvg
	
	public static void main(String[] args) {
		UseArray2Work uaw= new UseArray2Work();
		uaw.scorePrint();
	}//main

}//class
