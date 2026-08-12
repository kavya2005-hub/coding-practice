import java.util.*;

class TestClass {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0){

            int n = sc.nextInt();
            int[] arr = new int[n];

            for(int i=0;i<n;i++){
                arr[i] = sc.nextInt();
            }

            int minLen = n + 1;
            int count = 0;

            for(int i=0;i<n;i++){

                int insideOR = 0;

                for(int j=i;j<n;j++){

                    insideOR |= arr[j];

                    int outsideOR = 0;

                    for(int k=0;k<i;k++){
                        outsideOR |= arr[k];
                    }

                    for(int k=j+1;k<n;k++){
                        outsideOR |= arr[k];
                    }

                    if(insideOR == outsideOR){

                        int len = j - i + 1;

                        if(len < minLen){
                            minLen = len;
                            count = 1;
                        }
                        else if(len == minLen){
                            count++;
                        }
                    }
                }
            }

            if(count == 0){
                System.out.println(-1);
            }
            else{
                System.out.println(minLen + " " + count);
            }
        }

        sc.close();
    }
}
