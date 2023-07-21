package kh.lclass.udp;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UdpEchoSender {
	public static void main(String[] args) {
		UdpEchoSender instance = new UdpEchoSender();
		instance.senderUdp();
		
	}
	
	public void senderUdp() {
		int myPort = 5001;
		int destPort = 6001;
		String destName = "localhost";
		
		DatagramSocket dSock = null;
		BufferedReader br = null;
		
		try {
			dSock = new DatagramSocket(myPort);
			
			br = new BufferedReader(new InputStreamReader(System.in));
			while(true) {
				System.out.println("입력 >>");
				String sendMsg = br.readLine();
				if(sendMsg.equals("exit")) {
					break;
				}
				
				InetAddress destIp = null;
				
				try {
					destIp = InetAddress.getByName(destName);
					byte[] byteMsg = sendMsg.getBytes();
					DatagramPacket sendData = new DatagramPacket(byteMsg,byteMsg.length,destIp,destPort);
					d
					
				}
			}
		}
	}
}
