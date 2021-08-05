import java.util.*;
class prime
{
public static void main(String[] args)
{
int a=10,b=99;
while(a<b)
{
boolean flag=false;
for(int i=2;i<=a/2;i++)
{
if(i%2==0)
{
flag=true;
break;
}
}
if(!flag && a!=0 && a!=1);
System.out.print(a+" ");
++a;
}
}
}
