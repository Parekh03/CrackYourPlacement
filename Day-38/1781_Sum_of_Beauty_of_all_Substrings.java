class Solution {
    public int beautySum(String s) {
        int sum = 0;

        for(int i=0; i<s.length(); i++){
            HashMap<Character, Integer> map = new HashMap<>();
            for(int j=i; j<s.length(); j++){
                char ch = s.charAt(j);
                int freq = map.getOrDefault(ch, 0);
                map.put(s.charAt(j), freq+1);

                if(map.size()<=1){
                    continue;
                }
                
                int max = Integer.MIN_VALUE;
                int min = Integer.MAX_VALUE;
                for(Map.Entry<Character, Integer> it : map.entrySet()){
                    max = Math.max(max, it.getValue());
                    min = Math.min(min, it.getValue());
                }

                sum+=(max-min);
            }
        }

        return sum;
    }
}
