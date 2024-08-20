class Solution {
    public void reverse(int[] nums, int l , int r){
        while(l<r){
            int temp = nums[l];
            nums[l] = nums[r];
            nums[r] = temp;

            l++;
            r--;
        }
    }
    public void nextPermutation(int[] nums) {
        // STEP 1 - Find the break point
        int brk = -1, n = nums.length;

        for(int i=n-2; i>=0; i--){
            if(nums[i]<nums[i+1]){
                brk = i;
                break;
            }
        }

        if(brk == -1){
            reverse(nums, 0, n-1);
            return;
        }

        // STEP 2 - Find the next greater element in the right half and swap
        int greater = Integer.MIN_VALUE;

        for(int i=n-1; i>brk; i--){
            if(nums[i]>nums[brk]){
                int temp = nums[i];
                nums[i] = nums[brk];
                nums[brk] = temp;
                break;
            }
        }

        // STEP 3 - Reverse the right half
        reverse(nums, brk+1, n-1);
        
    }
}
