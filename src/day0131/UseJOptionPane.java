package day0131;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

@SuppressWarnings("serial")
public class UseJOptionPane extends JFrame implements ActionListener,WindowListener {

	private JMenuItem jmiInput, jmiMessage, jmiConfirm;

	public UseJOptionPane() {
		super("JOptionPane 사용");

		JMenuBar jmb = new JMenuBar(); // 메뉴바 생성
		JMenu jm = new JMenu("사용"); // 메뉴 생성
		// 메뉴아이템 생성
		jmiInput = new JMenuItem("input dialog");
		jmiMessage = new JMenuItem("message dialog");
		jmiConfirm = new JMenuItem("confirm dialog");

		// 메뉴아이템 > 메뉴 배치
		jm.add(jmiInput);
		jm.add(jmiMessage);
		jm.add(jmiConfirm);

		// 메뉴 > 메뉴바 배치
		jmb.add(jm);

		// 메뉴바 > Frame 설정
		setJMenuBar(jmb);
		;

		// 이벤트 등록
		jmiInput.addActionListener(this);
		jmiMessage.addActionListener(this);
		jmiConfirm.addActionListener(this);

		setSize(400, 400);
		setVisible(true);
		
		//x버튼이 눌렸을때 "아무것도 하지 않도록 설정"
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		
		addWindowListener(this); 	//윈도우 이벤트가 발생하면 현재 클래스 안에서 
		//이벤트 처리
		
//		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	//종료

	}// UseJOptionPane

	private void useInput() {
		String data = JOptionPane.showInputDialog("이름을 입력해주세요", "홍길동");
		if (data != null) {
			System.out.println(data);
		} // end if
		System.out.println(data);
	}// useInput

	private void useMessage() {
//		JOptionPane.showMessageDialog(this, "오늘은 수요일");
		JOptionPane.showMessageDialog(this, "오늘은 수요일", "오늘의 요일은", JOptionPane.WARNING_MESSAGE);

	}// useInput

	private void useConfirm() {
		int flag= JOptionPane.showConfirmDialog(this, "오늘 수업은 여기까지 하겠습니다.");
		System.out.println(flag);
		switch (flag) {
		case JOptionPane.OK_OPTION: 
			JOptionPane.showMessageDialog(this, "감사합니다.");
		case JOptionPane.NO_OPTION:
			JOptionPane.showMessageDialog(this, "수업계속해요.");
		case JOptionPane.CANCEL_OPTION:
			JOptionPane.showMessageDialog(this, "무념무상.");

		}//end switch
	}// useInput

	@Override
	public void actionPerformed(ActionEvent ae) {

		if (ae.getSource() == jmiInput) {
			useInput();
		} // end if

		if (ae.getSource() == jmiMessage) {
			useMessage();
		} // end if

		if (ae.getSource() == jmiConfirm) {
			useConfirm();
		} // end if

	}// actionPerformed
	
	

	/**
	 * Window에 X 버튼을 누르면 WindowClosing이 호출된다.
	 */
	@Override
	public void windowOpened(WindowEvent e) {
		
	}//windowOpened

	@Override
	public void windowClosing(WindowEvent e) {
		int flag=JOptionPane.showConfirmDialog(this, "정말 종료하시겠습니까?");
		
		//"예"가 눌려지면 프로그램이 종료되어야 하지만
		//아니오나 취소가 눌려지면 종료되지 말아야한다.
		switch(flag) {
		case JOptionPane.OK_OPTION:
			dispose();
		}//end switch
		
	}//windowClosing

	@Override
	public void windowClosed(WindowEvent e) {
		System.exit(JFrame.ABORT);
	}//windowClosed

	@Override
	public void windowIconified(WindowEvent e) {
		
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		
	}

	@Override
	public void windowActivated(WindowEvent e) {
		
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		
	}
	
	
	
	public static void main(String[] args) {
		new UseJOptionPane();
	}// main

}// class
