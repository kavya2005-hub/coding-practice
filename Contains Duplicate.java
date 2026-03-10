class Solution {
    public boolean hasDuplicate(int[] arr) {
        boolean isduplicate=false;
        for(int i=0;i<arr.length-1;i++)
        {
            if(arr[i]==arr[i+1])
            {
                isduplicate=true;
            }
        }
        
        
        return isduplicate;
        
        
    }
}
