package day0125;

import java.util.Calendar;

import javax.swing.JButton;
import javax.swing.JFrame;


@SuppressWarnings("serial")
public class Work0125 extends JFrame {

	public Work0125() {
		super("달력 출력");

		Calendar cal = Calendar.getInstance();

		int day = cal.get(Calendar.DAY_OF_MONTH);
		int lastDayOfMonth = cal.getActualMaximum(Calendar.DAY_OF_MONTH);
		int firstDayOfWeek = cal.get(Calendar.DAY_OF_WEEK);
		int[] dayArr = new int[lastDayOfMonth];
//		int month = cal.get(Calendar.MONTH) + 1; // Calendar.MONTH는 0부터 시작하므로 1을 더함

		
		for (int i = 1; i < lastDayOfMonth; i++) {
//			System.out.println("  ");
			dayArr[i] = i + 1;
//		    calendarTextArea.append(String.format("%3d ", day));

		}
		
		if ((firstDayOfWeek + day - 1) % 7 == 0) {
			System.out.println();
		}
		
		

		JButton jbtn = new JButton();
//		JPanel jp = new JPanel();

		setLayout(null);

		jbtn.setSize(130, 80);
		jbtn.setLocation(70, 150);

		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		add(jbtn);
	}// Work0125



	public static void main(String[] args) {
		new Work0125();
	}// main

}// class
