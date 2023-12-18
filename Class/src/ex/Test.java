package ex;

import javax.swing.JFrame;

public class Test extends JFrame{

	Test() {
		setTitle("도서관리 프로그램 v.1.0");
		setSize(300, 100);
		setVisible(true);
	}
	public static void main(String[] args) {
		new Test();
	}
}
