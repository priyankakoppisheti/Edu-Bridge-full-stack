import java.util.*;
class kms
{
public static void main(String args[])
{
int product=1;
Scanner sc=new Scanner(System.in);
int km=sc.nextInt();
if(km>=32767)
{
System.out.println("input invalid");
}
else if(km<0)
{
System.out.println("input invalid");
}
else
{
while(km>0)
{
product=product*(km%10);
km=km/10;
}
System.out.println(product);
}
}
}
