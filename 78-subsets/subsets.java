class Solution {
    List<List<Integer>> list=new ArrayList<>();
    public List<List<Integer>> subsets(int[] nums) {
        backtrack(0,nums,new ArrayList<>());
        return list;
    }
        public void backtrack(int index,int[]nums,List<Integer>temp)
        {
            if(index==nums.length)
            {
                list.add(new ArrayList<>(temp));
                return;
            }
            temp.add(nums[index]);
            backtrack(index+1,nums,temp);
            temp.remove(temp.size()-1);
            backtrack(index+1,nums,temp);
        }
        
    
}