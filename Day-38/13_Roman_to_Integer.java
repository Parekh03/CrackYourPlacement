class Solution {
    public int romanToInt(String s) {
        Map<Character, Integer> m = new HashMap<>();
        
        m.put('I', 1);
        m.put('V', 5);
        m.put('X', 10);
        m.put('L', 50);
        m.put('C', 100);
        m.put('D', 500);
        m.put('M', 1000);

        int res = 0;

        for(int i=0; i<s.length(); i++){
            
            char currchar = s.charAt(i);
            int currval = m.get(currchar);

            if(i+1 < s.length() && currval<m.get(s.charAt(i+1))){
                res-=currval;
            }
            else{
                res+=currval;
            }
        }

        return res;
        
    }
}
