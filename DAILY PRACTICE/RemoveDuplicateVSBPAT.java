import java.util.HashSet;
import java.util.Scanner;

public class RemoveDuplicateVSBPAT {
    public static void main(String args[])
    {
        Scanner sc=new Scanner (System.in);
        String s=sc.nextLine();
        HashSet<Character>set=new HashSet<>();
        for(int i=0;i<s.length();i++)
        {
            set.add(s.charAt(i));
        }
        for(char c:set)
        {
            
            System.out.print(c);
        }
    }
}
