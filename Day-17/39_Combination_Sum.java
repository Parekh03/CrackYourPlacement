class Solution {
    public void findCombinations(int[] arr, int i, int sum, int target, List<Integer> temp, List<List<Integer>> ans){

        // base cases
        if(sum==target){
            ans.add(new ArrayList<>(temp));
            return;
        }
        if(i==arr.length || sum>target){
            return;
        }

        // pick
        temp.add(arr[i]);
        findCombinations(arr, i, sum+arr[i], target, temp, ans);

        // Backtrack
        temp.remove(temp.size()-1);

        // not pick
        findCombinations(arr, i+1, sum, target, temp, ans);

    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<Integer> temp = new ArrayList<>();
        List<List<Integer>> ans = new ArrayList<>();

        findCombinations(candidates, 0, 0, target, temp, ans);

        return ans;
    }
}
