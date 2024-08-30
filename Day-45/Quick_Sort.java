class Solution
{
    //Function to sort an array using quick sort algorithm.
    static void quickSort(int arr[], int low, int high)
    {
        if(low>=high){
            return;
        }
        
        int pindex = partition(arr, low, high);
        
        // left half
        quickSort(arr, low, pindex - 1);
        
        // right half
        quickSort(arr, pindex + 1, high);
        
    }
    
    // function to get the partition index
    static int partition(int arr[], int low, int high)
    {
        // your code here
        int pivot = arr[low];
        int i = low;
        int j = high;
        
        while(i<j){
            
            // skip all the elements smaller than pivot from left
            while(arr[i]<=pivot && i<high){
                i++;
            }
            
            // skip all the elements greater than pivot from right
            while(arr[j]>=pivot && j>low){
                j--;
            }
            
            if(i<j){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        
        // swap arr[low] and arr[j];
        int temp = arr[low];
        arr[low] = arr[j];
        arr[j] = temp;
        
        return j;
    } 
}
