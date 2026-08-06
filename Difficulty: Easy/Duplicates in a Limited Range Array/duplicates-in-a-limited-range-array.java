class Solution {
    public ArrayList<Integer> findDuplicates(int[] arr) {
       Arrays.sort(arr);
       ArrayList<Integer>list=new ArrayList<>();
       for(int i=1;i<arr.length;i++)
       {
           if(arr[i]==arr[i-1])
           {
               list.add(arr[i]);
           }
       }
       return list;
        
    }
}