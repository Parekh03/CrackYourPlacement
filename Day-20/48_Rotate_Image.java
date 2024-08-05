class Solution {
    public void transpose(int[][] matrix, int rows, int cols){
        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                if(i>j){
                    int temp = matrix[i][j];
                    matrix[i][j] = matrix[j][i];
                    matrix[j][i] = temp;
                }
            }
        }
    }

    public void reverse(int[] row){
        int p1 = 0;
        int p2 = row.length-1;

        while(p1<p2){
            int temp = row[p1];
            row[p1] = row[p2];
            row[p2] = temp;
            p1++;
            p2--;
        }
    }
    public void rotate(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        transpose(matrix, rows, cols);
        
        for(int[] row : matrix){
            reverse(row);
        }

    }
}
