import java.util.Scanner;

public class TwoFighterVSBPAT {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int p=sc.nextInt();
        int c=sc.nextInt();
        String s=sc.next();
        int ans=0;
        for(int i=0;i<s.length();i++)
        {
            int count=0;
            for(int j=i;j<s.length();j++)
            {
                if (s.charAt(j) == Character.forDigit(c, 10))
                {
                    count++;
                }
                if(count ==p)
                {
                    ans++;
                }
            }
        }
        System.out.println(ans);
    }
    
}
