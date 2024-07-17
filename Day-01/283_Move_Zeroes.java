class Solution {
    public void moveZeroes(int[] nums) {
        // Edge case 1
        if(nums.length<=1)
            return;

        int firstZero = -1;
        for(int i=0; i<nums.length; i++){
            if(nums[i]==0){
                firstZero = i;
                break;
            }
        }

        // Edge case 2
        if(firstZero == -1)
            return;

        int i = firstZero, j=i+1;

        while(j<nums.length){
            if(nums[j]!=0){
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                i++;
            }
            j++;
        }
    }
}
