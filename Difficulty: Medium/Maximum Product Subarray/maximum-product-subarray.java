class Solution {
    int maxProduct(int[] arr) {
     int max=arr[0];
     int prefix=1;
     int suffix=1;
     int n=arr.length;
     for(int i=0;i<arr.length;i++)
     {
         if(prefix==0)
         prefix=1;
         if(suffix==0)
         suffix=1;
         prefix*=arr[i];
         suffix*=arr[n-1-i];
         max=Math.max(max,Math.max(prefix,suffix));
     }
     return max;
        
    }
}