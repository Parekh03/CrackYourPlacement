class Solution {
    public void sortColors(int[] nums) {
        // Dutch National Flag Algorithm

        int low=0, mid=0, high=nums.length-1;
        while(low<=mid && mid<=high){
            if(nums[mid]==0){
                int temp = nums[low];
                nums[low] = nums[mid];
                nums[mid] = temp;
                low++;
                mid++;
            }

            else if(nums[mid]==1){
                mid++;
            }

            else{ // nums[mid]==2
                int temp = nums[mid];
                nums[mid] = nums[high];
                nums[high] = temp;
                high--;
            }
        }


    }
}
