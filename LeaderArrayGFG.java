import java.util.*;
public class LeaderArrayGFG
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
        ArrayList<Integer>list=new ArrayList<>();
        int max=arr[arr.length-1];
        for(int i=arr.length-1;i>=0;i--)
        {
            if(arr[i]>=max)
            {
                max=arr[i];
                 list.add(max);
            
            }

        }
        Collections.reverse(list);
       
        System.out.println(list);
    }
}