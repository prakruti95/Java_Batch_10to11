import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class AllOperations extends JFrame
{
	JFrame insertframe;
	JTextField tf1,tf2;
	JButton btn;
	
	public void insertdata()
	{
		insertframe = new JFrame();
		
		tf1 = new JTextField(20);
		tf2 = new JTextField(20);
		btn = new JButton("INSERT");
		
		
		
		insertframe.add(tf1);
		insertframe.add(tf2);
		insertframe.add(btn);
		insertframe.setSize(500,500);
		insertframe.setLayout(new FlowLayout());
		insertframe.setVisible(true);
		
		//setSize(500,500);
	}
}
