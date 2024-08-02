class Solution {
    public void findCombinations(int curr, int n, int k, List<Integer> temp, List<List<Integer>> ans){
        // base cases
        if(temp.size()==k){
            ans.add(new ArrayList<>(temp));
            return;
        }
        if(curr==n+1)
            return;

        // pick 
        temp.add(curr);
        findCombinations(curr+1, n, k, temp, ans);

        // backtrack
        temp.remove(temp.size()-1);

        // not pick
        findCombinations(curr+1, n, k, temp, ans);
    }
    public List<List<Integer>> combine(int n, int k) {
        List<Integer> temp  = new ArrayList<>();
        List<List<Integer>> ans = new ArrayList<>();

        findCombinations(1, n, k, temp, ans);

        return ans;
    }
}
