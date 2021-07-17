import java.util.*;
class salaryTCS
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("enter the salary");
int salary=sc.nextInt();
System.out.println("enter the no. of shifts");
int shifts=sc.nextInt();
if(salary>8000)
{
System.out.println("salary is too large");
}
else if(shifts<0)
{
System.out.println("shifts too small");
}
else if(salary<0)
{
System.out.println("salary is too small");
}
else
{
double sal=salary*0.2+salary*0.3+salary*shifts*0.02;
System.out.println("salary="+sal);
}
}
}