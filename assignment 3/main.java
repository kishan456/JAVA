import java.util.*;
class main
{
public static void main(String args[]) 
{
int n,sum=0;
float avg;
Scanner sc = new Scanner(System.in);
System.out.println("Enter no.of elements:");
n=sc.nextInt();
int a[]=new int[n];
System.out.println("Enter elements:");
for(int i=0;i<n;i++)
{
a[i]=sc.nextInt();
sum=sum + a[i];
}
System.out.println("sum:"+sum);
avg=(float)sum / n;
System.out.println("average:"+avg);
}
}
