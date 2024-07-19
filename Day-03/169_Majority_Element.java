import java.util.*;
class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int n = nums.length;

        for(int i=0; i<n; i++){
            int freq = map.getOrDefault(nums[i],0);
            map.put(nums[i],freq+1);
        }

        for(Map.Entry<Integer, Integer> it : map.entrySet()){
            if(it.getValue()>n/2){
                return it.getKey();
            }
        }
        return -1;
    }
}
