package Cal;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

import javafx.scene.layout.Border;
import sun.net.www.content.image.jpeg;

public class Calculation extends JFrame{
	
	Calculation(){
		setTitle("계산기");
		setSize(250, 300);
		setDefaultCloseOperation(3);
		setVisible(true);
		
		setLayout(new BorderLayout());
		setNorth();
		setBotton();
		
		
	}
	private void setBotton() {
		
		
		JPanel p = new JPanel(new GridLayout(4, 2));
		JPanel p1 = new JPanel(new GridLayout(0, 4));
		JPanel p2 = new JPanel(new GridLayout(0, 4));
		JPanel p3 = new JPanel(new GridLayout(0, 4));
		JPanel p4 = new JPanel(new GridLayout(0, 4));
		
		p1.add(new JButton("7"));
		p1.add(new JButton("8"));
		p1.add(new JButton("9"));
		p1.add(new JButton("+"));
		p2.add(new JButton("4"));
		p2.add(new JButton("5"));
		p2.add(new JButton("6"));
		p2.add(new JButton("-"));
		p3.add(new JButton("1"));
		p3.add(new JButton("2"));
		p3.add(new JButton("3"));
		p3.add(new JButton("X"));
		p4.add(new JButton("0"));
		p4.add(new JButton("."));
		p4.add(new JButton("="));
		p4.add(new JButton("+"));
		
		p.add(p1);
		p.add(p2);
		p.add(p3);
		p.add(p4, BorderLayout.CENTER);

		
		add(p, BorderLayout.SOUTH);
		
		
		
		
		
	}
	
	private void setNorth() {
		JPanel p = new JPanel(new GridLayout(2, 0));
		JPanel p1 = new JPanel();
		JPanel p2 = new JPanel();
		
		p1.add(new JTextField(30));
		p2.add(new JButton("on"));
		p2.add(new JButton("off"));
		p.add(p1);
		p.add(p2);
		add(p, BorderLayout.NORTH);
		
	}
	public static void main(String[] area) {
		new Calculation();	
		
	}

}
