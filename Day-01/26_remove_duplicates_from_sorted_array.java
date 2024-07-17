class Solution {
    public int removeDuplicates(int[] nums) {
        int count=1;

        int i=0, j=1;
        while(j<nums.length){
            if(nums[i]!=nums[j]){
                i++;
                count++;
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
            }
            j++;
        }

        return count;
    }
}
