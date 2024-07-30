import java.util.*;

class SortList implements Comparator<List<Integer>> {
    @Override
    public int compare(List<Integer> a, List<Integer> b) {
        if(a.get(1)>b.get(1))
            return -1;
        else if(a.get(1)<b.get(1))
            return 1;
        return 0;
    }
}

class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        // Step 1: Count frequencies
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        // Step 2: Create a list of [number, frequency] pairs
        List<List<Integer>> list = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            List<Integer> temp = new ArrayList<>();
            temp.add(entry.getKey());
            temp.add(entry.getValue());
            list.add(temp);
        }

        // Step 3: Sort the list by frequency in descending order
        Collections.sort(list, new SortList());

        // Step 4: Extract the top k frequent elements
        int[] ans = new int[k];
        for (int i = 0; i < k; i++) {
            ans[i] = list.get(i).get(0);
        }

        return ans;
    }
}
