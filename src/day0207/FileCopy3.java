package day0207;

import java.awt.FileDialog;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

@SuppressWarnings("serial")
public class FileCopy3 extends JFrame implements ActionListener {
	
	private JLabel jlOutput;
	

	public FileCopy3() {
		super("파일복사");
		
		JButton jbtnCopy= new JButton("복사할 파일 선택");
		jlOutput= new JLabel("복사할 파일을 선택해주세요");
		JPanel jpCenter= new JPanel();
		jpCenter.add(jbtnCopy);
		
		jlOutput.setBorder(new TitledBorder("출력"));
		
		add("Center", jpCenter);
		add("South", jlOutput);
		
		setBounds(100, 100, 300, 400);
		setVisible(true);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}//FileCopy
	
	public void fileCopy() throws IOException {
		//원본파일명 얻기
		FileDialog fdOpen= new FileDialog(this,"복사할 파일 선택", FileDialog.LOAD);
		fdOpen.setVisible(true);
		
		if(fdOpen.getDirectory() == null) {
			return;	//early return
		}//end if
		
		File fileOrigin=new File(fdOpen.getDirectory()+fdOpen.getFile());
		if(!fileOrigin.exists()) {
			JOptionPane.showConfirmDialog(this, "파일이 존재하지 않습니다.");
			return;		//early return
		}//end if
		
		//복사할 파일명 생성: 원본파일명_bak.확장자 
		// =>  a.txt가 선택되면 a_bak.txt로 파일명을 같은 디렉토리에 생성되도록 만들기
		StringBuilder tempFileName= new StringBuilder(fileOrigin.getAbsolutePath());
		tempFileName.insert(tempFileName.lastIndexOf("."),"_bak");	//확장자없는 파일은 복사불가능
		System.out.println(tempFileName);
		
		File fileCopy= new File(tempFileName.toString());

		//16bit 스트림 연결
		//읽기가능 - 단순txt, HTML, XML, json, java.... 불가능: 그외
		BufferedReader br= null;
		//쓰기
		BufferedWriter bw=null;
		try {
			br= new BufferedReader(new FileReader(fileOrigin));
			bw= new BufferedWriter(new FileWriter(fileCopy));
			
			String temp="";
			//줄단위로 읽어들여 (\n 전까지 읽어들이기)
			while((temp= br.readLine()) != null) {
				bw.write(temp);	//읽어들인 내용을 스트림에 기록
			}//end while
			
			bw.flush();	//스트림에 존재하는 내용을 목적지로 분출
			
			jlOutput.setText(fileCopy.getName()+"파일명으로 복사가 되었습니다.");
			
		}finally {
			//연결끊기
			if(br != null) {br.close();}//end if
			if(bw != null) {bw.close();}//end if
			
		}//end finally
	}//fileCopy
	

	@Override
	public void actionPerformed(ActionEvent ae) {
		try {
			fileCopy();
		} catch (IOException e) {
			JOptionPane.showMessageDialog(this, "파일 복사중 문제가 발생했음");
			e.printStackTrace();
		}//end catch
		
	}//actionPerformed

	public static void main(String[] args) {
		FileCopy3 fc=new FileCopy3();
		try {
			fc.fileCopy();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}//main
}//class
