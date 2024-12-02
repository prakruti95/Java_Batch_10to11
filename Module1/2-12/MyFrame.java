package tops212;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MyFrame 
{
	JFrame frame;
	JButton btn,btn2;
	
	public MyFrame() 
	{
		frame = new JFrame();
		
		btn = new JButton("submit");
		btn.setBounds(10, 11, 150, 50);
		
		btn2 = new JButton("submit2");
		btn2.setBounds(160, 11, 150, 50);
		
		frame.add(btn);
		frame.add(btn2);
		
		frame.setSize(500,500);
		frame.setLayout(null);
		frame.setVisible(true);
	}
	
	public static void main(String[] args)
	{
		new MyFrame();
		
	}
}
