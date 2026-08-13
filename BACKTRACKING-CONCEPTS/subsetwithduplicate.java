import java.util.*;
public class subsetwithduplicate
{
    static void subset(int[]arr,int index,List<Integer>list)
    {
        if(index==arr.length)
        {
            System.out.println(list);
            return;
        }
        list.add(arr[index]);
        subset(arr,index+1,list);
        list.remove(list.size()-1);
        subset(arr,index+1,list);
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
        subset(arr,0,new ArrayList<>());
    }
}