class Solution {
    public void reverseArray(int arr[]) {
        int left=0;
        int rigth=arr.length-1;
        while(left<rigth)
        {
            int temp=arr[left];
            arr[left]=arr[rigth];
            arr[rigth]=temp;
            left++;
            rigth--;
        }
        
    }
}