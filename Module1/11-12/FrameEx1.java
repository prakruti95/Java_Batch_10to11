package tops1112;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.event.AncestorEvent;
import javax.swing.event.AncestorListener;

public class FrameEx1 implements ActionListener
{
	JFrame frame;
	JButton btn,btn2,btn3,btn4;
	JPanel jp,jp2;
	JLabel l1,l2;
	
	public FrameEx1() 
	{
		frame = new JFrame();
		
		btn = new JButton("Test1");
		btn2 = new JButton("Test2");
	
		jp = new JPanel();
		jp2 = new JPanel();
		
		btn3 = new JButton("one");
		btn4 = new JButton("Two");
		
		btn.addActionListener(this);
		btn2.addActionListener(this);
		btn3.addActionListener(this);
		
		jp.add(btn3);
		jp2.add(btn4);
		jp.setVisible(false);
		jp2.setVisible(false);
		
		
		frame.add(btn);
		frame.add(btn2);
		frame.add(jp);
		frame.add(jp2);
		
		frame.setSize(500,500);
		frame.setLayout(new FlowLayout());
		frame.setVisible(true);
		
	}
	public static void main(String[] args) 
	{
		new FrameEx1();
	}
	@Override
	public void actionPerformed(ActionEvent e) 
	{
		// TODO Auto-generated method stub
		if(e.getSource()==btn)
		{
			new MenuEx();
		}
		if(e.getSource()==btn2)
		{
			jp.setVisible(true);
		}
		if(e.getSource()==btn3)
		{
			jp.setVisible(false);
			jp2.setVisible(true);
		}
	}
	
	}
