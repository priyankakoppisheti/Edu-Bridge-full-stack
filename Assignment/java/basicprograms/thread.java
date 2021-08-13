package multithreading;

public class thread
{

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Runnable r=new Runnable()
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
		};
		Runnable r1=new Runnable()
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
		};
		
		Thread t=new Thread(r);
		t.start();
		System.out.println(t.getName());
		
		
		try {
			Thread.sleep(200);
		}
		catch(Exception e)
		{
			System.out.print(e);
		}
		Thread t1=new Thread(r1);
		t1.start();
		t1.interrupt();
	
		System.out.println("join is here");
	}

}

