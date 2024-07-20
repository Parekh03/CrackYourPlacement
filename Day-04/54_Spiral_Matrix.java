class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int m = matrix.length; //rows
        int n = matrix[0].length; //columns

        int rs = 0, re = m-1;
        int cs = 0, ce = n-1;

        List<Integer> ans = new ArrayList<>();

        while(rs<=re && cs<=ce){
            for(int i=cs; i<=ce; i++){
                ans.add(matrix[rs][i]);
            }
            rs++;

            for(int i=rs; i<=re; i++){
                ans.add(matrix[i][ce]);
            }
            ce--;

            // first check is there any row left to traverse
            if(rs<=re){
                for(int i=ce; i>=cs; i--){
                    ans.add(matrix[re][i]);
                }
                re--;
            }

            // first check if there is any col left to traverse
            if(cs<=ce){
                for(int i=re; i>=rs; i--){
                    ans.add(matrix[i][cs]);
                }
                cs++;
            }

        }
        return ans;
    }
}
