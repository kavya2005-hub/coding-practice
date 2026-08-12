class Solution {
    List<List<Integer>> list=new ArrayList<>();
    public List<List<Integer>> subsetsWithDup(int[] nums) {
         Arrays.sort(nums);
        backtracking(0,nums,new ArrayList<Integer>());
        return list;
        
    }
    public void backtracking(int index,int[]nums,List<Integer>temp)
    {
        list.add(new ArrayList<>(temp));
        for(int i=index;i<nums.length;i++)
        {
            if(i>index &&nums[i]==nums[i-1])
            {
                continue;
            }
            temp.add(nums[i]);
            backtracking(i+1,nums,temp);
            temp.remove(temp.size()-1);
        }
    }
          
    
}