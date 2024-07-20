class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();

        int sum=0, count=0;
        for(int i=0; i<nums.length; i++){
            sum+=nums[i];
            int rem = sum%k;

            if(rem<0)
                rem+=k;

            if(sum%k==0)
                count++;
            
            if(map.containsKey(rem)){
                count+=map.get(rem);
            }

            int freq = map.getOrDefault(rem,0);
            map.put(rem,freq+1);
        }
        return count;
    }
}
