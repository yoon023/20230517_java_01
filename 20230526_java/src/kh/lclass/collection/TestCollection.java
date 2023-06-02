package kh.lclass.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Stack;
import java.util.function.UnaryOperator;

import kh.lclass.oop.sample.Car;

public class TestCollection {
	
	public <E extends Number, J> String testGeneric(E a, J b) {
		 System.out.println(a.getClass().getName());
		 System.out.println(b.getClass().getName());
		 return a.toString()+"결과값"+ b.toString();
		
		
	}
	
	public void testStack() {            //스택 참조형 
		Stack<String> strStack = new Stack<String>();
		strStack.push("안녕");
		strStack.add("하");
		strStack.push("세요");
		System.out.println(strStack.get(1));
		System.out.println(strStack);
		System.out.println(strStack.peek());
		System.out.println(strStack);
		System.out.println(strStack.pop()); //가장나중 꺼내버리다. 메모리에안남아
		System.out.println(strStack);
		
	}
	
	public void testHashMap() {
		Map<String, Object> objMap = new HashMap<String, Object>();
		objMap.put("ej", 35.0);
		objMap.put("jy", "지영이네");
		objMap.put("hj", new Car(5000));
		System.out.println(objMap.toString());
		System.out.println("jy" + ":" + objMap.get("jy"));
		Set<String> keySet = objMap.keySet();//키이름을불러옴 
		System.out.println(keySet);
		System.out.println("===== Map: enhanced for");
		for (String item : keySet) {
			Object value = objMap.get(item);
			System.out.println(item + " : " + value); // 밸류 투스트링생략
		}
		System.out.println("===== Map: Iterator for");

		Iterator<String> itr = keySet.iterator();
		while (itr.hasNext()) {                            
			String item = itr.next();
			Object value = objMap.get(item);
			System.out.println(item);
		}
	}

	public void testHashSet() {
		Set<Integer> integerSet = new HashSet<Integer>();
		integerSet.add(11);
		integerSet.add(22);
		integerSet.add(33);
		integerSet.add(11);

		System.out.println(integerSet.toString());
		System.out.println(integerSet.size());
		System.out.println("=======Set : enhanced for");
		for (Integer item : integerSet) {
			System.out.println(item);
		}
		System.out.println("=======Set : Iterator 사용");

		Iterator<Integer> itr = integerSet.iterator();
		while (itr.hasNext()) {
			Integer item = itr.next();
			System.out.println(item);
		}
		System.out.println(itr);
	}

	public void testArraylist() {
		String[] strArr1 = new String[3];
		strArr1[0] = "바나나";
		strArr1[1] = "딸기";
		// strArr1[3] = "수박";Index 3 out of bounds for length 3
		strArr1.clone();
		// 오류System.out.println(strArr1[3]); ArrayIndexOutOfBoundsException:

		/*
		 * //public class ArrayList implements List{ * public boolean add(object e){ }
		 * 오브젝트쓰면 다들어간다. 참조자료형만 가능
		 * 
		 * public boolean add(String e){ } public boolean add(Integer e){ } public
		 * boolean add(Double e){ } }
		 */

		ArrayList<String> list1 = new ArrayList<String>();
		ArrayList<Integer> list2 = new ArrayList<Integer>();
		ArrayList<Car> list3 = new ArrayList<Car>();
		list3.add(new Car(3000));
		list2.add(25);
		list2.add(26);
		list2.add(null);
		list2.add(27);
		list2.add(55);
		list2.add(2, 55); // 끼워넣기 insert index 현재사이즈보다는 클 수 없다 단 개수 제한 없기때문에
		// Index 1000 out of bounds for length 3
		System.out.println("=====");
		System.out.println(list2.get(2));
		System.out.println(list2.get(4));

		// 배열 for문과 짝궁
		// List - for 배열 length
		System.out.println("=====");
		for (int i = 0; i < strArr1.length; i++) {
			String item = strArr1[i];
			System.out.println(item);
		}
		System.out.println("=====");
		for (int i = 0; i < list2.size(); i++) {
			Integer item = list2.get(i);
			System.out.println(item);
		}

		list2.clone();
		System.out.println("=====");
		// enhanced-for
		System.out.println("=====");
		for (Integer item : list2) {
			System.out.println(item);
		}
		System.out.println("=====");
		for (String item : strArr1) {
			System.out.println(item);
		}
		System.out.println("=====");
		if (list1.add("7번")) {
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
