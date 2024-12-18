import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MyFrameEx implements ActionListener
{
	JFrame frame;
	JButton btninsert,btnview,btnupdate,btndelete;
	
	public MyFrameEx() 
	{
		
		frame = new JFrame();
		
		btninsert =  new JButton("INSERT");
		btnview =  new JButton("VIEW");
		btnupdate =  new JButton("UPDATE");
		btndelete =  new JButton("DELETE");
		
		btninsert.addActionListener(this);
		
		
		frame.add(btninsert);
		frame.add(btnview);
		frame.add(btnupdate);
		frame.add(btndelete);
		frame.setSize(500,500);
		frame.setLayout(new FlowLayout());
		frame.setVisible(true);
		
	}
	public static void main(String[] args) 
	{
		new MyFrameEx();
	}
	@Override
	public void actionPerformed(ActionEvent e) 
	{
		// TODO Auto-generated method stub
		AllOperations a = new AllOperations();
		if(e.getSource()==btninsert)
		{
			a.insertdata();
		}
	}
}
