package day0125;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

@SuppressWarnings("serial")
public class UseGridLayout2 extends JFrame {

	public UseGridLayout2() {
		super("번호");
		String[] numArr= {"1","2","3","4","5","6","7","8","9","0","*","#"};
		JButton[] jrbArr= new JButton[numArr.length];
		
		setLayout(new GridLayout(4,3));	
		for(int i=0; i<numArr.length; i++) {
			jrbArr[i]= new JButton(numArr[i]);
			add(jrbArr[i]);
		}//end for
		
		setSize(300,400);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				
	}//UseGridLayout2
	
	public static void main(String[] args) {
		//new UseGridLayout2();
		
	}//main

}//class
