import java.util.*;
class Rev
{
public static void main(String[] args)
{
int n,r=0;
Scanner sc=new Scanner(System.in);
System.out.println("enter number:");
n=sc.nextInt();
while(n>0)
{
r=r*10;
r=r+n%10;
n=n/10;
}
System.out.println("Reverse="+r);
}
}
