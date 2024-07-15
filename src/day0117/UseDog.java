package day0117;

public class UseDog {
	
	public static void main(String[] args) {

		
		Chihuahua chh= new Chihuahua();
		
		Malamute mm= new Malamute();
		
		chh.setName("치와와");
		mm.setName("말라뮤트");
		//System.out.println(chh);
		//System.out.println(mm.bark());
		chh.setMsg(" 무섭게 생긴 사람을 마주쳤을때");
		mm.setMsg(" 집에 있을때 외부인을 감지했을때");
		System.out.println(chh.bark("외부환경", 3));
		System.out.println(mm.bark("거주공간",5));

		
		
	}
	

}
