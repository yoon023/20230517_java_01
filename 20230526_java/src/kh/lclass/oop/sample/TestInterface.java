package kh.lclass.oop.sample;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;

//인터페이스는 익스텐즈 인터페이스만
//클래스
//abstract메소드만 있는 클래스 abstract 안써도됨 
public interface TestInterface extends Serializable{
	int MAXCNT = 10;
	public static final int MAXCNT1= 11;
	public  void method1(); //능력 단위별 평가보기
	public  String method2();//평가안내
	public  int method3(int a, int b);//평가리뷰
	//public int method3(); 
	
	/*
	 * int insertBoard(Car vo); //CRUD + select int deleteBoard(Car vo); int
	 * updateBoard(Car vo); Car selectOne(int boardNo); Car[] selectList(); Car[]
	 * selectListArr(String searchWord); List<Car> selectListList(String
	 * searchWord); Car[] searchSelectBoard(String word);
	 */
	
	
}
