class Solution {
    int count = 0;
    public void mergeSort(int[] nums, int low, int high){
        if(low>=high)
            return;
        
        int mid = low + (high-low)/2;
        mergeSort(nums, low, mid);
        mergeSort(nums, mid+1, high);
        
        countPairs(nums, low, mid, high);
        merge(nums, low, mid, high);
    }

    public void merge(int[] nums, int low, int mid, int high){
        int p1 = low;
        int p2 = mid+1;
        ArrayList<Integer> temp = new ArrayList<>();

        while(p1<=mid && p2<=high){
            if(nums[p1]<=nums[p2]){
                temp.add(nums[p1]);
                p1++;
            }
            else{
                temp.add(nums[p2]);
                p2++;
            }
        }

        while(p1<=mid){
            temp.add(nums[p1++]);
        }

        while(p2<=high){
            temp.add(nums[p2++]);
        }

        for(int i = low; i<=high; i++){
            nums[i] = temp.get(i-low);
        }
    }

    public void countPairs(int[] nums, int low, int mid, int high){
        int right = mid+1;
        for(int i=low; i<=mid; i++){
            while(right<=high && (long)nums[i]>(long)2*(long)nums[right]){
                right++;
            }
            count = count + (right - (mid+1));
        }
    }
    public int reversePairs(int[] nums) {
        mergeSort(nums, 0, nums.length-1);

        return count;
    }
}
