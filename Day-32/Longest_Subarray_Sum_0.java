class GfG
{
    int maxLen(int arr[], int n)
    {
        // Your code here
        HashMap<Integer, Integer> map = new HashMap<>();
        int sum = 0;
        int maxlen = 0;
        
        for(int i=0; i<n; i++){
            sum+=arr[i];
            
            if(sum==0){
                maxlen = Math.max(maxlen, i+1);
            }
            
            if(map.containsKey(sum)){
                int value = map.get(sum);
                maxlen = Math.max(maxlen, i-value);
            }
            
            if(!map.containsKey(sum)){
                map.put(sum, i);
            }
        }
        
        return maxlen;
    }
}
