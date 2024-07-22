class Solution {
    public boolean checkPalindrome(StringBuilder sb, int index){
        StringBuilder temp = new StringBuilder(sb);
        temp.deleteCharAt(index);

        int i=0, j=temp.length()-1;

        while(i<j){
            if(temp.charAt(i)!=temp.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
    }
    public boolean validPalindrome(String s) {
        boolean deleteChar = false;

        int i=0, j=s.length()-1;

        while(i<j){
            if(s.charAt(i)!=s.charAt(j)){
                StringBuilder sb = new StringBuilder(s);
                return (checkPalindrome(sb,i) || checkPalindrome(sb,j));
            }
            i++;
            j--;
        }

        return true;
        
    }
}
