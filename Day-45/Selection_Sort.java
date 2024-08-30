class Solution
{   
    // method which will find(select) the element which should be present at index i
	int  select(int arr[], int i)
	{
        // code here such that selectionSort() sorts arr[]
        
        int minEle = arr[i];
        int mini = i;
        for(int j=i; j<arr.length; j++){
            if(arr[j]<minEle){
                minEle = arr[j];
                mini = j;
            }
        }
        
        return mini;
	}
	
	void selectionSort(int arr[], int n)
	{
	    //code here
	    for(int i=0; i<n-1; i++){
	        int index = select(arr, i);
	        
	        int temp = arr[i];
	        arr[i] = arr[index];
	        arr[index] = temp;
	    }
	    
	}
}
