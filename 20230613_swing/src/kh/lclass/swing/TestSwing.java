package kh.lclass.swing;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.Action;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class TestSwing extends JFrame {
	private JLabel la = new JLabel("Keio Uni");
	private JLabel la2 = new JLabel();
	

	public TestSwing() {
		Container c = getContentPane();
		c.addMouseListener(new MyMouseListener());

		c.setLayout(null);
		la.setSize(50, 20);
		la.setLocation(30, 30);
		c.add(la);
		
		Container c2 = getContentPane();
		c2.addKeyListener(new MyKeyListener());
		c2.add(la2);
		c2.setFocusable(true);
		c2.requestFocus();
		
		setTitle("Hello Window 프레임");
		setDefaultCloseOperation(EXIT_ON_CLOSE); // X 버튼 눌러서 resource 정리하고 창 닫기

		Container contentPane = getContentPane();
//		contentPane.setLayout(new FlowLayout(FlowLayout.RIGHT, 5 ,5));
//		contentPane.setLayout(new BorderLayout(20,30));
//		contentPane.add(new JButton("OK"),BorderLayout.NORTH);
//		contentPane.add(new JButton("Cancel"),BorderLayout.WEST);
//		contentPane.add(new JButton("Ignore"),BorderLayout.EAST);
//		contentPane.add(new JButton("Center"),BorderLayout.CENTER);

		// 컴포넌트 생성
		JTextField txtName = new JTextField();
		JTextField txtNo = new JTextField();
		JTextField txtMajor = new JTextField();
		JTextField txtSubject = new JTextField();
		JButton btnSave = new JButton("저장");
		// event 등록 = Action 리스너 달기
		btnSave.addActionListener(new MyActionListener());
		txtName.addActionListener(new MyActionListener());

		// 컴포넌트를 컨텐츠
		contentPane.setLayout(new GridLayout(7, 3, 10, 10));
		contentPane.add(new JLabel("이름"));
//		contentPane.add(new JTextField());
		contentPane.add(txtName);
		contentPane.add(new JLabel("학번"));
		contentPane.add(txtNo);
		contentPane.add(new JLabel("학과"));
		contentPane.add(txtMajor);
		contentPane.add(new JLabel("과목"));
		contentPane.add(txtSubject);
		contentPane.add(btnSave);

		setSize(500, 500); //300,300
		setVisible(true);

	}

	public static void main(String[] args) {
		TestSwing frame = new TestSwing();
//		new MouseListenerEx();
	}

	class MyActionListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			System.out.println("이건 언제 호출되지???");
			System.out.println(e);

			Object source = e.getSource();
			if (source instanceof JButton) {
				System.out.println("button 눌렀네요");
				if (((JButton) source).getText().equals("저장")) {
					((JButton) source).setText("Save");
				} else {
					((JButton) source).setText("저장");
				}
			} else if (source instanceof JTextField) {
				System.out.println("text 필드에서 enter key를 눌렀네요.");
			}
		}

		

	}
	class MyMouseListener implements MouseListener {

		@Override
		public void mousePressed(MouseEvent e) {
			int x = e.getX();
			int y = e.getY();
			la.setLocation(x, y);
		}

		@Override
		public void mouseClicked(MouseEvent e) {

		}

		@Override
		public void mouseReleased(MouseEvent e) {

		}

		@Override
		public void mouseEntered(MouseEvent e) {

		}

		@Override
		public void mouseExited(MouseEvent e) {

		}
	}
	
	class MyKeyListener extends KeyAdapter{
		public void keyPressed(KeyEvent e) {
			la2.setText(e.getKeyText(e.getKeyCode()));
			if(e.getKeyCode()== KeyEvent.VK_F2)
				getContentPane().setBackground(Color.BLUE);
			else if(e.getKeyCode()== KeyEvent.VK_F1)
				getContentPane().setBackground(Color.RED);
		}
	}
	
}
