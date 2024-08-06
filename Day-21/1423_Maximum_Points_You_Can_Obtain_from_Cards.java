class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int lsum = 0, rsum = 0, sum = 0, maxSum = 0;

        for(int i=0; i<k; i++){
            lsum+=cardPoints[i];
        }

        sum = lsum + rsum;
        maxSum = sum;

        int r = cardPoints.length-1;
        for(int i=k-1; i>=0; i--){
            lsum-=cardPoints[i];
            rsum+=cardPoints[r--];
            sum = lsum + rsum;
            maxSum = Math.max(sum, maxSum);
        }

        return maxSum;
    }
}
