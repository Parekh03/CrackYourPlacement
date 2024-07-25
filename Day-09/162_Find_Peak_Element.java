class Solution {
    public int findPeakElement(int[] nums) {
        // Edge case 1: Length 1
        if(nums.length==1)
            return 0;
        
        // Edge case 2: Length 2
        if(nums.length==2){
            if(nums[0]>nums[1])
                return 0;
            else
                return 1;
        }

        // Edge case 3: For length greater than 2, check peak for first and last element
        if(nums[0]>nums[1])
            return 0;

        if(nums[nums.length-1]>nums[nums.length-2])
            return nums.length-1;

        // start the low and high from 1 and second last element,
        // reason: if we start from 0 and last element, mid may become 0 or length-1
        // in that case, it will lead to index out of bounds exception
        int low = 1, high = nums.length-2;

        while(low<=high){
            int mid = low + (high-low)/2;

            if(nums[mid]>nums[mid-1] && nums[mid]>nums[mid+1]){
                return mid;
            }

            else if(nums[mid]<nums[mid+1]){
                low = mid+1;
            }

            else if(nums[mid]>nums[mid+1]){
                high = mid-1;
            }
        }
        return -1;
    }
}
