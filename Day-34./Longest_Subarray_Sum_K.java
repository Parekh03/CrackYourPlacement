class Solution{
    
   
    // Function for finding maximum and value pair
    public static int lenOfLongSubarr (int A[], int N, int K) {
        //Complete the function
        HashMap<Integer, Integer> map = new HashMap<>();
        int maxlen = 0;
        int sum = 0;
        
        for(int i=0; i<N; i++){
            sum+=A[i];
            
            if(sum==K){
                maxlen = Math.max(maxlen, i+1);
            }
            
            if(map.containsKey(sum-K)){
                maxlen = Math.max(maxlen, i - map.get(sum-K));
            }
            
            if(!map.containsKey(sum)){
                map.put(sum, i);
            }
        }
        
        return maxlen;
        
    }
    
    
}
