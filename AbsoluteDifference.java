import java.util.Scanner;

public class AbsoluteDifference {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        int n3=sc.nextInt();
        if(n+n1==10 && Math.abs(n2-n3)==3)
        {
            System.out.println(n*n1*n2*n3);
        }

        else{
            System.out.println("Not Satisfied");
        }
    }
    
}
