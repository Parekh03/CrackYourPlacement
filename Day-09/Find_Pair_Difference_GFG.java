class Solution {
    public int findPair(int n, int x, int[] arr) {
        // code here
        
        Arrays.sort(arr);
        
        //O(n2) solution - TLE
        // for(int i=0; i<n; i++){
        //     for(int j=i+1; j<n; j++){
        //         int diff = arr[j] - arr[i];
        //         if(diff==x)
        //             return 1;
        //         else if(diff>x)
        //             break;
        //     }
        // }
        
        int i=0, j=1;
        while(i<n && j<n){
            int diff = arr[j] - arr[i];
            if(diff==x && i!=j)
                return 1;
                
            else if(diff>x)
                i++;
            else
                j++;
        }
        
        return -1;
    }
}
