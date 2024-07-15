package day0118;

import day0117.Clark;

public class UseAnonymous {

	public void testFly(Fly fly) {
//	객체다형성:	fly는 어느때에는 FlyImpl이 되고 어느때에는 Clark이 될수 있다. -> (fly객체) 객체다형성
		System.out.println("추진력: "+fly.drivingForce());
		System.out.println("양력: "+fly.lift());
		
	}
	
	public static void main(String[] args) {
		
//		UseAnonymous가 Fly interface를 호출해 사용하는것: has a 관계
//		Flimpl이 fly를 구현하는것: is a 관계
		
		//testFly method를 호출해보세요
		UseAnonymous ua= new UseAnonymous();	//인터페이스는 객체화 불가
		//FlyImpl.class 파일 생성후 사용
		ua.testFly(new FlyImpl());
		ua.testFly(new Clark());
		
		
		//FlyImpl.class 파일(소스코드)를 별도로 만들지 않고, 객체를 생성하여 arguments값을 할당할때 
//		=> method가 딱 한번만 호출될때
		ua.testFly(new Fly() {
			
			@Override
			public String lift() {
				return "포항항";
			}
			
			@Override
			public String drivingForce() {
				return "데헷";
			}
		});
	}//main

}//class
