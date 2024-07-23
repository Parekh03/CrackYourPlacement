class Solution {
    public String intToRoman(int num) {
        String[] symbol = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        int[] value = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};

        int n = num;
        StringBuilder sb = new StringBuilder();

        while(n>0){
            for(int i=0; i<value.length; i++){
                int count = n/value[i];
                for(int j=0; j<count; j++){
                    sb.append(symbol[i]);
                }
                n = n%value[i];
            }
        }
        return sb.toString();

    }
}
