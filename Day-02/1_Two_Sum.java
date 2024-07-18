class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] ans = new int[2];
        // Brute force - using two for loops - TC: O(N)

        // Better solution - Using HashMap
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i=0; i<nums.length; i++){
            
            int more = target-nums[i];

            if(map.containsKey(more)){
                ans[0] = i;
                ans[1] = map.get(more);
            }

            map.put(nums[i],i);
        }

        return ans;
    }
}
