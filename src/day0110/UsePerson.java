package day0110;

/**
 * Person 클래스를 사용하기 위해 만든 클래스
 */
public class UsePerson {

	private void usePerson() {
		
		//Person class 객체화
		Person ogong= new Person();		
		//사람이 태어난 것: 눈,코,입을 갖고있어야 할 값 but, 값일 세팅해주고 있음, 기본적으로 가지지 않음
		//=> 객체가 생성될때 기본적으로 가지고 있어야 할 값 설정하는 코드가 필요
		
//		ogong.setEye(2);
//		ogong.setNose(1);
//		ogong.setMouth(1);
		
		ogong.setName("손오공");
		
		
		System.out.printf("눈 %d개 코 %d개 입 %d개 이름 %s \n" ,
				ogong.getEye(), ogong.getNose(), ogong.getMouth(), ogong.getName());
	
		//동사적 특징: 오버로딩
		System.out.println(ogong.eat());
		System.out.println(ogong.eat("돈까스",100000));	//method overload 호출	
		
	
		//천진반 객체생성
		Person jinban= new Person(3,1,1);
		jinban.setName("천진반");
		jinban.setEye(3);
		
		System.out.printf("눈 %d개 코 %d개 입 %d개 이름 %s \n" ,
				jinban.getEye(), jinban.getNose(), jinban.getMouth(), jinban.getName());
		
		//동사적 특징: 오버로딩
		System.out.println(jinban.eat());
		System.out.println(jinban.eat("선두",0));	//method overload 호출	
		////////////////자신을 객체화하여 사용////////////////////
		Person sumin= new Person();
//		sumin.setEye(2);
//		sumin.setNose(1);
//		sumin.setMouth(1);
		sumin.setName("양수민");
		
		
		
	}//usePerson
	
	public static void main(String[] args) {
		//usePerson class 객체화
		UsePerson up = new UsePerson();
		
		up.usePerson();
		
		
		
	}

}
