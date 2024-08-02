class Solution {
    public void powerSet(int[] arr, int i, List<Integer> temp, HashSet<List<Integer>> set){
        // Base cases
        if(i==arr.length){
            Collections.sort(temp);
            set.add(new ArrayList<>(temp));
            return;
        }

        // Pick
        temp.add(arr[i]);
        powerSet(arr, i+1, temp, set);

        // Backtrack
        temp.remove(temp.size()-1);

        // Not pick
        powerSet(arr, i+1, temp, set);
    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        HashSet<List<Integer>> set = new HashSet<>();
        List<Integer> temp = new ArrayList<>();
        List<List<Integer>> ans = new ArrayList<>();

        powerSet(nums, 0, temp, set);

        for(List<Integer> l : set){
            ans.add(l);
        }        

        return ans;
    }
}
