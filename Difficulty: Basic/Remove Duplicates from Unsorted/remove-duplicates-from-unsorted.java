class Solution {
    static ArrayList<Integer> removeDuplicate(int arr[]) {
        ArrayList<Integer>list=new ArrayList<>();
        HashSet<Integer>set=new HashSet<>();
       for(int i=0;i<arr.length;i++)
       {
           
               if(!set.contains(arr[i]))
               {
                   set.add(arr[i]);
                   list.add(arr[i]);
               }
           
       }
        return list;
    }
}