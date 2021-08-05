import java.util.*; 
public class main2 {
public static void main(String[] args)
{
int n,i,a1;
Scanner sc=new Scanner(System.in);
System.out.print("Enter no.of elements:");
n=sc.nextInt();
int[] a = new int[n];
System.out.print("Enter elements:");
for(i=0;i<n;i++)
{
a[i]=sc.nextInt();
}
System.out.print("Enter element to find:");
a1=sc.nextInt();
for(i=0;i<n;i++)
{
if(a1 == a[i] )
{
System.out.print(" "+i);
i++;
break;
}
else{
System.out.print("-1");
}}}
}
