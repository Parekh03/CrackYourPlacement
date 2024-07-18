class Solution {
    public int findDuplicate(int[] nums) {
        // Hashing solution - TC : 0(n)
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i=0; i<nums.length; i++){
            int freq = map.getOrDefault(nums[i],0);
            map.put(nums[i], freq+1);
        }

        for(Map.Entry<Integer, Integer> it : map.entrySet()){
            if(it.getValue()>1){
                return it.getKey();
            }
        }

        return 0;
    }
}
