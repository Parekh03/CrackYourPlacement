class Solution {
    public void reverseString(StringBuilder s){
        int p1 = 0, p2 = s.length()-1;

        while(p1<p2){
            char frontchar = s.charAt(p1);
            char backchar = s.charAt(p2);

            s.setCharAt(p1,backchar);
            s.setCharAt(p2,frontchar);

            p1++;
            p2--;
        }
    }
    public String addBinary(String a, String b) {
        int p1 = a.length()-1, p2 = b.length() -1 ;
        int carry = 0;

        StringBuilder ans = new StringBuilder();


        while(p1>=0 || p2>=0){
            int sum = 0;
            if(p1>=0)
                sum+= a.charAt(p1) - '0';
            if(p2>=0)
                sum+=b.charAt(p2) - '0';

            sum+=carry;

            ans.append(sum%2);

            carry = sum/2;

            p1--;
            p2--;
        }

        if(carry!=0){
            ans.append(carry);
        }

        reverseString(ans);

        return ans.toString();
    }
}
