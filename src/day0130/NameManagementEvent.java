package day0130;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;
import java.util.List;

import javax.swing.DefaultListModel;
import javax.swing.JTextField;

/**
 * 이벤트를 모아 처리하기 위해 작성
 */
public class NameManagementEvent extends WindowAdapter implements ActionListener {

	private NameManagementDesign nmd;

	public NameManagementEvent(NameManagementDesign nmd) {
		this.nmd = nmd;
	}// NameManagementEvent

	
	@Override
	public void actionPerformed(ActionEvent ae) {
		// 이벤트 비교
//		if (ae.getSource() == nmd.getJbtnAdd()) {
//			addInfo();
//		} // end if
//
//		if (ae.getSource() == nmd.getJbtnRemove()) {
//			removeInfo();
//		} // end

		if(ae.getSource() == nmd.getJbtnAdd()) {
			addName();
		}//end if
		
		if(ae.getSource() == nmd.getJbtnRemove()) {
			removeName();
		}
//		if(ae.getSource() == nmd.getJbtnAdd()) {
//			addAge();
//		}//end if
//		
//		if(ae.getSource() == nmd.getJbtnRemove()) {
//			removeAge();
//		}//end 
	}// actionPerformed

	@Override
	public void windowClosing(WindowEvent we) {
		nmd.dispose();

	}// windowClosing
	
//	private void addInfo() {
//		JTextField jtfName = nmd.getJtfName();	// 이름을 가져와서
//		JTextField jtfAge = nmd.getJtfAge();
//		
//		String age = jtfAge.getText().trim();
//		String name = jtfName.getText().trim();
//
//		if (!name.isEmpty() || !age.isEmpty()) {
//			// Model 객체에 값을 설정한다.
//			nmd.getDlmInfo().addElement(name+","+age);
//			jtfName.setText(""); // 값이 입력된 후 텍스트필드를 초기화한다.
//			jtfName.requestFocus(); // 다음 입력이 편하도록 커서를 위치한다.
//		} // end if
//
//
//	}//addInfo
	
	
//	private void removeInfo() {
//		JTextField jtfName = nmd.getJtfName();
////	하나만 삭제
////	nmd.getDlmName().removeElement(jtfName.getText().trim());
//
//		DefaultListModel<String> dlmName = nmd.getDlmInfo();
//
//		Object[] obj= new Object[dlmName.size()];
//		
//		List<String> list = new ArrayList<String>();
//		String tempName = "";
//
//		for (int i = 0; i < dlmName.size(); i++) {
//			tempName = dlmName.getElementAt(i);
//			// J.T.F의 이름과 같지 않은 이름만 리스트에 추가
//			if (!jtfName.getText().equals(tempName)) {
//				list.add(tempName);
//			}
//		} // end for
//		dlmName.removeAllElements(); // Model의 모든 아이템을 삭제하고
//
//		for (String name : list) { // 리스트에 저장된 값으로 Model에 추가
//			dlmName.addElement(name);
//		} // end for
	
		
		
	private void addName() {
		JTextField jtfName = nmd.getJtfName();
		// 이름을 가져와서
		String name = jtfName.getText().trim();

		if (!name.isEmpty()) {
			// Model 객체에 값을 설정한다.
			nmd.getDlmName().addElement(name);
			jtfName.setText(""); // 값이 입력된 후 텍스트필드를 초기화한다.
			jtfName.requestFocus(); // 다음 입력이 편하도록 커서를 위치한다.
		} // end if

		JTextField jtfAge = nmd.getJtfAge();
		String age = jtfAge.getText().trim();

		if (!age.isEmpty()) {
			// Model 객체에 값을 설정한다.
			nmd.getDlmAge().addElement(age);
			jtfAge.setText(""); // 값이 입력된 후 텍스트필드를 초기화한다.
			jtfAge.requestFocus(); // 다음 입력이 편하도록 커서를 위치한다.
		} // end if

	}// addName
//
//
	private void removeName() {
		JTextField jtfName = nmd.getJtfName();
//		하나만 삭제
//		nmd.getDlmName().removeElement(jtfName.getText().trim());

		DefaultListModel<String> dlmName = nmd.getDlmName();

		List<String> list = new ArrayList<String>();
		String tempName = "";

		for (int i = 0; i < dlmName.size(); i++) {
			tempName = dlmName.getElementAt(i);
			// J.T.F의 이름과 같지 않은 이름만 리스트에 추가
			if (!jtfName.getText().equals(tempName)) {
				list.add(tempName);
			}
		} // end for
		dlmName.removeAllElements(); // Model의 모든 아이템을 삭제하고

		for (String name : list) { // 리스트에 저장된 값으로 Model에 추가
			dlmName.addElement(name);
		} // end for

	}// removeName



}// class
