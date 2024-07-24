class Solution 
{ 
	public static long[] productExceptSelf(int nums[], int n) 
	{ 
        // code here
        
        long[] product = new long[n];
        
        // Brute force - O(n2)
        // for(int i=0; i<n; i++){
        //     long p = 1;
        //     for(int j=0; j<n; j++){
        //         if(i!=j)
        //             p*=nums[j];
        //     }
        //     product[i] = p;
        // }
        
        
        // Optimal solution - O(2n)
        long[] prefix = new long[n];
        long[] suffix = new long[n];
        
        prefix[0] = 1;
        suffix[n-1] = 1;
        
        for(int i=1; i<n; i++){
            prefix[i] = prefix[i-1]*nums[i-1];
        }
        
        for(int i=n-2; i>=0; i--){
            suffix[i] = suffix[i+1]*nums[i+1];
        }
        
        for(int i=0; i<n; i++){
            product[i] = prefix[i]*suffix[i];
        }
        return product;
	} 
} 
