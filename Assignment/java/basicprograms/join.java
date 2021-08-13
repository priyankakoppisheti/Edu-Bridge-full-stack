package multithreading;

public class join {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		Runnable r=new Runnable()
		{
			public void run() 
			{
				for(int i=1;i<=5;i++)
				{
					System.out.println("java");
					try {
						Thread.sleep(500);
						
					}
					catch(Exception e)
					{
						System.out.print(e);
					}
				}
			}
		};
		Runnable r1=new Runnable()
		{
			public void run() {
				for(int i=1;i<=5;i++)
				{
					System.out.println("junit");
					try {
						Thread.sleep(500);
					}
					catch(Exception e)
					{
						System.out.print(e);
					}
				}
			}
		};
		Thread t=new Thread();
		t.start();
		try {
			Thread.sleep(200);
		}
		catch(Exception e)
		{
			System.out.print(e);
		}
		Thread t1=new Thread();
		t1.start();
		t.join();
		t1.join();
		System.out.println("Thread execution completed");
			}
	}


