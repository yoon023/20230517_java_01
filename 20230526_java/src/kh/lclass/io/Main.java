package kh.lclass.io;

import java.io.IOException;

import kh.lclass.exception.UserException;

public class Main {
	public static void main(String[] args) {
		//new TestFileIo().testFile();
//		new TestFileIo().testFileRead();
//		new TestFileIo().testFileRead2();
//		new TestFileIo().testFileRead3();
//		try {
//			new TestFileIo().testRamda();
//		} catch (UserException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		//new TestFileIo().testFileReadData();
		new TestFileIo().testFileOutputStreamObject();
		new TestFileIo().testFileInputStreamObject();
		System.out.println("===main 끝 ===");
	}
}
