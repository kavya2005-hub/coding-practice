class Solution {
    public int[] constructArray(int n, int k) {
       int left=1;
       int right=k+1;
       int index=0;
       int[]arr=new int[n];
       while(left<=right)
       {
        arr[index]=left;
        left++;
        index++;
        if(left<=right)
        {
            arr[index]=right;
            index++;
            right--;
        }
       }
       int num=k+2;
       while(index<n)
       {
        arr[index]=num;
        index++;
        num++;
       }
       return arr;
        
    }
}