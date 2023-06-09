package kh.lclass.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import kh.lclass.oop.sample.Car;

public class Test {

	public void testHashMap() {
		Map<String, Object> objMap = new HashMap<String, Object>();
		objMap.put("ys", new Car(3000));
		objMap.put("am", "amne");
		System.out.println(objMap.toString());
	}
	
	ArrayList<String> list1 = new ArrayList<String>();
	ArrayList<Integer> list2 =new ArrayList<Integer>();
}
