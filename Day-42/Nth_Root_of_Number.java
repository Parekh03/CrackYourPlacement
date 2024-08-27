class Solution
{   
    public int pow(int x, int n){
        int ans = 1;
        
        for(int i = 1; i <= n; i++){
            if(ans > Integer.MAX_VALUE / x) {
                // If multiplication will cause overflow, return Integer.MAX_VALUE as a signal.
                return Integer.MAX_VALUE;
            }
            ans = ans * x;
        }
        
        return ans;
    }
    
    public int NthRoot(int n, int m)
    {
        int low = 1;
        int high = m;
        int ans = -1;
        
        while(low <= high){
            int mid = low + (high - low) / 2;
            
            int midPowN = pow(mid, n);
            
            if(midPowN == m) {
                return mid;  // Exact root found
            }
            else if(midPowN < m){
                low = mid + 1;
            }
            else{
                high = mid - 1;
            }
        }
        
        return ans;
    }
}
