package day0108;

/**
 * method의 형태:
 */
public class MethodType {

	//고정 일: 반환형 없고(void), 매개변수 없는 형
	public void typeA() {	//static이 없는 instance method
		System.out.println("고정 동작");
	}//typeA		
	
	//가변 일: 반환형 없고(void), 매개변수 존재
	public void typeB(int i){
		System.out.println("가변일: "+i);
	}//typeB
	
	//고정 값: 반환형 존재, 매개변수 없는 형
	//반드시 method의 가장 마지막줄에 return이 나와야 한다.
	public int typeC(){
		int i=2024;
		
		return i;
	}//typeC
	
	//가변 값: 반환형 존재, 매개변수 존재(동적)
	public int typeD(double d ) {
		
		return (int)d;		//double을 int로 통과불가하기에 casting
	}//typeD
	
	public static void main(String[] args) {
		//객체화: 인스턴스 변수나 인스턴스 method를 사용하기 위해서
		//클래스명.객체명= new 클래스명();
				
		MethodType mt= new MethodType();
		//고정 일하는 method 호출 => 여러번 호출해도 같은 결과호출
		mt.typeA();
		//mt.typeA(333); -> 값 할당 불가
		
		//가변 일 method호출-> 외부값(arguments)에 대해 다른 일을 수행
		mt.typeB(33);	
//		int i=mt.typeB(8);//반환형이 void인건 
		
		//고정 값: 반환형에 일치하는 데이터형으로 변수를 만들고 반환 값을 저장하여 사용한다.
		int i=mt.typeC();
		System.out.println("고정 값:"+i);
		
		int j=mt.typeC();
		System.out.println("고정 값:"+j);
		
		//가변 값: 반환형에 일치하는 데이터형으로 변수를 만들고, 반환 값을 저장하여 사용한다.
		i=mt.typeD(2024.01);
		System.out.println("가변 값: "+i);
		i=mt.typeD(1.08);
		System.out.println("가변 값: "+i);
		i=mt.typeD(5.8);
		System.out.println("가변 값: "+i);
		
		
		
		
		
		
	}//main

}//class
