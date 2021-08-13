package multithreading;
class data1
{
	int n;
	public void put(int n)
	{
		System.out.println("put"+n);
		this.n=n;
	}
	public void get()
	{
		System.out.println("get"+n);
	}
}
class p implements Runnable
{
	data1 a;
	public p(data1 a)
	{
		this.a=a;
	Thread t=new Thread(this,"producer");
			t.start();
	}
	public void run()
	{
		int i=0;
		while(true)
		{
			a.put(i++);
			try
			{
				Thread.sleep(1000);
			}
			catch(Exception e)
			{
				System.out.print(e);
			}
		}
	}
}
class c implements Runnable
{
	data1 a;
	public c(data1 a)
	{
		this.a=a;
		Thread t=new Thread(this,"consumer");
		t.start();
		
	}
	public void run()
	{
		while(true)
		{
			a.get();
			try {
				Thread.sleep(1000);
			}catch(Exception e)
			{
				System.out.print(e);
			}
		}
	}
}
public class Inter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
data1 a=new data1
();
new p(a);
new c(a);
	}

}
