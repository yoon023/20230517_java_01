package kh.lclass.oop.sample;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class TestPolymophism {
	int age = 3;
	int grade = 3;
	
	public static void main(String[] args) {
		//오류 new TestInterface();
	
		List<Car> carList = new ArrayList<Car>(); //가장많이 쓰여짐 
		List<Car> carList2 = new LinkedList<Car>(); //가장많이 쓰여짐 
		ArrayList<Car> carArrList = new ArrayList<Car>();
		Collection<Car> carCollection = new ArrayList<Car>();
		//carArrList. 굳이 어레이리스트 기능쓸 것이 아니면 리스트형태
		
		TestInterface kh = new Kh() {};
		Kh kh2 = new Kh();
		((Kh)kh).khSpecial();
		
		
		TestInterface bit;
		TestInterface bit2;
		Kh kh21 = new Kh();
		//kh21.khSpecial();
		kh21.method1();
		
		Driver ej = new DriverSub();
		ej.setMoney(10000);
		ej.buy(new Sonata());
		ej.buy(new Avante());
		Driver jh = new Driver2Sub();
		jh.setMoney(10000);
		jh.buy(new Sonata());
		jh.buy(new Avante());
	}
}
