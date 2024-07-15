package day0129;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

@SuppressWarnings("serial")
//1.window component 상속, 이벤트 처리용 ~Listener 구현
public class UseActionEvent extends JFrame implements ActionListener {

	//3.Override한 method안에서 사용해야할 컴포넌트를 인스턴스변수로 선언
	
	private JTextField jtfName;	
	private JTextArea jtaList;
	private JComboBox<String> jcbGender;
	
	public UseActionEvent() {
		super("여러 레이아웃매니저 사용");
		//2.컴포넌트 생성
		JLabel jlblName= new JLabel("이름");
		jtfName= new JTextField(10);
		
		jcbGender= new JComboBox<String>();	//MVC 패턴을 적용할 클래스인데 모델을 사용하지 않음..
		jcbGender.addItem("남자");
		jcbGender.addItem("여자");
		JButton jbtnInput= new JButton("입력");
		
		//4.컴포넌트를 이벤트에 등록
		jbtnInput.addActionListener(this);
		jtfName.addActionListener(this);
		
		jtaList= new JTextArea();
		JScrollPane jsp= new JScrollPane(jtaList);
		
		//여러개의 컴포넌트를 관리하기 위해서 Container Component를 사용
		JPanel jpNorth= new JPanel();
		jpNorth.add(jlblName);	//JPanel에 컴포넌트 배치
		jpNorth.add(jtfName);	//JPanel에 컴포넌트 배치
		jpNorth.add(jcbGender);	//JPanel에 컴포넌트 배치
		jpNorth.add(jbtnInput);	//JPanel에 컴포넌트 배치
		
		//윈도우 컴포넌트( 사용자에게 보여주는일 )에 배치 
		add("North", jpNorth);
		add("Center", jsp);
		
		//4.크기 설정
		setSize(450, 300);
		
		//5.가시화
		setVisible(true);
		
		//6.종료
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}//UseLayoutManager
	
	@Override
	public void actionPerformed(ActionEvent ae) {
		//이벤트가 발생했을때 사용자에게 제공할 코드
//		JTextField의 값을 가져와서 JTextArea에 설정한다.
		String data=jtfName.getText();
		String gender=jcbGender.getItemAt(jcbGender.getSelectedIndex());
	
		//Model 객체를 사용하지 않았으므로 View 객체에서 선택된 아이템의 값을 얻는다.
//		String gender=(String)jcbGender.getSelectedItem();
		System.out.println(data);
//		jtaList.setText(data+"님");
		jtaList.append(gender+ data+"님\n");
		
		//JTextField에 입력된 이름 삭제
		jtfName.setText("");
	
			
		
	}//actionPerformed
	
	
	public static void main(String[] args) {
		new UseActionEvent();
	}//main

}//class
