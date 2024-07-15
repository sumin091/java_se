package day0131;

import java.awt.FileDialog;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class ParentFrame extends JFrame implements ActionListener {
	private JButton jbtn, jbtnOpen, jbtnSave;

	public ParentFrame() {
		super("다이얼로그 연습");
		jbtn = new JButton("다이얼로그");
		jbtnOpen = new JButton("파일다이얼로그 열기");
		jbtnSave = new JButton("파일다이얼로그 저장");

		JButton jbtn = new JButton("다이얼로그");
		JPanel jp = new JPanel();
		jp.add(jbtn);
		jp.add(jbtnOpen);
		jp.add(jbtnSave);

		jbtn.addActionListener(this);
		jbtnOpen.addActionListener(this);
		jbtnSave.addActionListener(this);

		add("Center", jp);
		setSize(500, 500);
		setVisible(true);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}// ParentFrame

	@Override
	public void actionPerformed(ActionEvent ae) {
		if (ae.getSource() == jbtn) {
			new SubJDialog(this);
		} // end if

		if (ae.getSource() == jbtnOpen) {
			open();
		} // end if

		if (ae.getSource() == jbtnSave) {
			save();
		} // end if

	}// actionPerformed

	

	private void open() {
		FileDialog fdOpen= new FileDialog(this,"파일열기", FileDialog.LOAD);
		fdOpen.setVisible(true);
		
		String path= fdOpen.getDirectory();
		String fName= fdOpen.getFile();
		
		if( path != null) {
			
			if(path.length() > 10) {	//취소를 누르면 경로나 파일명에 null입력
				path=path.substring(0, 10)+"...";
			}
			setTitle(path+fName);
		}//end if
		

	}//open

	private void save() {
		FileDialog fdSave = new FileDialog(this,"파일저장",FileDialog.SAVE);
		fdSave.setVisible(true);
		
		String path= fdSave.getDirectory();
		String fName= fdSave.getFile();
		
		if( path != null) {
			
			if(path.length() > 10) {	//취소를 누르면 경로나 파일명에 null입력
				path=path.substring(0, 10)+"...";
			}
			setTitle("저장 "+path+fName);
		}
		
	}//save
	
	public static void main(String[] args) {
		new ParentFrame();
		
	}//main

}// class
