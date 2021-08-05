import java.util.*;
class Pattern
{
public static void main(String[] args)
{
int n,i,j;
Scanner sc=new Scanner(System.in);
System.out.println("enter number:");
n=sc.nextInt();
for(i=0;i<n;i++)
{
for(j=0;j<i;j++)
{
System.out.print("* ");
}
System.out.println();
}
}
}
