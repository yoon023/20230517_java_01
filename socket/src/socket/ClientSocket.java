package socket;

import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class ClientSocket {
	//클라이언트용 소켓
	
	public void client (String ip, int port ) {
		Socket socket = null;
		
		try{
			try {
				socket = new Socket(ip, port);
			} catch (UnknownHostException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}finally {
			try{
				if(socket!=null)socket.close();
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
	}
}
