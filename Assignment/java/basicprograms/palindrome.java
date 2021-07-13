import java.util.*;
public class palindrome
{
public static void main(String[] args)
{
int n,a,reverse=0,lastdigit;
Scanner in=new Scanner(System.in);
System.out.println("enter the value");
n=in.nextInt();
a=n;
while(n>0)
{
lastdigit = n%10;
reverse = reverse * 10 + lastdigit;
n= n/10;
}
if(reverse==a)
{
System.out.println("palindrome");
}
else
{
System.out.println("not palindrome");
}}
}
