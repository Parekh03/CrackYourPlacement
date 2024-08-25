class Solution {
    public boolean getDiff(int x, int y){
        // x should be greater number
        if(x<y){
            // swap x and y
            int temp = x;
            x = y;
            y = temp;
        }
        
        String xS = Integer.toString(x);
        String yS = Integer.toString(y);

        if(xS.equals(yS)){
            return true;
        }

        // add zeros in the beginning to the smaller number - y
        while(yS.length()<xS.length()){
            yS = '0' + yS;
        }

        // find the index of first diff and last diff
        int first = -1, last = -1;
        for(int i=0; i<xS.length(); i++){
            if(xS.charAt(i)!=yS.charAt(i)){
                if(first==-1){
                    first = i;
                    last = i;
                }
                else{
                    last = i;
                }
            }
        }

        // swap digit at first and last index of xS
        StringBuilder sbX = new StringBuilder(xS);
        char firstDigit = sbX.charAt(first);
        char lastDigit = sbX.charAt(last);

        sbX.setCharAt(first, lastDigit);
        sbX.setCharAt(last, firstDigit);
        
        xS = sbX.toString();

        return xS.equals(yS);
        
    }
    public int countPairs(int[] nums) {
        int n = nums.length;
        int count = 0;

        for(int i = 0; i<n ; i++){
            for(int j=i+1; j<n; j++){
                int x = nums[i];
                int y = nums[j];

                boolean check = getDiff(x, y);

                if(check==true){
                    count++;
                }
            }
        }

        return count;
    }
}
