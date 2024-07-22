class Solution {
    public String makeComparisons(String common, String str){
        int i=0, j=0;

        while(i<common.length() && j<str.length()){
            if(common.charAt(i)!=str.charAt(j)){
                break;
            }
            i++;
            j++;
        }
        common = common.substring(0,i);
        return common;
    }
    public String longestCommonPrefix(String[] strs) {
        String common = strs[0];
        
        
        for(int i=1; i<strs.length; i++){
            common = makeComparisons(common, strs[i]);
        }

        return common;
        
    }
}
