package tops1112;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class OptionPaneEx extends WindowAdapter implements ActionListener
{
	JFrame frame;
	JButton btn,btn2;
	
	public OptionPaneEx() 
	{
		frame = new JFrame();
		
		btn = new JButton("Message Dialog");
		btn2 = new JButton("Input Dialog");
		//btn3 = new JButton("Confirm Dialog");
		
		btn.addActionListener(this);
		btn2.addActionListener(this);
		//btn3.addActionListener(this);
		frame.addWindowListener(this);
		frame.add(btn);
		frame.add(btn2);
		//frame.add(btn3);
		frame.setSize(500,500);
		frame.setLayout(new FlowLayout());
		frame.setVisible(true);
		
	}
	public static void main(String[] args) 
	{
		new OptionPaneEx();
	}
	@Override
	public void actionPerformed(ActionEvent e) 
	{
		// TODO Auto-generated method stub
		if(e.getSource()==btn)
		{
			JOptionPane.showMessageDialog(frame, "TEst Message");
		}
		if(e.getSource()==btn2)
		{
			String name = JOptionPane.showInputDialog(frame,"Enter Your Name");
			System.out.println("Welcome "+name);
		}
		
	}
	@Override
	public void windowClosing(WindowEvent e) 
	{
		frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);

		// TODO Auto-generated method stub
		//super.windowClosing(e);
		
		int a = JOptionPane.showConfirmDialog(frame,"Are you sure you want to exit?");
		
		if(a==JOptionPane.YES_OPTION)
		{
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		}
		if(a==JOptionPane.NO_OPTION)
		{
			System.out.println("a");
		}
		
	}
}
