class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        HashSet<List<Integer>> set = new HashSet<>();

        // BRUTE FORCE - O(N3) ---> TLE
        //======================

        // if(nums.length<3)
        //     return ans;


        // for(int i=0; i<nums.length-2; i++){
        //     for(int j=i+1; j<nums.length-1; j++){
        //         for(int k=j+1; k<nums.length; k++){
        //             if(nums[i]+nums[j]+nums[k]==0){
        //                 List<Integer> temp = new ArrayList<>();
        //                 temp.add(nums[i]);
        //                 temp.add(nums[j]);
        //                 temp.add(nums[k]);

        //                 Collections.sort(temp);

        //                 set.add(temp);
        //             }
        //         }
        //     }
        // }

        // for(List<Integer> list : set){
        //     ans.add(list);
        // }

        // BETTER SOLUTION - O(N2) ----> Aceepted
        // ========================

        // HashMap<Integer, Integer> map = new HashMap<>();

        // for(int i=0; i<nums.length-1; i++){
        //     for(int j=i+1; j<nums.length; j++){
        //         int k = -(nums[i]+nums[j]);
        //         if(map.containsKey(k) && map.get(k)!=i && map.get(k)!=j){
        //             List<Integer> temp = new ArrayList<>();
        //             temp.add(nums[i]);
        //             temp.add(nums[j]);
        //             temp.add(k);

        //             Collections.sort(temp);

        //             set.add(temp);
        //         }
        //         map.put(nums[j],j);
        //     }
        // }   

        // for(List<Integer> list : set)
        //     ans.add(list);

        // OPTIMAL - O(N2)
        // =================
        Arrays.sort(nums);
        for(int i=0; i<nums.length; i++){
            if(i>0 && nums[i]==nums[i-1])
                continue;
            int j = i+1;
            int k = nums.length - 1;

            while(j<k){
                int sum = nums[i] + nums[j] + nums[k];

                if(sum>0)
                    k--;
                else if(sum<0)
                    j++;

                else{
                    // triplet found
                    List<Integer> temp = new ArrayList<>();
                    temp.add(nums[i]);
                    temp.add(nums[j]);
                    temp.add(nums[k]);

                    ans.add(temp);

                    int currj = nums[j];
                    int currk = nums[k];

                    j++;
                    k--;

                    while(j<k && nums[j]==nums[j-1]){
                        j++;
                    }
                    while(j<k && nums[k]==nums[k+1]){
                        k--;
                    }
                }
            }
        }


        return ans;
    }
}
