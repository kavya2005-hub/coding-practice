import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class subsetwithoutduplicate {
    static void subset(int[]arr,int index,List<Integer>list)
    {
            System.out.println(list);
            for(int i=index;i<arr.length;i++)
            {
                if(i>index && arr[i]==arr[i-1])
                {
                    continue;
                }
            
        
        list.add(arr[i]);
        subset(arr,i+1,list);
        list.remove(list.size()-1);
      
            }
    }
     public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[]arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        subset(arr,0,new ArrayList<>());
       
    }


    
}
