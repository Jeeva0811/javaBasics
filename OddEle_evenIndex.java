public class OddEle_evenIndex
{
public static void main(String args[])
{
int a[]={7,3,6,10,5,1,9};
for(int i=2;i<a.length;i=i+2)
{
if(a[i]%2!=0)
{
System.out.println(a[i]);
}
}
}
}

