import java.util.Scanner;

public class Greatest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			Scanner sc=new Scanner(System.in);
			System.out.println("enter the first num:");
			int first=sc.nextInt();
			System.out.println("enter the second num:");
			int second=sc.nextInt();
			
			if(first > second)
			{
				System.out.println(first+"is greater than"+second);
				
			}
			else if(second > first)
			{
			
				System.out.println(second+"is greater than"+first);
			}
			else
			{
				System.out.println("both num are equal");
			}
	}

}
