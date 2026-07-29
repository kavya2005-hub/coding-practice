import java.util.Scanner;

public class HandshakeVSBPAT {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=10;
        int arr[][]=new int[m][m];
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<m;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }
            int ans=0;
            for(int i=0;i<m;i++)
            {
                for(int j=i+1;j<m;j++)
                {
                    boolean x=false;
                    boolean y=false;
                    for(int k=1;k<m;k++)
                    {
                        if (arr[i][k] == arr[j][0])
                        {
                            x=true;

                        }
                    }
                    for(int k=1;k<m;k++)
                    {
                        if (arr[j][k] == arr[i][0])
                        {
                            y=true;

                        }
                    }
                    if(!x && !y)
                    {
                        ans++;
                    }
                }
            }
            System.out.println(ans);
        
    }
    
}
