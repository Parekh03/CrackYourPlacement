class Solution
{
    //Function to find the minimum number of swaps required to sort the array.
    public int minSwaps(int nums[])
    {
        // Code here
        HashMap<Integer, Integer> map = new HashMap<>();
        int[] temp = new int[nums.length];
        
        for(int i=0; i<nums.length; i++){
            map.put(nums[i],i);
            temp[i] = nums[i];
        }
        
        Arrays.sort(temp);
        
        int count  = 0;
        
        for(int i=0; i<nums.length; i++){
            if(nums[i]!=temp[i]){
                int reqEleIndex = map.get(temp[i]);
                int currEle = nums[i];
                int reqEle = temp[i];
                
                // swap element at i and reqEleIndex
                int tempEle = nums[i];
                nums[i] = nums[reqEleIndex];
                nums[reqEleIndex] = tempEle;
                
                // increase count
                count++;
                
                // update the indices in map
                map.put(currEle, reqEleIndex);
                map.put(reqEle, i);
            
            }
        }
        
        return count;
    }
}
