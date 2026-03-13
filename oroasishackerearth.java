import java.io.*;
import java.util.*;

class TestClass {
    public static void main(String args[]) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());

        while(t-- > 0){

            int n = Integer.parseInt(br.readLine().trim());
            String[] s = br.readLine().split(" ");

            int[] arr = new int[n];
            for(int i=0;i<n;i++){
                arr[i] = Integer.parseInt(s[i]);
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
    }
}
