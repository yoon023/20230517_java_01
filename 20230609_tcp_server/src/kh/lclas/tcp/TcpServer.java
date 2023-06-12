package kh.lclas.tcp;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.List;

public class TcpServer {
	ServerSocket ss = null;
	Socket sc = null;
	InputStream in = null;
	OutputStream out = null;
	BufferedReader br = null;
	BufferedWriter wr = null; 
	
	public void testTcpServer(int port) {
		// 2서버용 소켓 객체 생성
		ss = new ServerSocket(port);
		in = new ServerSocket(port);
		ss = new ServerSocket(port);
		ss = new ServerSocket(port);
		ss = new ServerSocket(port);
		ss = new ServerSocket(port);
		try {
			ss = new ServerSocket(port);

			while (true) {
				// 3,4
				System.out.println("클라이언트 접속 대기 중......");
				Socket sc = ss.accept();
				System.out.println("클라이언트 접속됨:" + sc.getLocalPort());
				System.out.println("클라이언트 접속됨:" + sc.getPort());
				// 5
				InputStream in = sc.getInputStream();
				OutputStream out = sc.getOutputStream();
				// 6보조스트림
				BufferedReader br = new BufferedReader(new InputStreamReader(in));
				BufferedWriter wr = new BufferedWriter(new OutputStreamWriter(out));

				String receivedMsg = null;
				while ((receivedMsg = br.readLine()) != null) {
					System.out.println("받은메세지: " + receivedMsg);
					wr.write("메세지 잘 받았음.");
					wr.flush();
				}

			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (wr != null)
					wr.close();
				if (br != null)
					br.close();
				if (out != null)
					out.close();
				if (in != null)
					in.close();
				if (sc != null)
					sc.close();
				if (ss != null)
					ss.close();

			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}
}
