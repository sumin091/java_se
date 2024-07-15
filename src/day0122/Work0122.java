package day0122;

import java.util.Calendar;

public class Work0122 {

	public Work0122() {
		
		Calendar cal= Calendar.getInstance();
		
		//int day=cal.get(Calendar.DAY_OF_MONTH);
		
	
        // 현재 년도와 월 설정
        int year = cal.get(Calendar.YEAR);
        int month = cal.JANUARY; // 0부터 시작하므로 1월은 0

        // 해당 월의 첫 날로 설정
        cal.set(year, month, 1);

        // 요일 정보 가져오기 (1일이 무슨 요일인지)
        int firstDayOfWeek = cal.get(Calendar.DAY_OF_WEEK);

        // 해당 월의 마지막 날짜 가져오기
        int lastDayOfMonth = cal.getActualMaximum(Calendar.DAY_OF_MONTH);

        // 달력 출력
        //System.out.println("<< " + year + "년 " + (month + 1) + "월 >>");
        //System.out.println("일 월 화 수 목 금 토");

        // 첫 주 시작 전까지 공백 출력
        for (int i = 1; i < firstDayOfWeek; i++) {
            System.out.print("   ");
        }

        for (int day = 1; day <= 31; day++) {
            System.out.printf("%2d ", day);

            // 토요일마다 줄 바꿈
            if ((firstDayOfWeek + day - 1) % 7 == 0) {
                System.out.println();
            }
        }
	
		
	}// Work0122
	
	public static int[] getLastDayArray(int year, int month) {
        // 해당 년도와 월로 Calendar 객체 생성
        Calendar cal = Calendar.getInstance();
        cal.set(year, month - 1, 1); // 월은 0부터 시작하므로 입력받은 월에서 1을 빼줌

        // 해당 월의 마지막 날짜 가져오기
        int lastDayOfMonth = cal.getActualMaximum(Calendar.DAY_OF_MONTH);

        // 마지막 날짜까지의 배열 생성 및 할당
        int[] daysArray = new int[lastDayOfMonth];
        for (int i = 0; i < lastDayOfMonth; i++) {
            daysArray[i] = i + 1;
        }

        return daysArray;
    }//getLastDayArray
	

	public static void main(String[] args) {
		
		new Work0122();
		getLastDayArray(2024, 1);
		
		int[] daysArray = getLastDayArray(2024, 1);

        // 결과 출력
        //System.out.println(year + "년 " + month + "월의 마지막 날짜 배열:");
        for (int day : daysArray) {
            System.out.print(day + " ");
        }//end for
    
		
	}//main
	
}//class
