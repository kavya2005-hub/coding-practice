import java.util.HashMap;

class Solution {
    public int subarraySum(int[] nums, int k) {

        HashMap<Integer, Integer> map = new HashMap<>();

        int sum = 0;
        int count = 0;

        for (int i = 0; i < nums.length; i++) {

            sum += nums[i];

            // Subarray starts from index 0
            if (sum == k) {
                count++;
            }

            // Check previous prefix sums
            if (map.containsKey(sum - k)) {
                count += map.get(sum - k);
            }

            // Store current prefix sum
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }

        return count;
    }
}