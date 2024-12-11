package tops1112;

import java.awt.Menu;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JTextArea;

public class MenuEx implements ActionListener
{
	JFrame frame;
	JMenuBar mb;
	JMenu File,Edit,Help;
	JMenuItem i1,i2,i3,i4;
	JTextArea ta;
	
	
	public MenuEx() 
	{
		frame = new JFrame();
		
		mb = new JMenuBar();
		
		File = new JMenu("File");
		Edit = new JMenu("Edit");
		Help = new JMenu("Help");
		
		i1 = new JMenuItem("cut");
		i2 = new JMenuItem("copy");
		i3 = new JMenuItem("paste");
		i4 = new JMenuItem("selectall");
		
		ta = new JTextArea();
		
		Edit.add(i1);
		Edit.add(i2);
		Edit.add(i3);
		Edit.add(i4);
		
		mb.add(File);
		mb.add(Edit);
		mb.add(Help);
		
		frame.setJMenuBar(mb);
		frame.add(ta);
		frame.setSize(500,500);
		//frame.setLayout(null);
		frame.setVisible(true);
		
		i1.addActionListener(this);
		i2.addActionListener(this);
		i3.addActionListener(this);
		i4.addActionListener(this);
	}
	
	public static void main(String[] args) 
	{
		new MenuEx();
	}

	@Override
	public void actionPerformed(ActionEvent e) 
	{
		// TODO Auto-generated method stub
		if(e.getSource()==i1)
		{
			ta.cut();
		}
		if(e.getSource()==i2)
		{
			ta.copy();
		}
		if(e.getSource()==i3)
		{
			ta.paste();
		}
		if(e.getSource()==i4)
		{
			ta.selectAll();
		}
	}
}
