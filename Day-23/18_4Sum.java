class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        int n = nums.length;
        List<List<Integer>> ans = new ArrayList<>();

        Arrays.sort(nums);

        for(int i=0; i<n; i++){
            if(i>0 && nums[i-1]==nums[i])
                continue;
            
            for(int j=i+1; j<n; j++){
                if(j>i+1 && nums[j-1]==nums[j])
                    continue;

                int k = j+1;
                int l = n-1;

                while(k<l){
                    // important - do not add all the elements at once
                    long sum = nums[i] + nums[j];
                    sum+= nums[k] + nums[l];

                    if(sum==(long)target){
                        List<Integer> temp = new ArrayList<>();
                        temp.add(nums[i]);
                        temp.add(nums[j]);
                        temp.add(nums[k]);
                        temp.add(nums[l]);

                        ans.add(temp);

                        k++;
                        l--;

                        while(k<l && nums[k-1]==nums[k])
                            k++;

                        while(k<l && nums[l+1]==nums[l])
                            l--;
                        
                    }

                    else if(sum<target){
                        k++;
                    }

                    else{ // sum > target
                        l--;
                    }
                }
            }
        }
        
        return ans;
    }
}
