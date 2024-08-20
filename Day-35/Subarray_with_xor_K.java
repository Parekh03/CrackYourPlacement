public class Solution {
    public int solve(ArrayList<Integer> A, int B) {
        int totalXor = 0, count = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for(int i=0; i<A.size(); i++){
            totalXor = totalXor ^ A.get(i);
            
            if(totalXor==B){
                count++;
            }
            
            if(map.containsKey(totalXor^B)){
                count+=map.get(totalXor^B);
            }
            
            map.put(totalXor, map.getOrDefault(totalXor,0)+1);
            
        }
        
        return count;
    }
}
