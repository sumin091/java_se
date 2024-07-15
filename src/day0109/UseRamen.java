package day0109;

public class UseRamen {

	public static void main(String[] args) {

		
		//객체화
		Ramen rm= new Ramen();
		
		rm.setRamenPowder(2);
		rm.setRamenFlake(1);
		rm.setColor("주황");
		rm.setShape("사각형");
		
		System.out.printf("라면스프의 개수 %d개, 후레이크의 수 %d개, 라면봉지의 색은 %s이고, 면의 모양은 %s 이다. \n ", 
				rm.getRamenPowder(), rm.getRamenFlake(), rm.getColor(), rm.getShape());
		
		String msg= rm.eat("나는 어떤특징을 가지는 라면을 먹을까요? ");
		System.out.println(msg);
		
	}

}
