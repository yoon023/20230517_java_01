package kh.lclass.inet;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;

public class TestInetAddress {
	public void testInetAddressEx() {

		// The constructor InetAddress() is not visible
		// 원인 : 생성자 없음.
		// 조치내용 : 1. singleton 확인 (주로 getInstance(), create() 메소드 지원 확인)
		// 2.생성자 없이 static method 즉 클래스메소드 지원 확인.
		String host1 = "www.naver.com";
		String host2 = "www.google.com";
		String host3 = "www.oracle.com";

		try {
			InetAddress loopbackAddr = InetAddress.getLoopbackAddress();
			System.out.println(loopbackAddr);
			InetAddress localIp= InetAddress.getLocalHost();
			System.out.println(localIp); //DESKTOP-AGTHQND/192.168.10.19
			boolean isLoopback = localIp.isLoopbackAddress();
			System.out.println(isLoopback);
			
			System.out.println("===localhost===");
			InetAddress lb= InetAddress.getByName("localhost");
			System.out.println(Arrays.toString(lb.getAddress()));
			boolean lbIsLoopback = lb.isLoopbackAddress();
			System.out.println(lbIsLoopback); //DESKTOP-AGTHQND/192.168.10.19
			
			byte[] byteArr = new byte[] {(byte)223,(byte)130,(byte)200,(byte)107}; 
			System.out.println(Arrays.toString(byteArr));
			InetAddress byte2Arr = InetAddress.getByAddress(byteArr);
			System.out.println(byte2Arr);// /223.130.200.107
			String byte2Arr2HostName =  byte2Arr.getHostName();
			System.out.println(byte2Arr2HostName);
			System.out.println(byte2Arr.getHostAddress());
			
			InetAddress[] ipAll =  InetAddress.getAllByName(host1);
			System.out.println(Arrays.toString(ipAll)); //[www.naver.com/223.130.200.107, www.naver.co
			for(InetAddress ip : ipAll) {
				System.out.println(ip);
				byte[] ipAddr = ip.getAddress();
//				
//				System.out.println(Byte.MIN_VALUE);
//				System.out.println(Byte.MAX_VALUE);
				
				System.out.print("ip: ");
				for(int i =0; i< ipAddr.length;i++) {
					if(ipAddr[i]<0) {
						System.out.print(ipAddr[i]+256);
					}
					else {
						System.out.print(ipAddr[i]);
					}
					if( i != ipAddr.length-1) {
						System.out.print(".");
					}
				}
				System.out.println();
				int cnt = 0;
				for(int item : ipAddr) {
					if(item<0) {
						System.out.print(item+256); 
					}
					else {
						System.out.print(item);
					}
					if(cnt != ipAddr.length-1) {
						System.out.print(".");
					}
					cnt++;
				}
				System.out.println();
			}
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
	}
}
