class Solution {
    public void findCombinations(int[] arr, int start, int sum, int target, List<Integer> temp, List<List<Integer>> ans){
        // base cases
        if(sum==target){
            ans.add(new ArrayList<Integer>(temp));
            return;
        }

        for(int i=start; i<arr.length; i++){
            if(i>start && arr[i]==arr[i-1])
                continue;
            
            if(sum>target)
                break;

            temp.add(arr[i]);
            findCombinations(arr, i+1, sum+arr[i], target, temp, ans);
            temp.remove(temp.size()-1);
            
        }

    }
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();

        findCombinations(candidates, 0, 0, target, temp, ans);

        return ans;
    }
}
