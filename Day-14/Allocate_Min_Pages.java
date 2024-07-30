class Solution {
    
    public static long countStudents(int[] arr, int n, long pages){
        long count = 1;
        long sum = arr[0];
        
        for(int i=1; i<n; i++){
            if(sum+arr[i]>pages){
                count++;
                sum = arr[i];
            }
            else{
                sum = sum+arr[i];
            }
        }
        
        return count;
    } 
    
    // Function to find minimum number of pages.
    public static long findPages(int n, int[] arr, int m) {
        // Your code here
        
        if(m>n)
            return -1;
        

        long maxp = Integer.MIN_VALUE;
        long sump = 0;
        
        for(int i=0; i<n; i++){
            sump+=arr[i];
            maxp = Math.max(maxp, arr[i]);
        }
        
        
        long low = maxp;
        long high = sump;
        long result = high;
        
        while(low<=high){
            long mid = low + (high-low)/2;
            
            if(countStudents(arr,n,mid)>m){
                low = mid+1;
            }
            else{
                result = mid;
                high = mid-1;
            }
        }
        
        return result;
        
    }
};
