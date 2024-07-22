class Solution {
    public boolean checkOccurrence(String haystack, int start, String needle){
        int n = needle.length();

        if(haystack.length() - start  < n)
            return false;

        int i = start, j=0;
        while(j<n ){
            if(haystack.charAt(start)!=needle.charAt(j))
                return false;
            start++;
            j++;
        }
        return true;
    }
    public int strStr(String haystack, String needle) {
        if(needle.length()>haystack.length())
            return -1;

        for(int i=0; i<haystack.length(); i++){
            if(haystack.charAt(i)==needle.charAt(0)){
                if(checkOccurrence(haystack, i, needle))
                    return i;
                else
                    continue;
            }
        }

        return -1;
    }
}
