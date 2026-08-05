class Solution {
    int missingNum(int arr[]) {
        // code here
        long sum=0;
        int n=arr.length+1;
        
        for(int i=0;i<arr.length;i++)
        {
            sum+=arr[i];
        }
        long ex=(long)n*(n+1)/2;
        int res=(int)(ex-sum);
        return res;
    }
}