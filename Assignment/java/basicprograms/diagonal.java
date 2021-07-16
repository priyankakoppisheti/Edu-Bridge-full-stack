import java.util.*;
class diagonal
{
public static void main(String s[])
{
Scanner sc=new Scanner(System.in);
int i,j,row,col,sum=0;
System.out.println("enter the no. of rows:");
row=sc.nextInt();
System.out.println("enter the no. of columns:");
col=sc.nextInt();
int a[][]=new int[row][col];
System.out.println("enter the elementsof the matrix");
for(i=0;i<row;i++)
{
for(j=0;j<col;j++)
{
a[i][j]=sc.nextInt();
}
}
System.out.println("the elementsof the matrix");
for(i=0;i<row;i++)
{
for(j=0;j<col;j++)
{
System.out.println(a[i][j]+"\t");
}
System.out.println("");
}
for(i=0;i<row;i++)
{
for(j=0;j<col;j++)
{
if(i==j)
{
sum=sum+a[i][j];
}
}
}
System.out.println("sum of diagonal="+sum);
}
}