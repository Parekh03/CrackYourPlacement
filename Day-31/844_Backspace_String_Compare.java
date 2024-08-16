class Solution {
    public boolean backspaceCompare(String s, String t) {
        StringBuilder s_new = new StringBuilder();
        StringBuilder t_new = new StringBuilder();
        
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)=='#'){
                if(s_new.length()>0){
                    s_new.deleteCharAt(s_new.length()-1);
                }
            }
            else{
                s_new.append(s.charAt(i));
            }
        }

        for(int i=0; i<t.length(); i++){
            if(t.charAt(i)=='#'){
                if(t_new.length()>0){
                    t_new.deleteCharAt(t_new.length()-1);
                }
            }
            else{
                t_new.append(t.charAt(i));
            }
        }

        return s_new.compareTo(t_new)==0;

    }
}
