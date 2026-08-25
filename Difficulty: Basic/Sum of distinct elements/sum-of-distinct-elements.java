class Solution {
    int findSum(int[] arr) {
        HashSet<Integer>set=new HashSet<>();
        int sum=0;
        for(int i=0;i<arr.length;i++)
        {
            if(!set.contains(arr[i]))
            {
            set.add(arr[i]);
            sum+=arr[i];
            }
        }
        return sum;
        
    }
}