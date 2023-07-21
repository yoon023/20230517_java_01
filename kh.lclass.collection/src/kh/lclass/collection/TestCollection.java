package kh.lclass.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.function.UnaryOperator;


public class TestCollection {
	public void testArraylist() {
		String[] strArr1 = new String[3];
		strArr1[0] = "바나나";
		strArr1[0] = "딸기";
		strArr1.clone();
		
		/*
		 * //public class ArrayList implements List{ 
		 * * public boolean add(object e){
		 * } 오브젝트쓰면 다들어간다. 
		 * 
		 * public boolean add(String e){
		 * }
		 * public boolean add(Integer e){
		 * }
		 * public boolean add(Double e){
		 * }
		 * }
		 */

		ArrayList<String> list1 = new ArrayList<String>();
		ArrayList<Integer> list2 = new ArrayList<Integer>();
		ArrayList<Car> list3 = new ArrayList<Car>();
		
		
		
		
		list2.clone();
		
		
		
		
		if(list1.add("7번")) {
			System.out.println("list1에 추가 성공했습니다.");
		}

		list1.add("1번");
		list1.add("2번");
		list1.add("3번");
		list1.add("2번");
		list1.add(1, "2번대신끼워넣기");
		Collection<String> collection1 = new ArrayList<String>();
//			collection1.add("2번");
		// collection1.add("3번");
		list1.removeAll(collection1);
		list1.clone();
		// 리스트 어레이리스트 리스트로 선언하고 인터페이스 오브젝트 클래스 못받음
		// 리스트를 어레이리스트로 변환 클론(오브젝트 클래스 안 )쓰고싶으면
		// ((ArrayList<String>)list1)
//			@SuppressWarnings("unchecked") if문을 썼다면 
		// if(list1 instanceof ArrayList){
//			ArrayList<String> copyList = (ArrayList<String>)((ArrayList<String>)list1).clone();
//			System.out.println(copyList);
//			}
		if (list1 instanceof ArrayList) {
			@SuppressWarnings("unchecked")
			ArrayList<String> copyList = (ArrayList<String>) list1.clone();
			System.out.println(copyList);
		}
		// list.remove(0);
//			list.clear();
		System.out.println(list1);
	}
}
