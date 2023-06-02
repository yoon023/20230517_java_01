package kh.lclass.io;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class TestFileIo {
	public void testFile() /* throws Exception */ {
//		File f1 = new File("D:/data1/aaa.txt");
//		f1.mkdirs(); //폴더로인지
	
		String path = "D:/data2/test";
		String filename = "aaa.txt";
		
		new File(path).mkdirs(); //디렉토리 생성 s안쓰면 마지막 최종하나만만들어줌
		File f2 = new File(path,filename); //파일  + ,
		
				
//		File f1 = new File("D:/data2/test");
//		f1.mkdirs();
//		File f2 = new File("D:/data2/test/aaa.txt");
		// Unhandled exception type IOException
		FileWriter fw = null; //초기값 무조건 
		try {
			f2.createNewFile();
			
			fw = new FileWriter(f2);
			fw.write("abcdefgssss");
			fw.flush();
			return;
		} catch (IOException e) {
			System.out.println("file생성못함");
			e.printStackTrace();
		} finally {  //가독성 한덩어리 리턴이있어도 거쳤다가감 
			try {
				if (fw != null)
					fw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}

		}

	}

}
//IOException 반드시오류 트라이 캐치 해줘라  ()throws IOException{} 뉴파일 