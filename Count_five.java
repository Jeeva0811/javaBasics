public class Count_five
{
public static void main(String args[])
{
int a[]={5,12,3,6,5,9,5,15};
int count=0;
for(int i=0;i<a.length;i=i+1)
{
if(a[i]==5)
{
count=count+1;
}
}
System.out.println(count);
}
}
