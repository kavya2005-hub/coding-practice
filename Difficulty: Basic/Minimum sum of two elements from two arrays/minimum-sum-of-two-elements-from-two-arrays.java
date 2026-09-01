class Solution {
    public int minSum(int[] arr1, int[] arr2) {
        // code here
        int min1=Integer.MAX_VALUE;
        int second1=Integer.MAX_VALUE;
        int index1=-1;
        for(int i=0;i<arr1.length;i++)
        {
            if(arr1[i]<min1)
            {
                second1=min1;
                min1=arr1[i];
                index1=i;
            }
            else if(arr1[i]<second1)
            {
                second1=arr1[i];
            }
        }
        int min2=Integer.MAX_VALUE;
        int second2=Integer.MAX_VALUE;
        int index2=-1;
        for(int i=0;i<arr2.length;i++)
        {
            if(arr2[i]<min2)
            {
                second2=min2;
                min2=arr2[i];
                index2=i;
            }
            else if(arr2[i]<second2)
            {
                second2=arr2[i];
            }
        }
        if(index1!=index2)
        {
            return min1+min2;
        }
        return Math.min(min1+second2,min2+second1);
    }
}
