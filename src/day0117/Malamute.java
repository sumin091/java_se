package day0117;

public class Malamute extends Dog {

	@Override
	public String bark(String place, int count) {
		return  getName()+"가 " + place + "에 있다면 "+ count +"번 짖는다.";
	}
	
	@Override
	public String bark() {
		return getName()+"가 위험한 상황에서 짖는다.";
	}
	

}//class
