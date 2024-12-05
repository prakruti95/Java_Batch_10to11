package tops512;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class FrameIoEx 
{
	JFrame frame;
	JTextField tf1,tf2,tf3;
	JPasswordField tf4;
	JLabel l1,l2,l3,l4;
	JButton btn,btn2;
	public FrameIoEx() 
	{
		frame = new JFrame();
		
		l1 = new JLabel("Firstname: ");
		l1.setBounds(10, 22, 80, 14);
		
		l2 = new JLabel("Lastname: ");
		l2.setBounds(10, 62, 80, 14);
		
		l3 = new JLabel("Email: ");
		l3.setBounds(10, 102, 80, 14);
		
		l4 = new JLabel("Password: ");
		l4.setBounds(10, 142, 80, 14);
		
		tf1 = new JTextField();
		tf1.setBounds(160, 22, 120, 20);
		
		tf2 = new JTextField();
		tf2.setBounds(160, 62, 120, 20);
		
		tf3 = new JTextField();
		tf3.setBounds(160, 102, 120, 20);
		
		tf4 = new JPasswordField();
		tf4.setBounds(160, 142, 120, 20);
		
		btn = new JButton("Submit");
		btn.setBounds(142, 190, 89, 23);
		
		btn2 = new JButton("View Data");
		btn2.setBounds(142, 230, 89, 23);
		
		btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				String nm = tf1.getText().toString();
				String lnm = tf2.getText().toString();
				String em = tf3.getText().toString();
				String ps = tf4.getPassword().toString();
				
				try 
				{
					FileOutputStream fout = new FileOutputStream("E://tops.txt");
					
					String a = "\n Your Name: ";
					fout.write(a.getBytes());
					fout.write(nm.getBytes());
					
					String b = "\n Your Lastname : ";
					fout.write(b.getBytes());
					fout.write(lnm.getBytes());
					
					String c = "\n Your Email : ";
					fout.write(c.getBytes());
					fout.write(em.getBytes());
					
					String d = "\n Your Password : ";
					fout.write(d.getBytes());
					fout.write(ps.getBytes());
					
				}
				catch (Exception e1)
				{
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				System.out.println("success");
				
				
			}
		});
		
		btn2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
			
				try 
				{
					FileInputStream fin = new FileInputStream("E://tops.txt");
					int i=0;
					while((i=fin.read())!=-1)
					{
						System.out.print((char)i);
					}
					
					//fin.read();
					
				}
				catch (Exception e1)
				{
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			}
		});
		
		
		frame.add(l1);
		frame.add(l2);
		frame.add(l3);
		frame.add(l4);
		frame.add(tf1);
		frame.add(tf2);
		frame.add(tf3);
		frame.add(tf4);
		frame.add(btn);
		frame.add(btn2);
		frame.setSize(500,500);
		frame.setLayout(null);
		frame.setVisible(true);
	}
	
	public static void main(String[] args) 
	{
		new FrameIoEx();
	}
}
