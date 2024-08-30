class Solution
{
    //Function to sort the array using bubble sort algorithm.
	public static void bubbleSort(int arr[], int n)
    {
        //code here
        // variable to keep a track if the array is sorted or not
        boolean swapped = false;
        
        for(int i=0; i<n; i++){
            // a pass
            for(int j=0; j<n-i-1; j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    
                    swapped = true;
                }
            }
            
            // if swapped is false, that means the array is sorted and hence no swapping was performed
            if(swapped==false){
                return;
            }
        }
    }
}
