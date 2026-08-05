
class Solution {

    public long minMaxProduct(int[] arr1, int[] arr2) {
        // code here
        int max=arr1[0];
        int min=arr2[0];
        for(int i=0;i<arr1.length;i++)
        {
            if(max<arr1[i])
            {
                max=arr1[i];
            }
        }
        for(int i=0;i<arr2.length;i++)
        {
            if(min>arr2[i])
            {
                min=arr2[i];
            }
        }
        int product=max*min;
        return product;
    }
}