package day0207;

import java.awt.FileDialog;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

@SuppressWarnings("serial")
public class FileCopy2 extends JFrame implements ActionListener {

	private JLabel jlOutput;

	public FileCopy2() {
		super("N-I/O를 사용한 파일복사");

		JButton jbtnCopy = new JButton("복사할 파일 선택");
		jlOutput = new JLabel("복사할 파일을 선택해주세요");
		JPanel jpCenter = new JPanel();
		jpCenter.add(jbtnCopy);

		jlOutput.setBorder(new TitledBorder("출력"));

		add("Center", jpCenter);
		add("South", jlOutput);

		jbtnCopy.addActionListener(this);
		
		setBounds(100, 100, 300, 400);
		setVisible(true);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}// FileCopy

	public void fileCopy() {
		// 원본파일명 얻기
		FileDialog fdOpen = new FileDialog(this, "복사할 파일 선택", FileDialog.LOAD);
		fdOpen.setVisible(true);

		if (fdOpen.getDirectory() == null) {
			return; // early return
		} // end if

		File fileOrigin = new File(fdOpen.getDirectory() + fdOpen.getFile());
		if (!fileOrigin.exists()) {
			JOptionPane.showConfirmDialog(this, "파일이 존재하지 않습니다.");
			return; // early return
		} // end if

		// 복사할 파일명 생성: 원본파일명_bak.확장자
		// => a.txt가 선택되면 a_bak.txt로 파일명을 같은 디렉토리에 생성되도록 만들기
		StringBuilder tempFileName = new StringBuilder(fileOrigin.getAbsolutePath());
		tempFileName.insert(tempFileName.lastIndexOf("."), "_bak"); // 확장자없는 파일은 복사불가능
//		System.out.println(tempFileName);

		File fileCopy = new File(tempFileName.toString());

		// N-I/O를 사용한 파일 복사
		Path originPath = Path.of(fileOrigin.getAbsolutePath()); // Paths.get("경로");
		Path copyPath = Path.of(fileCopy.getAbsolutePath()); // Paths.get("경로");

		try {
			Files.copy(originPath, copyPath, StandardCopyOption.REPLACE_EXISTING);
			jlOutput.setText(fileCopy.getName() + "파일명으로 복사가 되었습니다.");
		} catch (IOException e) {
			JOptionPane.showMessageDialog(this, "파일 복사도중 문제 발생");
			e.printStackTrace();
		}

	}// fileCopy

	@Override
	public void actionPerformed(ActionEvent ae) {
		fileCopy();

	}// actionPerformed

	public static void main(String[] args) {
		new FileCopy();

	}// main
}// class
