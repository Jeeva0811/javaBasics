public class Sum_2element
{
public static void main(String args[])
{
int a[]={7,3,4,1,6,9};
for(int i=0;i<a.length;i=i+1)
{
for(int j=i+1;j<a.length;j=j+1)
{
if(a[i]+a[j]==10)
{
System.out.println(a[i]+"  "+a[j]);
}
}
}
}
}
