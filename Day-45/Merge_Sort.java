class Solution
{
    void merge(int arr[], int l, int m, int r)
    {
         int p1 = l, p2 = m+1;
         int[] sorted = new int[r-l+1];
         int s = 0;
         
         while(p1<=m && p2<=r){
             if(arr[p1]<=arr[p2]){
                 sorted[s++] = arr[p1++];
             }
             else{
                 sorted[s++] = arr[p2++];
             }
         }
         
         while(p1<=m){
             sorted[s++] = arr[p1++];
         }
         
         while(p2<=r){
             sorted[s++] = arr[p2++];
         }
         
        //  the sorted array contains all the elements in sorted order
        // making changes in the original array in-place, acc to the sorted merged array
        
        for(int i=l; i<=r; i++){
            arr[i] = sorted[i-l];
        }
    }
    void mergeSort(int arr[], int l, int r)
    {
        // Base condition - single element
        if(l>=r){
            return;
        }
        
        // Divide the array in two halves
        int m = l + (r-l)/2;
        mergeSort(arr, l, m);
        mergeSort(arr, m+1, r);
        
        // merge the arrays
        merge(arr, l , m, r);
    }
}
