class Solution {
    public String reverseWords(String s) {
        int ws = -1, we = -1;
        StringBuilder ans = new StringBuilder();

        for(int i=s.length()-1; i>=0; i--){
            char ch = s.charAt(i);

            if(ch!=' '){ // space
                if(we==-1){ 
                    we = i;
                    ws = i;
                }

                else{
                    ws = i;
                }
            }

            else{ // alphabet
                if(we!=-1){
                    for(int j=ws; j<=we; j++){
                        ans.append(s.charAt(j));
                    }
                    we = -1;
                    ws = -1;
                    ans.append(' ');
                }
            }
        }
        
        if(we!=-1){
            for(int i=ws; i<=we; i++){
                ans.append(s.charAt(i));
            }
        }

        if(ans.charAt(ans.length()-1)==' '){
            ans.deleteCharAt(ans.length()-1);
        }

        return ans.toString();
    }
}
