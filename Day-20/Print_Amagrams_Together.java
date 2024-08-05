class Solution {
    public List<List<String>> Anagrams(String[] string_list) {
        // Code here
        HashMap<String, List<String>> map = new HashMap<>();
        
        for(int i=0; i<string_list.length; i++){
            String word = string_list[i];
            char[] charArr = word.toCharArray();
            Arrays.sort(charArr);
            
            String sortedWord = new String(charArr);
            
            if(map.containsKey(sortedWord)){
                List<String> temp = map.get(sortedWord);
                temp.add(word);
                map.put(sortedWord, temp);
            }
            else{
                List<String> temp = new ArrayList<>();
                temp.add(word);
                map.put(sortedWord, temp);
            }
        }
        
        List<List<String>> ans = new ArrayList<>();
        
        for(Map.Entry<String, List<String>> it : map.entrySet()){
            ans.add(it.getValue());
        }
        
        return ans;
    }
}
