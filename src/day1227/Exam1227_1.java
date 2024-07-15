package day1227;

class Exam1227_1{
	public static final int MONTH_CHARGE= 500000;
	public static final int MONTH_DATE= 20;

	public static void main(String[] args){
		int dayCharge= Exam1227_1.MONTH_CHARGE / Exam1227_1.MONTH_DATE;
		int charge= 1500;
		int charge2= charge*2;
		int totalCharge= charge * Exam1227_1.MONTH_DATE;
		int lunchFee= 10000;
		int totalLunchFee= lunchFee * Exam1227_1.MONTH_DATE;

		int totalCost= Exam1227_1.MONTH_CHARGE - (totalCharge + totalLunchFee);
		System.out.println("한달 용돈은" +Exam1227_1.MONTH_CHARGE+ "원 하루 용돈은" +Exam1227_1.MONTH_DATE+
			"일 기준으로" +dayCharge+ "하루 지출은 편도 교통비" +charge+ "원 왕복교통비" 
			+charge2+ "원 점심 식대" +lunchFee+ "원으로 총" +totalLunchFee+ "원이 지출 됩니다." +
				"한달이 지나면 잔액은" +totalCost+ "원 입니다.");

		
		System.out.println("byte 최대값:" +Byte.MAX_VALUE+ "byte 최소값" +Byte.MIN_VALUE);
		System.out.println("Char 최대값:" +Character.MAX_VALUE+ "Char 최소값" +Character.MIN_VALUE);
		System.out.println("Double 최대값:" +Double.MAX_VALUE+ "Double 최소값" +Double.MIN_VALUE);
		System.out.println("float 최대값:" +Float.MAX_VALUE+ "float 최소값" +Float.MIN_VALUE);
		System.out.println("Integer 최대값:" +Integer.MAX_VALUE+ "integer 최소값" +Integer.MIN_VALUE);
		System.out.println("Long 최대값:" +Long.MAX_VALUE+ "Long 최소값" +Long.MIN_VALUE);
//		System.out.println("String 최대값:" +String.MAX_VALUE+ "String 최소값" +String.MIN_VALUE);
		System.out.println("Short 최대값:" +Short.MAX_VALUE+ "Short 최소값" +Short.MIN_VALUE);
        
        
	}//main
}//class
