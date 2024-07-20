class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();

        int sum=0, count=0;
        for(int i=0; i<nums.length; i++){
            sum+=nums[i];
            int rem = sum - k;
            
            if(sum==k)
                count++;

            if(!map.isEmpty() && map.containsKey(rem)){
                count+=map.get(rem);
            }

            int freq = map.getOrDefault(sum,0);
            map.put(sum,freq+1);
        }

        return count;
    }
}
