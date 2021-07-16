import java.util.*;
class exe
{
public static void main(String s[])
{
Scanner sc = new Scanner (System.in);
System.out.println("enter the first value");
int x=sc.nextInt();
System.out.println("enter the second value");
int y=sc.nextInt();
System.out.println("enter the third value");
int z=sc.nextInt();
if(x < y && y < z)
{
System.out.println("ascending order");
}
else if(x > y && y > z)
{
System.out.println("decending order");
}
else{
System.out.println("neither ascending nor decending");
}
}
}