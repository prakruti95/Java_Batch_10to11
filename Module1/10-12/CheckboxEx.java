package tops1012;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;

public class CheckboxEx implements ActionListener 
{
	JFrame frame;
	JCheckBox chk1,chk2;
	JRadioButton rb1,rb2;
	JComboBox<String>cb;
	String city[]= {"Rajkot","Baroda","Surat"};
	 public CheckboxEx() 
	 {
		 frame = new JFrame();
		 
		 chk1 = new JCheckBox("cricket");
		 chk2 = new JCheckBox("movies");
		 
		 rb1 = new JRadioButton("male");
		 rb2 = new JRadioButton("female");
		 
		 cb = new JComboBox<>(city);
		 
		 ButtonGroup bg = new ButtonGroup();
		 bg.add(rb1);
		 bg.add(rb2);
		 
		 frame.add(chk1);
		 frame.add(chk2);
		 frame.add(rb1);
		 frame.add(rb2);
		 frame.add(cb);
		 
		 frame.setSize(500,500);
		 frame.setLayout(new FlowLayout());
		 frame.setVisible(true);
		 
		 
		 //chk1.addItemListener(null);
		 chk1.addActionListener(this);
		 chk2.addActionListener(this);
		 rb1.addActionListener(this);
		 rb2.addActionListener(this);
		 
		 
	 }
	 
	 public static void main(String[] args) 
	 {
		 new CheckboxEx();
	 }

	@Override
	public void actionPerformed(ActionEvent e) 
	{
		if(e.getSource()==chk1)
		{
			if(chk1.isSelected())
			{
				JOptionPane.showMessageDialog(frame,"cricket clicked");

			}
			
		}
		if(e.getSource()==chk2)
		{
			JOptionPane.showMessageDialog(frame,"movies clicked");

		}
		if(e.getSource()==rb1)
		{
			JOptionPane.showMessageDialog(frame,"male clicked");

		}
		if(e.getSource()==rb2)
		{
			JOptionPane.showMessageDialog(frame,"female clicked");

		}
		
	}
}
