import java.util.*;
public class Solution {
    public static List< Integer > superiorElements(int []a) {
        // Write your code here.
        List<Integer> ans = new ArrayList<>();
        int n = a.length;
        ans.add(a[n-1]);
        int maxEle = a[n-1];

        for(int i = n-2; i>=0; i--){
            if(a[i]>maxEle){
                ans.add(a[i]);
                maxEle = a[i];
            }
        }

        return ans;
    }
}
