class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        for(int i=0; i<nums.length; i++){
            pq.offer(nums[i]);
        }

        int count = 1;
        while(count<k){
            pq.poll();
            count++;
        }

        return pq.poll();
    }
}
