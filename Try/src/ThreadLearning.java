import java.lang.*;

class FirstThread extends Thread
{
	public void run()
	{
		for( int i=1;i<=10;i++) 
		{
			System.out.println(i);
			try
			{
				Thread.sleep(1000);
			}
			catch(Exception e)
			{
				
			}
			
		}
	}
}
public class ThreadLearning
{

	public static void main(String[] args) 
	{
		FirstThread f = new FirstThread();
		FirstThread f1 = new FirstThread();
		Thread t1 = new Thread(f);
		Thread t2 = new Thread(f1);
		t1.start();
		t1.setPriority(10);
		t2.setPriority(1);
	//	System.out.println(t1.getName() + "" + t1.getPriority() + "" + t1.getId());
		//System.out.println(t2.getName() + "" + t2.getPriority() + "" + t2.getId());
		try
		{
			t1.join();
		}
		catch(Exception e) 
		{
			
		}
		//t2.stop();
		//t2.isAlive();
		t2.start();
		
		t2.suspend();
		t2.resume();
		System.out.println(t1.getName() + "" + t1.getPriority() + "" + t1.getId());
		System.out.println(t2.getName() + "" + t2.getPriority() + "" + t2.getId());
		
		
		

	}

}
