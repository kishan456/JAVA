class main4
{
public static void main(String args[]) {
int c=0,d=0;
int a[]=new int[]{2,20,34,12,67};
int smallest=a[0];
int largest=a[0];
for(int i=0;i<a.length;i++){
if(a[i]<smallest && d<2){
smallest=a[i];
d++;
System.out.println("smallest:"+smallest);
}

if(a[i]>largest && c<2){
largest=a[i];
c++;
System.out.println("largest: "+largest); }}
}}
