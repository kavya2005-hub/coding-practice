import java.util.Scanner;

public class TrappingWaterVSBPAT {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int left[]=new int[n];
        int rigth[]=new int[n];
        left[0]=arr[0];
        for(int i=1;i<n;i++)
        {
            left[i]=Math.max(left[i-1],arr[i]);

        }
        rigth[n-1]=arr[n-1];
        for(int i=n-2;i>=0;i--)
        {
            rigth[i]=Math.max(rigth[i+1],arr[i]);

        }
        int water=0;
        for(int i=0;i<n;i++)
        {
            water+=Math.min(left[i],rigth[i])-arr[i];
        }
        System.out.println(water);


    }
    
}
