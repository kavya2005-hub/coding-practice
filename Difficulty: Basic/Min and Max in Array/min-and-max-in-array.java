class Solution {
    public ArrayList<Integer> getMinMax(int[] arr) {
        int n=arr.length;
        int min=arr[0];
        int max=arr[0];
       ArrayList<Integer>list=new ArrayList<>();
       for(int i=0;i<n;i++)
       {
           if(min>arr[i])
           {
               min=arr[i];
             
           }
           
           if(max<arr[i])
           {
               max=arr[i];
             
           }
       }
        list.add(min);
        list.add(max);
       return list;
       
        
    }
}
