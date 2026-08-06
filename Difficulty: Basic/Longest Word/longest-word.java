class Solution {
    public String longest(String[] arr) {
        int max=arr[0].length();
        String ans=arr[0];
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i].length()>max)
            {
                max=arr[i].length();
                ans=arr[i];
            }
        }
        return ans;
    }
}