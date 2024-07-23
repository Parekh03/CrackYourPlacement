class Solution {
    public String reverseWords(String s) {
        Stack<String> st = new Stack<>();
        String temp = "";

        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)==' '){ // space
                if(temp.length()>0){
                    st.push(temp);
                    temp = "";
                }
                else{
                    continue;
                }
            }

            else{ // some character
                temp+=s.charAt(i);
            }
        }
        if(temp.length()>0)
            st.push(temp);

        String ans = "";
        while(!st.isEmpty()){
            if(st.size()==1){
                String word = st.pop();
                ans+=word;
            }
            else{
                String word = st.pop();
                ans+=word;
                ans+=' ';
            }

        }
        return ans;
    }
}
