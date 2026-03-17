
import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        for(int j = 0 ; j < test ; j++){
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0 ; i < n ; i++){
            arr[i] = sc.nextInt();
        }
        List<Integer> odd = new ArrayList<>();
        List<Integer> even = new ArrayList<>();
        for(int i : arr){
            if(Integer.bitCount(i)%2==0) even.add(i);
            else odd.add(i);
        }
        Collections.sort(even);
        Collections.sort(odd);
        int ind = 0;
        for(int i : even) System.out.print(i+" ");
        for(int i : odd) System.out.print(i+" ");
        System.out.println();        }
    }
}
