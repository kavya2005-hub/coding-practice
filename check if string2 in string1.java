import java.util.*;
class stringcontains
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
String s1=sc.nextLine();
String s2=sc.nextLine();
String[] a=s1.split(" ");
String[] b=s2.split(" ");
for(int i=0;i<a.length;i++)
{
for(int j=0;j<b.length;j++)
{
if(a[i].equals(b[j]))
{
System.out.print(a[i]+" ");
}
}
}
}
}
