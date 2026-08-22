class Solution {
    public static boolean isPalinArray(int[] arr) {
        for(int i=0;i<arr.length;i++)
        {
            int n=arr[i];
            int original=n;
            int reverse=0;
            while(n>0)
            {
                int digit=n %10;
                reverse=reverse*10+digit;
                n/=10;
            }
            if(original!=reverse)
            {
                return false;
            }
        }
        return true;
    }
}