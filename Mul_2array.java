public class Mul_2array
{
public static void main(String args[])
{
int a[]={7,3,1,6,4};
int b[]={3,7,9,4,6};
int c[]=new int[a.length];
for(int i=0;i<a.length;i++)
{
c[i]=a[i]*b[i];
System.out.print(c[i]+" ");
}
System.out.println();
}
}
