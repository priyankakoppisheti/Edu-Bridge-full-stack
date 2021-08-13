package multithreading;
class A{
	int count=0;
	public void counter() {
		count++;
	}
}

public class count1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a=new A();
		a.counter();
		a.counter();
		a.counter();
		a.counter();
		a.counter();
		
System.out.println("");
	}

}
