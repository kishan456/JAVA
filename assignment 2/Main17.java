import java.util.Scanner;
class Main17
{
    public static void main(String args[]) 
    {
        int n;
        Scanner c = new Scanner(System.in);
        n=c.nextInt();
        int r,sum=0,t;
        t=n;
        while(n>0)
        {
            r=n%10;
            sum=sum*10+r;
            n=n/10;
        }
        if(t==sum)
            System.out.println("Palindrome");
        else
            System.out.println("Not a Palindrome");
    }
}
