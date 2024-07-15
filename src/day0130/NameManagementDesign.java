package day0130;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

@SuppressWarnings("serial")
public class NameManagementDesign extends JFrame {

	// 이벤트처리와 관련있는 컴포넌트 선언
	private JTextField jtfName, jtfAge;
	private JButton jbtnAdd, jbtnRemove;
	private DefaultListModel<String> dlmName, dlmAge;
	private JList<String> jspJlName, jspJlAge;
//	private JList<String> jspJlInfo;

	public NameManagementDesign() {
		super("이름관리");
		jtfName = new JTextField(10);
		jtfAge = new JTextField(5);
		jbtnAdd = new JButton("추가");
		jbtnRemove = new JButton("삭제");

		dlmName = new DefaultListModel<String>();
		dlmAge = new DefaultListModel<String>();

//		JList<String> jlInfo= new JList<String>(dlmInfo);
//		JScrollPane jspJlInfo= new JScrollPane(jspJlInfo);
//		JScrollPane jspJlName = new JScrollPane(jspJlName);
//		JScrollPane jspJlAge = new JScrollPane(jspJlAge);

		JPanel jpNorth = new JPanel();
		jpNorth.add(new JLabel("이름"));
		jpNorth.add(jtfName);

		jpNorth.add(new JLabel("나이"));
		jpNorth.add(jtfAge);

		jpNorth.add(jbtnAdd);
		jpNorth.add(jbtnRemove);

		jpNorth.setBorder(new TitledBorder("입력"));

		jspJlName.setBorder(new TitledBorder("출력"));
		jspJlAge.setBorder(new TitledBorder(""));

		add("North", jpNorth);
		add("Center", jspJlName);
//		add("Center", jspJlAge);
		
		// has a 관계로 이벤트 처리
		NameManagementEvent nme = new NameManagementEvent(this);
		addWindowListener(nme);
		jbtnAdd.addActionListener(nme);
		jbtnRemove.addActionListener(nme);

		setBounds(100, 50, 500, 300);
		setVisible(true);

	}// NameManagementDesign

	public JTextField getJtfName() {
		return jtfName;
	}// getJtfName

	public JTextField getJtfAge() {
		return jtfAge;
	}// getJtfAge

	public JButton getJbtnAdd() {
		return jbtnAdd;
	}// getJbtnAdd

	public JButton getJbtnRemove() {
		return jbtnRemove;
	}// getJbtnRemove

//	public DefaultListModel<String> getDlmInfo() {
//		return dlmInfo;
//	}
	
	public DefaultListModel<String> getDlmName() {
		return dlmName;
	}//getDlmName
	
	public DefaultListModel<String> getDlmAge() {
		return dlmAge;
	}//getDlmAge

}// class
