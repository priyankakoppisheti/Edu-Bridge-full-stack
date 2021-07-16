import java.util.*;
class vote
{
public static void main(String s[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the person's age");
int age=sc.nextInt();
if(age>=18)
{
System.out.println("the person is eligible to vote");
}
else
{
System.out.println("the person is not eligible to vote");
}
}
}
