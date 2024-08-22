import java.util.*;
public class Solution {
    public static int countSubStringsAtmostK(String S, int K){
        int count = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        
        int l = 0, r = 0;
        while(r < S.length()){
            int freq = map.getOrDefault(S.charAt(r), 0);
            map.put(S.charAt(r), freq+1);
            
            while(map.size()>K){
                map.put(S.charAt(l), map.get(S.charAt(l))-1);
                if(map.get(S.charAt(l))==0){
                    map.remove(S.charAt(l));
                }
                l++;
            }
            
            if(map.size()<=K)
                count+= (r-l+1);
                
            r++;
            
        }
        return count;
    }
    public static int countSubStrings(String str, int k) {
        // Write your code here.
        if(str.length()==0 || k<=0)
            return 0;

        return countSubStringsAtmostK(str, k) - countSubStringsAtmostK(str, k-1);
    }
}

