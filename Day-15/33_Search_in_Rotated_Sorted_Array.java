class Solution {
    public int search(int[] nums, int target) {
        int low = 0;
        int high = nums.length-1;

        while(low<=high){
            int mid = low + (high-low)/2;

            if(nums[mid]==target)
                return mid;

            // find the sorted half

            if(nums[low]<=nums[mid]){ // left sorted
                if(target>=nums[low] && target<=nums[mid]){ // target in left half
                    high = mid - 1;
                }
                else{ // target in right half
                    low = mid+1;
                }
            }

            else{ // right sorted
                if(nums[mid]<=target && nums[high]>=target){ //target in right half
                    low = mid + 1;
                }

                else{ // target in left half
                    high = mid - 1;
                }
            }
        }

        return -1;
    }
}
