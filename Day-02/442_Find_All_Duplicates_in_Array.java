class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> ans = new ArrayList<>();

        // Hashing solution - TC: O(n) and SC: O(n)
        // HashMap<Integer,Integer> map = new HashMap<>();

        // for(int i=0; i<nums.length; i++){
        //     int freq = map.getOrDefault(nums[i],0);
        //     map.put(nums[i],freq+1);
        // }

        // for(Map.Entry<Integer,Integer> it : map.entrySet()){
        //     if(it.getValue()>1)
        //         ans.add(it.getKey());
        // }

        // Optimal solution - TC: O(n) and SC: O(1)
        if(nums.length<=1)
            return ans;

        Arrays.sort(nums);
        for(int i=0; i<nums.length-1; i++){
            int next = nums[i+1];
            if(next-nums[i]==0){ // duplicate
                ans.add(nums[i]);
            }
        }

        return ans;
    }
}
