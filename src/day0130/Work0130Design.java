package day0130;

import java.awt.BorderLayout;

import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class Work0130Design extends JFrame{
	
	private JTextField jtfName, jtfNumber;
	private JLabel jlName;
	private JButton jbtnAdd, jbtnChange, jbtnRemove, jbtnExit;
	private JRadioButton jrbtn;
	
	public Work0130Design() {
		super("숙제");
		jtfName = new JTextField(10);
		jtfNumber = new JTextField(15);
		
		jbtnAdd= new JButton("추가") ;
		jbtnChange= new JButton("변경");
		jbtnRemove= new JButton("삭제");
		jbtnExit= new JButton("종료");
		
				
		//컴포넌트 설정
		setSize(400,290);
		setResizable(false);	
		setVisible(true);  
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	
	
	
	
	
	
	
	
	

	
	public static void main(String[] args) {
		new Work0130Design();
	}//main

}//class
