class Solution
{
    //Function to find the smallest positive number missing from the array.
    static int missingNumber(int arr[], int size)
    {
        // Your code here
        Arrays.sort(arr);
        
        int fp = -1;
        
        for(int i=0; i<size; i++){
            if(arr[i]>0){
                fp = i;
                break;
            }
        }
        
        if(fp==-1)
            return 1;
            
        int[] mark = new int[arr[size-1]+1];
        
        for(int i=fp; i<size; i++){
            mark[arr[i]] = 1;
        }
        
        for(int i=1; i<mark.length; i++){
            if(mark[i]==0)
                return i;
        }
        
        return arr[size-1]+1;
    
    }
        
}
