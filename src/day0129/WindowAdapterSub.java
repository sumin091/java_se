package day0129;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * WindowAdapter는 abstract method가 존재하지 않는 추상클래스.
 * 자식클래스에서 반드시 Override 해야 할 method가 없다.
 * 개발자가 필요로하는 method만 Overrride 하면된 다.
 */

	
public class WindowAdapterSub extends WindowAdapter{

	//WindowAdapterSub와 TestWindowEvent2는 has a 관계
	private TestWindowEvent2 twe;	//null
	
	//null인 twe에 주소를 할당하기위해 생성자에 매개변수를 선언했다.
	public WindowAdapterSub(TestWindowEvent2 twe) {
		this.twe=twe;
	}
	
	@Override
	public void windowClosing(WindowEvent we) {
		//TestWindowEvent2 클래스의 부모클래스가 제공하는 dispose()
		//호출하여 TestWindowEvent2만 종료해보세요
		//has a 관계로 설정된 twe의 dispose() 호출

		twe.dispose();
		
	}//windowClosing

}
