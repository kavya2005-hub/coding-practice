import java.util.ArrayList;
import java.util.Scanner;

public class ArrayRotation {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int k=sc.nextInt();
        k=k%n;
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            list.add(arr[i]);
        }
        for(int i=0;i<k;i++)
        {
           int first= list.remove(0);
            list.add(first);
        }
        for(int x:list)
        {
        System.out.print(x+" ");
        }


    }
    
}
