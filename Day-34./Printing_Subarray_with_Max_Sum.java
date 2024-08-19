

public class Main {
    public static int[] maxSubArray(int[] nums) {
        int sum = 0, maxSum = Integer.MIN_VALUE;
        int start = -1, end = -1;

        for(int i=0; i<nums.length; i++){
            sum+= nums[i];
            if(start==-1){
                start = i;
                end = i;
            }
            else if(start!=-1){
                end = i;
            }
            maxSum = Math.max(maxSum, sum);

            if(sum<0){
                sum = 0;
                start = -1;
                end = -1;
                continue;
            }
        }

        return new int[]{maxSum, start, end};
    }
    public static void main(String[] args) {
        int[] arr = {5,4,-1,7,8};

        int[] ans = maxSubArray(arr);

        int max = ans[0];
        int start = ans[1];
        int end = ans[2];

        for(int i=start; i<=end; i++){
            System.out.println(arr[i]);
        }
    }
}
