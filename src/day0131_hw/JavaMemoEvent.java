package day0131_hw;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.jar.JarFile;

public class JavaMemoEvent extends WindowAdapter implements ActionListener {

	private JavaMemoDesign jmd;

	public JavaMemoEvent(JavaMemoDesign jmd) {
		this.jmd = jmd;
	}// JavaMemoEvent

	@Override
	public void actionPerformed(ActionEvent e) {

	}// actionPerformed

	private void newMemo() {

	}//newMemo

	private void openMemo() {

	}//openMemo
	
	private void saveMemo() {

	}//saveMemo
	
	private void closeMemo() {

	}//closeMemo
	
	private void fontDialog() {

	}//fontDialog
	
	private void helpDialog() {

	}//helpDialog

	@Override
	public void windowClosing(WindowEvent e) {
		jmd.dispose();
	}// windowClosing

}
