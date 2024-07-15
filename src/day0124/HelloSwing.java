package day0124;

import javax.swing.JButton;
import javax.swing.JFrame;

/**
 * 1. Window Component 상속
 */
@SuppressWarnings("serial")
public class HelloSwing extends JFrame {

	public HelloSwing() {
		super("스윙 연습");
		
		//2.컴포넌트 생성
		JButton jbtn= new JButton("안녕 Swing!!!");
		
		//3.배치 => 부모 method 사용, 배치관리자를 사용할 수 있다.
		add(jbtn);
		
		//4.윈도우 크기 설정
		setSize(400,250);
		
		//5.사용자에게 윈도우 컴포넌트 보여주기
		setVisible(true);
		
		//6.종료처리
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}//HelloSwing
	
	public static void main(String[] args) {
		new HelloSwing();
	}//main

}//class
