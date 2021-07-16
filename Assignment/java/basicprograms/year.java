import java.util.Scanner;
class year
{
public static void main(String s[])
{
Scanner sc=new Scanner(System.in);
System.out.println("enter the year");
int year=sc.nextInt();
if(((year%4==0) && (year % 100!=0))||(year %400==0))
{
System.out.println("the given is leap year");
}
else
{
System.out.println("the given year is not a leap year");
}
}
}