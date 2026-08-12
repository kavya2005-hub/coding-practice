import java.util.*;
public class TwoSumVSBPAT
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int target=sc.nextInt();
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<n;i++)
        {
            int c=target-arr[i];
            if(map.containsKey(c))
            {
                System.out.print("["+map.get(c)+","+i+"]");
                return;
            }
            
                
            
            map.put(arr[i],i);
        }
        System.out.println("No solution");
    }
}