class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        int[] ans = new int[n];

        // BRUTE FORCE

        // for(int i=0; i<n; i++){
        //     for(int j=i+1; j<n; j++){
        //         if(temperatures[j]>temperatures[i]){
        //             ans[i] = j-i;
        //             break;
        //         }
        //     }
        // }

        // USING STACK
        Stack<Integer> stack = new Stack<>();
        
        for (int i = 0; i < temperatures.length; i++) {
            while (!stack.isEmpty() && temperatures[i] > temperatures[stack.peek()]) {
                int idx = stack.pop();
                ans[idx] = i - idx;
            }
            stack.push(i);
        }

        return ans;
    }
}
