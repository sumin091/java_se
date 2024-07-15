package day0131_hw;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

@SuppressWarnings("serial")
public class JavaMemoDesign extends JFrame implements ActionListener {

	private JMenu jmFile, jmDesign, jmHelp;
	private JMenuItem jmiNew, jmiOpen, jmiSave, jmiEnd, jmiFont, jmiInfo;
	private JMenuBar jmb;
	private JTextArea jtaNote;
	private JScrollPane jspJtaNote;
		
	public JavaMemoDesign() {
		super("메모장");
		
		setLayout(null);
	
		jmb= new JMenuBar();
		
		
		
		//메뉴
		jmFile= new JMenu("파일");
		jmDesign= new JMenu("서식");
		jmHelp= new JMenu("도움말");
		
		jmiNew= new JMenuItem("새글");
		jmiOpen= new JMenuItem("열기");
		jmiSave= new JMenuItem("저장");
		jmiEnd= new JMenuItem("종료");
		
		
		jmFile.add(jmiNew);
		jmFile.add(jmiOpen);
		jmFile.add(jmiSave);
		jmFile.add(jmiEnd);
		
		jmDesign.add(jmiFont);
		
		jmHelp.add(jmiInfo);
		
		//메뉴바 배치
		jmb.add(jmFile);
		jmb.add(jmDesign);
		jmb.add(jmHelp);
		
		
		
		setSize(400,400);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	}//JavaMemoDesign
	
	private void JavaMemoDesign() {
		
	}//JavaMemoDesign
	
	
	@Override
	public void actionPerformed(ActionEvent e) {

	}//actionPerformed

	public JMenu getJmFile() {
		return jmFile;
	}

	
	public JMenu getJmDesign() {
		return jmDesign;
	}

	public JMenu getJmHelp() {
		return jmHelp;
	}

	
	public JMenuItem getJmiNew() {
		return jmiNew;
	}

	
	public JMenuItem getJmiOpen() {
		return jmiOpen;
	}

	
	public JMenuItem getJmiSave() {
		return jmiSave;
	}

	
	public JMenuItem getJmiEnd() {
		return jmiEnd;
	}


	public JMenuItem getJmiFont() {
		return jmiFont;
	}

	
	public JMenuItem getJmiInfo() {
		return jmiInfo;
	}

	
	public JMenuBar getJmb() {
		return jmb;
	}

	
	public JTextArea getJtaNote() {
		return jtaNote;
	}

	
	public JScrollPane getJspJtaNote() {
		return jspJtaNote;
	}

	
}
