class Solution {
    public String intToRoman(int num) {
        List<Pair<String, Integer>> map = new ArrayList<>();

        map.add(new Pair<>("I",1));
        map.add(new Pair<>("IV",4));
        map.add(new Pair<>("V",5));
        map.add(new Pair<>("IX",9));
        map.add(new Pair<>("X",10));
        map.add(new Pair<>("XL",40));
        map.add(new Pair<>("L",50));
        map.add(new Pair<>("XC",90));
        map.add(new Pair<>("C",100));
        map.add(new Pair<>("CD",400));
        map.add(new Pair<>("D",500));
        map.add(new Pair<>("CM",900));
        map.add(new Pair<>("M",1000));

        int curr = num;
        String ans = "";
        for(int i=map.size()-1; i>=0; i--){
            int value = map.get(i).getValue();
            String symbol = map.get(i).getKey();
            while(curr>=value){
                ans+=symbol;
                curr = curr - value;
            }
        }

        return ans;
        
    }
}
