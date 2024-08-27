class Solution {
    long floorSqrt(long n) {
        // Your code here
        long ans = 1;
        
        // BRUTE FORCE 
        // for(int i=1; i<=n; i++){
        //     long sq = i*i;
            
        //     if(sq<=n){
        //         ans = i;
        //     }
        // }
        
        long low = 1;
        long high = n;
        
        while(low<=high){
            long mid = (low) + (high-low)/2;
            
            if(mid*mid<=n){
                ans = mid;
                low = mid + 1;
            }
            
            else{
                high = mid - 1;
            }
        }
        
        
        return ans;
    }
}
