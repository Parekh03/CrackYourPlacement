class Solution {
    public void findPermutations(int[] nums, List<Integer> temp, int[] freq, List<List<Integer>> ans){
        // base case
        if(temp.size()==nums.length){
            ans.add(new ArrayList<>(temp));
            return;
        }

        for(int i=0; i<nums.length; i++)
        {
            if(freq[i]==0){ // element not taken yet
                temp.add(nums[i]);
                freq[i] = 1; // mark it as taken
                findPermutations(nums, temp, freq, ans);

                // back tracking
                temp.remove(temp.size()-1);
                freq[i] = 0; // mark it as not taken
            }
        }
    }
    public List<List<Integer>> permute(int[] nums) {
        List<Integer> temp = new ArrayList<>();
        List<List<Integer>> ans = new ArrayList<>();
        int[] freq = new int[nums.length];

        findPermutations(nums, temp, freq, ans);

        return ans;
    }
}
