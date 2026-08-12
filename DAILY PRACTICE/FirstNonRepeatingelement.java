import java.util.HashMap;
import java.util.Scanner;

public class FirstNonRepeatingelement {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        HashMap<Character,Integer>map=new HashMap<>();
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);

        }
        boolean found=false;
        for(int i=0;i<s.length();i++)
        {
            if(map.get(s.charAt(i))==1)
            {
                System.out.println(s.charAt(i));
                found=true;
                break;
               
            }
            
           
        }
         if(!found)
            {
                System.out.println(-1);
            }
    }
    
}
