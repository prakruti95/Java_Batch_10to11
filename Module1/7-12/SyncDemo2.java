package tops712;

class Sender1
{
	public void send(String msg)
	{
		
		System.out.println("Sending "+msg);
		
		try 
		{
			Thread.sleep(1000);
		}
		catch (InterruptedException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(msg+" Sent");
		
	}
}


class ThreadSend1 implements Runnable
{
	Sender1 sender;// Reference variable
	String msg;//variable
	
	public ThreadSend1(Sender1 sender,String msg) 
	{
	
		this.sender=sender;
		this.msg=msg;
	}

	@Override
	public void run() 
	{
		// TODO Auto-generated method stub
		synchronized (sender) 
		{
			sender.send(msg);
		}
	}
	

	
}


public class SyncDemo2 {

	public static void main(String[] args) {
		
		Sender1 sender = new Sender1();
		
		ThreadSend1 t1 = new ThreadSend1(sender,"Hii");
		ThreadSend1 t2 = new ThreadSend1(sender, "Byee");
		
//		t1.start();
//		t2.start();

		Thread t11 = new Thread(new ThreadSend1(sender,"hello"));
		Thread t12 = new Thread(new ThreadSend1(sender,"hiiii"));
		t11.start();
		t12.start();
		
	}

}
