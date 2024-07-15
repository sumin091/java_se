package day0214;

import java.util.Calendar;

public class UseLamda {

	public static void main(String[] args) {
		// 람다식을 사용하면 class파일을 생성하지 않고 인터페이스를 사용할 수 있다.
		// 반환형 없고, 매개변수 없는 형
		Test t = () -> {

			int day = 14;
			System.out.println("반환형 없고 매개변수 없는 형");
			System.out.println(day + "일");
		};

		// 호출
		t.temp();

		System.out.println("------------------------");
		// 반환형 없고, 매개변수 있는 형
		Test2 t2 = (int age, String name) -> {
			int nowYear = Calendar.getInstance().get(Calendar.YEAR);
			System.out.println(name + "님 나이 " + age + "살 " + (nowYear - age) + "년생");
		};

		t2.temp(20, "윤웅찬");
		System.out.println("------------------------");
		// 반환형 없고, 매개변수 없는 형
		Test3 t3 = () -> {
			String name = "김병년";
			return name;
		};

		// 호출
		String name = t3.temp();
		System.out.println(name);
		System.out.println("-------------------------");
		// 반환형 있고, 매개변수 있는 형
		Test4 t4 = (String name2, int age) -> {
			String grade = "평민";
			if (name2.equals("윤웅찬")) {
				grade = "반장";
			} // end if
			return grade + " " + name2 + "님 나이는 " + age + "살";
		};
		// 호출
		String result = t4.temp("윤웅찬", 20);
		System.out.println(result);
		result = t4.temp("김병년", 21);
		System.out.println(result);
		
		
		//1~10까지 Thread를 사용해서 출력하는 코드를 람다식으로 작성하기
		Runnable r= () -> {
			for(int i=1; i<500; i++) {
				System.out.println("run --->" + i);
			}//end for
		};
		
		Thread th= new Thread(r);//has a
		th.start();	//run() 호출
		
		for(int i=0; i <500; i++) {
			System.out.println("main for ===>"+i);
		}//end for
	}
}
