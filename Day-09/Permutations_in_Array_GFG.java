class Solution {
    public void reverseArray(long[] a){
        int p1 = 0;
        int p2 = a.length-1;
        
        while(p1<p2){
            long temp = a[p1];
            a[p1] = a[p2];
            a[p2] = temp;
            
            p1++;
            p2--;
        }
    }
    public boolean isPossible(long a[], long b[], int n, long k) {
        // Your code goes here
        
        // sort the first in ascending
        Arrays.sort(a);
        
        // sort the second in descending
        Arrays.sort(b);
        reverseArray(b);
        
        for(int i=0; i<n; i++){
            long sum = a[i] + b[i];
            if(sum<k)
                return false;
        }
        return true;
        
        
    }
}
