package day0131;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 * 부가적인 기능을 제공하기 위해 제작하는 창: Dialog 
 */
@SuppressWarnings("serial")
public class SubJDialog extends JDialog implements ActionListener {

	public SubJDialog(ParentFrame pf) {	//Frame의 자식창
//		super(pf, "부가적인 기능", true);	//modal 부모와 has a  관계
		super(pf,"부가적인 기능",false);	//non-modal
		
		ImageIcon ii= new ImageIcon("E:/dev/workspace/java_se/src/day0125/images/img3.png");
		JLabel jlblBack=new JLabel("자식창에서 제공하는 이미지",ii,JLabel.CENTER);
		
		JButton jbtn= new JButton("닫기");
		JPanel jp= new JPanel();
		jp.add(jbtn);
		
		add("Center",jlblBack);
		add("South",jp);
		
		//JDialog는 이벤트 등록코드를 setVisible전에 정의해야한다.
		jbtn.addActionListener(this);
		//JDialog의 종료: DISPOSE_ON_CLOSE 사용
		setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
		
		setBounds(pf.getX()+100, pf.getY()+150, 244, 200);		//부모창 안에 자식 창 띄우기
		setVisible(true);	//사용자에게 보여지는 일
	}//SubJDialog
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
//		dispose();
		System.exit(JFrame.ABORT);
	}//actionPerformed

}//class
