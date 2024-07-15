package day0112;

/**
 * 일차원 배열) 열로만 구성된 배열
 * 1.선언)
 * 	데이터형[] 배열명=null;
 * 2.생성)
 * 	배열명= new 데이터형[방의 크기];
 * 1+2) 데이터형[] 배열명=new 데이터형[방의크기];
 * 3.값 할당) - 존재하지 않는 배열 인덱스를 사용하면 error 발생
 *  배열명[방의번호]= 값;
 * 4.값 사용)
 * 배열명[방의번호]
 * 일괄처리(한번에 처리)
 * -방의 수: 배열명.length
 * for(int i=0; i < 배열명.length; i++){		//시작 값 0으로 고정
 * 		배열명[i] 
 * 	}
 */
public class UseArray1 {
	//int arr;
	//생성자 만들기
	public UseArray1() {
		//1.선언)
		int[] arr=null;
		
		//2.생성) - heap에 생성되고 모든 방의 값은 0으로 초기화
		arr= new int[5];
				
		//3.값할당)
		arr[0]=2024;
		arr[1]=1;
		arr[2]=12;
		arr[3]=14;
		arr[4]=44;
//		arr[5]=1;		//존재하지 않는 index를 사용하면 error
		
		
		System.out.println(arr+ ", 방의 수: " + arr.length + "개");
		System.out.println("처음 방:" + arr[0] + ", 두번째 방:"+ arr[1]);
		
//		4.값 얻기)
		System.out.println(arr[0]+"~"+arr[4]);
		
//		5.일괄처리(한꺼번에 처리)
		for(int i=0; i< arr.length; i++ ) {
			System.out.printf("arr[%d]= %d\n", i, arr[i]);
		}
		
		int sum=0;
			for(int i=0; i< arr.length; i++ ) {
				System.out.printf("arr[%d]= %d\n", i, arr[i]);
				sum+=arr[i];
			}
		
		
		System.out.println(sum);
	}//UseArray1
	
	public void scoreProcess() {
		System.out.println("----------------------------------");
		//String[] nameArr= new String[4];
		String[] nameArr= {"루피","샹크스","나미","조로","쵸파"};
		String[] addrArr= {"서울시 강남구 역삼동","서울시 동대문구 동대문동","인천시 미추홀구",
							"서울시 구로구 구로동","수원시 영통구 영통동"};
		int[] scoreArr= {94, 95, 75, 83, 100};
//		int[] scoreArr= new int[] {94, 95, 75, 83, 100};
//		int[] scoreArr= new int[5] {94, 95, 75, 83, 100};	//배열의 수를 지정하면 error
		int sum=0;
		int cnt=0;
		int num=0;
		System.out.printf("번호\t이름\t점수\t거주지\n");
		
		for(int i=0; i<nameArr.length; i++) {
			if(addrArr[i].startsWith("서울")) {
			System.out.printf("%d\t%s\t%d\t%s\n", ++num, nameArr[i], scoreArr[i], addrArr[i]);
			sum+=scoreArr[i];
			cnt++;
			System.out.println();
			}
			//System.out.printf("총점 [%d]점, 평균[%.2f]점",sum,(double)sum/cnt);
		}
	
		
		System.out.println("---------------------------------------------");
		
		//scoreArr의 마지막번째 방부터 출력
		//System.out.println(scoreArr[4]);
		
		
		//scoreArr에서 가장 큰 값 구하기
		for(int i=scoreArr.length-1; i > -1; i--) {
			System.out.printf("%d\t", scoreArr[i]);
		}
		
		System.out.println();
		
		//flowchart 코드로 옮기기1 : 가장 큰 값 구하기
		
		int top=scoreArr[0];
		
		
		for(int i=0; i < scoreArr.length; i++) {
			if(top<scoreArr[i]) {
				top=scoreArr[i];
			}
			
		}
		System.out.println(top);
		
		
		//scoreArr에서 가장 작은 값 구하기
		int bottom=scoreArr[0];
		
		for(int i=0; i< scoreArr.length-1; i++) {
			if(bottom > scoreArr[i]) {
				bottom=scoreArr[i];
			}
		}
		System.out.println(bottom);
		
		
		//flowchart 코드로 옮기기2 : 내림차순으로 출력하기
		
		int temp=0;
		
		for(int i=0; i<scoreArr.length-1; i++) {
			for( int j= i+1; j < scoreArr.length; j++) {
				if(scoreArr[i] < scoreArr[j]) {
					temp= scoreArr[i];
					scoreArr[i]= scoreArr[i];
					scoreArr[j]=temp;
					}
				}// if end
				
			}//중첩 for문 end
			
			for(int i=0; i< scoreArr.length; i++) {
				System.out.println(scoreArr[i]);
			}//end of for
			
		
	}//scoreProcess
	
	
	public static void main(String[] args) {
		UseArray1 ua= new UseArray1();		//new UseArray1(); 
		
		//scorProcess 호출하기: 직접호출불가() chain
		new UseArray1().scoreProcess();
	}//main

}//class
