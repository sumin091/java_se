package day0213;

/**
 * Thread를 사용하는 이유: 동시에 업무를 처리하기 위해서
 */

//1.Thread 상속
public class ExtendsThread extends Thread{

	//2.run method의 override
	@Override
	public void run() {
		//3.Thread로 동작해야할 코드 정의(동시에 실행되어야 할 코드를 정의)
		for(int i=0; i< 500; i++) {
			System.out.println("run i--->"+i);
		}//end for
	}//run
	
	public void test() {
		for(int i=0; i<500; i++) {
			System.out.println("test i===>"+i);
		}//end for
	}//test
	
	
	public static void main(String[] args) {
		//4.자식클래스를 객체화
		ExtendsThread et= new ExtendsThread();
		//5.start()를 호출하여 Thread로 처리
		long st= System.currentTimeMillis();
		et.start();
		et.test();
		long endt=System.currentTimeMillis();
		System.out.println("===================="+(endt-st)+"ms");
	}//main

}//class
