class Solution {
    public int minValueToBalance(List<Integer> arr) {
        int sum=0;
        int sum1=0;
        int mid=arr.size()/2;
        for(int i=0;i<mid;i++)
        {
            sum+=arr.get(i);
        }
        for(int i=mid;i<arr.size();i++)
        {
            sum1+=arr.get(i);
        }
        
        return Math.abs(sum-sum1);
        
    }
}