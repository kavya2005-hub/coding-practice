class Solution {
    ArrayList<Integer> findTwoElement(int arr[]) {
      Arrays.sort(arr);
      ArrayList<Integer>list=new ArrayList<>();
      long sum=0;
      int duplicate=0;
      
      for(int i=1;i<arr.length;i++)
      {
          if(arr[i]==arr[i-1])
          {
              duplicate=arr[i];
              break;
          }
      }
      for(int i=0;i<arr.length;i++)
      {
          sum+=arr[i];
      }
      int n=arr.length;
        long expectedsum=(long)n*(n+1)/2;
        int total=(int)(duplicate+expectedsum-sum);
       
        list.add(duplicate);
         list.add(total);
        return list;
    }
}
