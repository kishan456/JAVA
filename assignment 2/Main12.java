import java.util.*;
class Main12
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.print("Enter number: ");
int n=sc.nextInt();
int c=0;
sc.close();
for(int i=2;i<=n/2;i++)
{
if(n%i==0)
{
c++;
break;
}
}
if(c==0)
{
System.out.print("Prime number");
}
else
{
System.out.print("Not a prime number");
}
}
}
