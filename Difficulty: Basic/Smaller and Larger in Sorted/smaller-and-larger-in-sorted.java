class Solution {
    int[] getMoreAndLess(int[] arr, int target) {
        int less=0;
        int more=0;
        int[]ans=new int[2];
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]<=target)
            {
                less++;
            }
 if(arr[i]>=target)
            {
                more++;
            }
           
        }
         ans[0]=less;
        ans[1]=more;
        return ans;
    }
}