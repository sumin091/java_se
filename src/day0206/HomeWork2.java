package day0206;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class HomeWork2 {
	
	public HomeWork2() throws IOException {

		setTextArea();
		
	}
	
	public void setTextArea() throws IOException {
		//jta 설정
		JTextArea jta = new JTextArea(10,50);
		JScrollPane jsp = new JScrollPane(jta);
		jta.setText("이름	수정한날짜 		유형		크기\n");
		jta.setEditable(false);
	

		String show = JOptionPane.showInputDialog("경로를 입력해주세요");
		File file = new File(show);
		File[]fileList =file.listFiles();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		
		
//		if(file.exists()) {
//			for(int i=0; i < fileList.length ; i++) {
//				String isDir = fileList[i].isDirectory()?"디렉토리":"파일";
//				if(isDir.equals("파일")) {
//					jta.append(fileList[i].getName() +"\t" + sdf.format(new Date(fileList[i].lastModified())) + "\t" + isDir + "\t\t" + fileList[i].length()+"byte\n");
//				}else {
//					jta.append(fileList[i].getName() +"\t" + sdf.format(new Date(fileList[i].lastModified())) + "\t" + isDir + "\t\t\n" );					
//				}
//			}
//	
//		}else {
//			JOptionPane.showMessageDialog(null, "존재하지 않는 파일 혹은 디렉토리입니다");
//		}
		
		if(!file.exists()) {
			JOptionPane.showMessageDialog(null, "존재하지 않는 파일 혹은 디렉토리 입니다.");
			return;
		}//end if
		
		StringBuilder sbOutput= new StringBuilder();
		
		for(File readFile: fileList) {
			sbOutput.append(readFile.getName()).append("\t")
			.append(sdf.format(new Date(readFile.lastModified())));
				
			if(readFile.isFile()) {
				sbOutput.append("\t파일\t\t").append(readFile.length()).append("byte\n");
			}else {
				sbOutput.append("\t디렉토리\t\t\n");
			}//end else
		}//end for
		
		jta.setText(sbOutput.toString());
		JOptionPane.showMessageDialog(null, jsp);
	
	}
	public static void main(String[] args) throws IOException {
			new HomeWork2();
	}
}
