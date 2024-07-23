class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        boolean valid = true;

        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);

            // opening 
            if(ch=='(' || ch=='{' || ch=='['){
                st.push(ch);
            }

            // closing
            else{
                if(st.isEmpty())
                    return false;
                char popped = st.pop();
                if((ch==')' && popped=='(') || (ch==']' && popped=='[') || (ch=='}' && popped=='{'))
                    continue;

                else{
                    return false;
                }
            }
            
        }
        return st.isEmpty();
    }
}
