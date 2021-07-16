import java.util.*;
class student
{
public static void main(String s[])
{
Scanner sc=new Scanner(System.in);
System.out.print("enter the marks:");
int marks=sc.nextInt();
if(marks>=45)
{
System.out.println("congrats, your passed");
}
else
{
System.out.println("oops,your fail");
}
}
}