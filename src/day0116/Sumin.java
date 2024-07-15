package day0116;

public class Sumin extends Person {

	
	public Sumin() {
		
		
		
	}//Sumin
	
	public void BestThing(String str) {
		System.out.println("가장 잘하는 것은 "+str+ " 이다.");
	}
	
	public static void main(String[] args) {
		Sumin sm= new Sumin();
		sm.BestThing("수다떨기");
				
	}

}//class
