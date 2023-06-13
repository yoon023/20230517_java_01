package kh.lclass.swing;

import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class NullContainerEx extends JFrame {
	public NullContainerEx() {
		setTitle("Null Container Sample");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(null);
		
		JLabel la = new JLabel("Hello, Press Buttons!");
		la.setLocation(0,70); // 왼쪽부터 좌우? ,아래
		la.setSize(600,40); //글자크기?
		c.add(la);
		
		for(int i =1; i<=9; i++) {
			JButton b = new JButton(Integer.toString(i));
			b.setLocation(i*20,i*15); //겹치는위치 
			b.setSize(70,20); //가로,세로
			c.add(b);
		}
		setSize(500,200); //창가로세로크기
		setVisible(true);
		
	}
	public static void main(String[] args) {
		new NullContainerEx();
	}
}
