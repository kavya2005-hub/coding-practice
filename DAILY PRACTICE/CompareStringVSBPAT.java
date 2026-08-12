import java.util.*;
public class CompareStringVSBPAT
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String a=sc.nextLine();
        String b=sc.nextLine();
        LinkedHashSet<Character>set=new LinkedHashSet<>();
        for(int i=0;i<a.length();i++)
        {
           set.add(a.charAt(i));
        }
        for(int i=0;i<b.length();i++)
        {
            set.remove(b.charAt(i));
        }
           
        String ans="";
        for(char c:set)
        {
            ans+=c;
        }
        System.out.println(ans);
    }
}