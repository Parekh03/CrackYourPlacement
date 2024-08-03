class Solution {
    public void findPermutations(int[] nums, List<Integer> temp, int[] freq, List<List<Integer>> ans, HashSet<List<Integer>> set){
        // base case
        if(temp.size()==nums.length){
            set.add(new ArrayList<>(temp));
            return;
        }

        for(int i=0; i<nums.length; i++)
        {
            if(freq[i]==0){ // element not taken yet
                temp.add(nums[i]);
                freq[i] = 1; // mark it as taken
                findPermutations(nums, temp, freq, ans, set);

                // back tracking
                temp.remove(temp.size()-1);
                freq[i] = 0; // mark it as not taken
            }
        }
    }
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<Integer> temp = new ArrayList<>();
        List<List<Integer>> ans = new ArrayList<>();
        HashSet<List<Integer>> set = new HashSet<>();
        int[] freq = new int[nums.length];

        findPermutations(nums, temp, freq, ans, set);

        for(List<Integer> l : set){
            ans.add(l);
        }

        return ans;
    }
}
