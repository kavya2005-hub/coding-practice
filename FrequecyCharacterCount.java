import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Scanner;

public class FrequecyCharacterCount {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        LinkedHashMap<Character,Integer>map=new LinkedHashMap<>();
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        for(Entry<Character, Integer> entry:map.entrySet())
        {
            System.out.println(entry.getKey()+" "+entry.getValue());
        }
    }

    
}
