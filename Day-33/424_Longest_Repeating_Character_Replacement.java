class Solution {
    public int characterReplacement(String s, int k) {
        HashMap<Character, Integer> map = new HashMap<>();
        int maxlen = 0, maxf = 0, l=0, r = 0, n=s.length();

        while(r<n){
            int freq = map.getOrDefault(s.charAt(r), 0);
            map.put(s.charAt(r), freq+1);
            maxf = Math.max(maxf, map.get(s.charAt(r)));

            while((r-l+1)-maxf > k){
                map.put(s.charAt(l), map.get(s.charAt(l))-1);

                for(Map.Entry<Character, Integer> it : map.entrySet()){
                    maxf = Math.max(maxf, it.getValue());
                }

                l++;
            }

            if((r-l+1)-maxf <= k){
                maxlen = Math.max(maxlen, r-l+1);
            }

            r++;
        }

        return maxlen;
        
    }
}
