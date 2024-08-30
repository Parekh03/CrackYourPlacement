class Solution
{
  
  //Function to sort the array using insertion sort algorithm.
  public void insertionSort(int arr[], int n)
  {
    
      //start from the second element. Since first element can be considered as a sorted left half
      for(int i=1; i<n; i++){
          int j = i;
          // insert the element arr[i] at the correct position in the left half
          while(j>0 && arr[j-1]>arr[j]){
              int temp = arr[j];
              arr[j] = arr[j-1];
              arr[j-1] = temp;
              
              j--;
          }
      }
  }
}
