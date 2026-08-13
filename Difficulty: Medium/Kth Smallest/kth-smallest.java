class Solution {
    public int kthSmallest(int[] arr, int k) {
        // Code here
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++)
        {
            return arr[k-1];
        }
        return -1;
    }
}
