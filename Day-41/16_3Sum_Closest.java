class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int minDiff = Integer.MAX_VALUE;
        int sum = 0;

        Arrays.sort(nums);

        outer:
        for(int i=0; i<nums.length; i++){
            int j = i+1;
            int k = nums.length-1;

            while(j<k){
                int currSum = nums[i] + nums[j] + nums[k];
                if(currSum==target){
                    sum = currSum;
                    break outer;
                }

                int currDiff = Math.abs(target-currSum);
                if(currDiff<minDiff){
                    minDiff = currDiff;
                    sum = currSum;
                }

                if(currSum>target){
                    k--;
                }
                else if(currSum<target){
                    j++;
                }
            }
        }

        return sum;

    }
}
