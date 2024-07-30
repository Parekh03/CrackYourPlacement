import java.util.*;
public class Solution {
    public static boolean isPossible(int[] stalls, int k, int distance){
        int count = 1;
        int pos = stalls[0];

        for(int i=1; i<stalls.length; i++){
            if(stalls[i]-pos>=distance){
                count++;
                pos = stalls[i];
            }
        }

        if(count>=k)
            return true;
        return false;

    }
    public static int aggressiveCows(int []stalls, int k) {
        //    Write your code here.
        Arrays.sort(stalls);
        int mind = 1;
        int maxd = Integer.MIN_VALUE;

        for(int i=0; i<stalls.length; i++){
            maxd = Math.max(maxd, stalls[i]);
        }

        int result = 1;
        int low = mind;
        int high = maxd;

        while(low<=high){
            int mid = low + (high-low)/2;

            if(isPossible(stalls, k , mid)){
                result = mid;
                low = mid+1;
            }

            else{
                high = mid-1;
            }
        }

        return result;
    }
}
