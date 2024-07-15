package day0110;

public class UseDog {

	public static void main(String[] args) {

		Dog d= new Dog();
		
//		d.setEye(2);
//		d.setNose(1);
//		d.setEar(2);
//		d.setColor("brown");
//		d.setBreed("시바견");
		
//		System.out.printf("눈은 %d개, 코는 %d개, 귀는 %d개, 색은 %s색, 품종은 %s이다. \n",
//				d.getEye(), d.getNose(), d.getEar(), d.getColor(), d.getBreed());
		
		
		//클래스가 제공하는 기능 사용
		String result= d.bark("위험한 상황에");
		System.out.println(result);
		
		Dog info= new Dog(2,1,1,"black","시베리안허스키");
		
		result=info.bark("주인이 위협받을때");
		System.out.println(result);
		
		
	}

}
