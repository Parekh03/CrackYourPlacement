class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] ans = new int[nums1.length];
        int ptr = 0;

        for(int i=0; i<nums1.length; i++){
            boolean found = false;
            int nextGreater = -1;
            for(int j=0; j<nums2.length; j++){
                if(nums2[j]==nums1[i]){
                    found = true;
                    continue;
                }
                
                else if(found==true && nums2[j]>nums1[i]){
                    nextGreater = nums2[j];
                    break;
                }
            }

            ans[ptr++] = nextGreater;

        }

        return ans;
    }
}
