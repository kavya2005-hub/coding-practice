import java.util.LinkedHashSet;
import java.util.Scanner;

public class RemoveDuplicate {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        LinkedHashSet<Character> set=new LinkedHashSet<>();
        for(int i=0;i<s.length();i++)
        {
            set.add(s.charAt(i));


        }
        for(char x:set)
        {
            System.out.print(x);
        }

    }
    
}
