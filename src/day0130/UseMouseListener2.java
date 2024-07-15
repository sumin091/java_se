package day0130;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Arrays;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.border.TitledBorder;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

@SuppressWarnings("serial")
public class UseMouseListener2 extends JFrame implements MouseListener, ActionListener {

	// 이벤트와 관련 있는 컴포넌트를 인스턴스 변수에 선언
	private DefaultListModel<String> dlmFriend;
	private DefaultListModel<String> dlmBlockFriend;

	private JList<String> jlFriend;
	private JList<String> jlBlockFriend;

	private JButton jbtnBlockAll;
	private JButton jbtnBack;

	public UseMouseListener2() {
		super("친구 리스트");

		// MVC패턴이 도입된 컴포넌트는 Model에 값을 설정한다.
		dlmFriend = new DefaultListModel<String>();
		dlmFriend.addElement("루피");
		dlmFriend.addElement("나루토");
		dlmFriend.addElement("이치고");
		dlmFriend.addElement("쵸파");
		dlmFriend.addElement("히루루크");

		dlmBlockFriend = new DefaultListModel<String>();

		// 모델객체와 has a 관계로 View객체를 생성
		jlFriend = new JList<String>(dlmFriend);
		jlBlockFriend = new JList<String>(dlmBlockFriend);

		jbtnBlockAll = new JButton(">>");
		jbtnBack = new JButton("<<");

		JScrollPane jspFriend = new JScrollPane(jlFriend);
		JScrollPane jspBlockFriend = new JScrollPane(jlBlockFriend);

		jspFriend.setBorder(new TitledBorder("친구"));
		jspBlockFriend.setBorder(new TitledBorder("차단된 친구"));

		// 이벤트에 컴포넌트를 등록
		jlFriend.addMouseListener(this);
		jbtnBlockAll.addActionListener(this);
		jlBlockFriend.addMouseListener(this);
		jbtnBack.addActionListener(this);

		setLayout(null);

		jspFriend.setBounds(20, 40, 150, 200);
		jbtnBlockAll.setBounds(190, 120, 50, 30);
		jspBlockFriend.setBounds(250, 40, 150, 200);
		jbtnBack.setBounds(190, 160, 50, 30);

		add(jspFriend);
		add(jbtnBlockAll);
		add(jspBlockFriend);
		add(jbtnBack);

		setBounds(100, 100, 440, 300);
		setVisible(true);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	@Override
	public void actionPerformed(ActionEvent ae) {

		if (ae.getSource() == jbtnBlockAll) {
			// 친구리스트에서 모든 값을 가져오기
			String[] obj = new String[dlmFriend.size()]; // 배열생성
			obj = (String[]) dlmFriend.toArray(); // 친구리스트의 모든 값을 배열로 복사

			// 차단된 친구리스트에 넣고
			for (int i = 0; i < obj.length; i++) {
				dlmBlockFriend.addElement(obj[i].toString());
			} // end for
				// 모든 친구 삭제하기
			dlmFriend.removeAllElements();
		} // end if

		if (ae.getSource() == jbtnBack) {
			String[] obj2 = new String[dlmBlockFriend.size()]; // 배열생성
			obj2 = (String[]) dlmBlockFriend.toArray(); // 차단 친구리스트의 모든 값을 배열로 복사

			for (int i = 0; i < obj2.length; i++) {
				dlmFriend.addElement(obj2[i].toString());
			} // end for
			dlmBlockFriend.removeAllElements();
		} // end if
	}// actionPerformed

	@Override
	public void mouseClicked(MouseEvent me) {
//		System.out.println("mouseClicked");	//키의 자겁이 종료된 후
		// 어떤 키가 눌리던 호출된다: 키에 대한 비교
//		System.out.println(me.getButton());	//눌려진 버튼의 값 얻기

		switch (me.getButton()) {
		case MouseEvent.BUTTON1:
			if (me.getSource() == jlFriend) { // 친구리스트에서 이벤트 발생

				int ind = jlFriend.getSelectedIndex();
				if (ind != -1) {
					// 선택된 인덱스에 해당하는 값을 Model에서 얻고
					String name = dlmFriend.getElementAt(ind);
					// 얻어낸 값을 차단된 친구로 등록 (dlmBlockFriend)
					dlmBlockFriend.addElement(name);

					// 선택된 인덱스에 해당하는 값을 Model에서 삭제
					dlmFriend.remove(ind);
				} // end if

			} // end if

			if (me.getSource() == jlBlockFriend) { // 차단친구리스트에서 이벤트 발생

				int ind = jlBlockFriend.getSelectedIndex();
				if (ind != -1) {
					// 선택된 인덱스에 해당하는 값을 Model에서 얻고
					String name = dlmBlockFriend.getElementAt(ind);
					// 얻어낸 값을 차단된 친구로 등록 (dlmBlockFriend)
					dlmFriend.addElement(name);

					// 선택된 인덱스에 해당하는 값을 Model에서 삭제
					dlmBlockFriend.remove(ind);

				} // end if
			} // end switch

		}
	}// mouseClicked

	@Override
	public void mousePressed(MouseEvent e) {
//		System.out.println("mousePressed");	//처음 클릭되었을때
	}

	@Override
	public void mouseReleased(MouseEvent e) {
//		System.out.println("mouseReleased");	//클릭된 키가 올라왔을때
	}

	@Override
	public void mouseEntered(MouseEvent e) {
//		System.out.println("mouseEntered");
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// System.out.println("mouseExited");
	}

	public static void main(String[] args) {
		new UseMouseListener2();
	}// main

}// class
