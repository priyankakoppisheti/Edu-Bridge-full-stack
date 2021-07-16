import java.util.*;
class reverse
{
public static void main(String s[])
{
int n,rev=0,lastdigit;
Scanner sc= new Scanner(System.in);
System.out.println("enter any number");
n=sc.nextInt();
while(n>=0)
{
lastdigit=n%10;
rev=rev*10+lastdigit;
n=n/10;
}
System.out.println("the reverse of num"+rev);
}
}
