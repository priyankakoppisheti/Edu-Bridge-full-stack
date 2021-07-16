import java.util.*;
class eve
{
void num()
{
Scanner sc=new Scanner(System.in);
System.out.println("enter the number");
int x=sc.nextInt();
if(x%2==0)
System.out.print("its is even");
}
public static void main(String s[])
{
eve e=new eve();
e.num();
}
}