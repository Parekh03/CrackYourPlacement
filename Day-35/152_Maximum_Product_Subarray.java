class Solution {
    public int maxProduct(int[] nums) {
        double prefix = 1, suffix = 1;
        double maxp = Integer.MIN_VALUE;

        for(int i=0; i<nums.length; i++){
            prefix*=nums[i];
            suffix*=nums[nums.length-i-1];
            maxp = Math.max(maxp, Math.max(prefix, suffix));

            if(prefix==0)
                prefix = 1;
            
            if(suffix==0)
                suffix = 1;
        }

        return (int)maxp;
    }
}
