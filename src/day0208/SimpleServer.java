package day0208;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

import javax.swing.JOptionPane;

public class SimpleServer {	//input.output

	public void msgServer() throws IOException {
		// 1.서버소켓 생성
		ServerSocket server = null;
		Socket client = null;
		DataOutputStream dos = null;
		DataInputStream dis= null;

		try {
			server = new ServerSocket(7770);
			String msg = "창의롭고 신비로운 7770 서버포트에 오신걸 환영합니다";
			while (true) {
				// 3.접속자 소켓을 받는다.
				client = server.accept();

				// 4.메시지를 보내기위한 스트림을 소켓에서 얻는다.
				dos = new DataOutputStream(client.getOutputStream());
				// 5.스트림에 메시지 쓰기
				dos.writeUTF(msg);
				// 6.목적지(socket)로 스트림의 내용을분출
				dos.flush();
				
				String ip = JOptionPane.showInputDialog("메시지 받거라");
				// 2.소켓생성 => 서버에 연결 (3-way handshaking)하여 회선 확립 시도
				client = new Socket("192.168.10." + ip, 7770);
				// 4.스트림 열기
				dis = new DataInputStream(client.getInputStream());
				// 7.값 얻기
				String msg2 = dis.readUTF();
				JOptionPane.showMessageDialog(null, "친구의 메시지: " + msg2);
			
			} // end while
		} finally {
			// 7.연결 끊기
			if (dos != null) {dos.close();} // end if
			if (client != null) {client.close();} // end if
			if (server != null) {server.close();} // end if

			if (dis != null) {dis.close();} // end if
		
		} // end finally
		
		

	}// msgServer


	public static void main(String[] args) {
		SimpleServer ss = new SimpleServer();

		try {
			ss.msgServer();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}// main

}// class
