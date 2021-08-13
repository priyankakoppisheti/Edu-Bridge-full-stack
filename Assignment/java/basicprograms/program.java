package multithreading;
class odd extends Thread
{
	public void run()
	{
		int n=10;
		
		for(int i=1;i<=n;i++)
		{
			if(i%2!=0)
			{
				System.out.println(i+"");
			}
			try {
				Thread.sleep(1000);
			}catch(Exception e)
				{
				System.out.println(e);
				}
		}
	}
}
class even extends Thread
{
	public void run()
	{
		int n=10;
		
		for(int i=1;i<=n;i++)
		{
			if(i%2==0)
			{
				System.out.println(i+"");
			}
			try {
			Thread.sleep(1500);
		}catch(Exception e)
			{
			System.out.println(e);
			}
	}
}
}


public class program {

	public static void main(String[] args) {
		odd ob = new odd();
		ob.run();
		even e1 = new even();
		e1.run();
	}
}
	



