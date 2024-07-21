class Solution {
    public int maxArea(int[] height) {
        int ans = 0;

        // BRUTE FORCE - TLE

        // select a line
        // for(int i=0; i<height.length-1; i++){
        //     // select another line
        //     for(int j=i+1; j<height.length; j++){
        //         int amount = (j-i) * Math.min(height[j], height[i]); //length * breadh
        //         ans = Math.max(ans, amount);
        //     }
        // }

        // TWO POINTER APPRAOCH - O(N)
        int p1 = 0, p2 = height.length - 1;

        while(p1<p2){
            int amount = (p2-p1) * Math.min(height[p1],height[p2]);
            ans = Math.max(ans,amount);

            if(height[p1]<=height[p2])
                p1++;
            else
                p2--;

        }

        return ans;
    }
}
