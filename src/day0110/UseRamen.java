package day0110;

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
		
		String result= rm.eat("나는 어떤특징을 가지는 라면을 먹을까요? ");
		System.out.println(result);
		
		//생성자 
		Ramen pack= new Ramen(1,1,"원형","빨간");
		result= pack.eat("나는 해당 라면을 먹는다");
		System.out.println(result);
		
		
	}

}
