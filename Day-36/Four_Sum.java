class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> ans = new ArrayList<>();

        Arrays.sort(nums);

        for(int i=0; i<nums.length; i++){
            if(i>0 && nums[i-1]==nums[i]){
                continue;
            }

            for(int j=i+1; j<nums.length; j++){
                if(j>i+1 && nums[j-1]==nums[j]){
                    continue;
                }

                int k = j+1;
                int l = nums.length-1;

                while(k<l){
                    long sum = nums[i] + nums[j];
                    sum+=nums[k];
                    sum+=nums[l];

                    if(sum==(long)target){
                        List<Integer> temp = Arrays.asList(nums[i],nums[j],nums[k],nums[l]);
                        ans.add(temp);

                        k++;
                        l--;

                        while(k<l && nums[k-1]==nums[k]){
                            k++;
                        }

                        while(k<l && nums[l+1]==nums[l]){
                            l--;
                        }
                    }

                    else if(sum>(long)target){
                        l--;
                    }

                    else{
                        k++;
                    }
                }
            }
        }

        return ans;
    }
}
