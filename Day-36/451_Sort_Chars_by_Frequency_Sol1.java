class compare implements Comparator<Pair<Character,Integer>>{
    public int compare(Pair<Character, Integer> p1, Pair<Character, Integer> p2){
        if(p1.getValue()>p2.getValue()){
            return -1;
        }
        else if(p1.getValue()<p2.getValue()){
            return 1;
        }
        return 0;
    }
}

class Solution {
    public String frequencySort(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        List<Pair<Character, Integer>> list = new ArrayList<>();
        String ans = "";

        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);

            int freq = map.getOrDefault(ch,0);
            map.put(ch,freq+1);
        }

        for(Map.Entry<Character, Integer> it : map.entrySet()){
            Pair<Character, Integer> temp = new Pair<>(it.getKey(), it.getValue());
            list.add(temp);
        }

        Collections.sort(list, new compare());

        for(Pair<Character, Integer> p : list){
            int freq = p.getValue();
            for(int i=0; i<freq; i++){
                ans+=p.getKey();
            }
        }
        return ans;
    }
}
