package day0129;

import java.awt.GridLayout;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

@SuppressWarnings("serial")
public class Work0129 extends JFrame implements KeyListener {

	private JTextField jta;
	private JPasswordField jpf;
	private JLabel jl;

	public Work0129() {
		
		GridLayout gl= new GridLayout(3,3);
		setLayout(gl);
		
		
		jta = new JTextField();
		jpf = new JPasswordField();
		jl = new JLabel();
		
		
		jta.addKeyListener(this);

		setSize(400, 400);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}// Work0129

	
	@Override
	public void keyTyped(KeyEvent e) {

	}

	@Override
	public void keyPressed(KeyEvent ke) {
		char c = ke.getKeyChar();
		int code = ke.getKeyCode();
		String input="";

		if (code == KeyEvent.VK_ENTER) {
			if(input.isEmpty()) {
				
			}
		}

		if (code == KeyEvent.VK_ENTER) {

		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	public static void main(String[] args) {
		new Work0129();
	}// main

}// class
