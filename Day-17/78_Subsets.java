class Solution {
    public void generateSubsets(int index, List<Integer> ds, int[] nums, List<List<Integer>> ans){
        if(index>=nums.length){
            ans.add(new ArrayList<>(ds));
            return;
        }

        // pick
        ds.add(nums[index]);
        generateSubsets(index+1, ds, nums, ans);
        ds.remove(ds.size()-1);

        // not pick
        generateSubsets(index+1, ds, nums, ans);
    }
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> ds = new ArrayList<>();
        generateSubsets(0, ds, nums, ans);

        return ans;

    }
}
