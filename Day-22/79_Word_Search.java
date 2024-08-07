class Solution {
    public boolean search(char[][] board, String word, int i, int j, int k){
        // base conditions
        if(k==word.length()){
            return true;
        }

        if(i<0 || i>=board.length || j<0 || j>=board[0].length || board[i][j]=='.' || board[i][j]!=word.charAt(k))
            return false;

        char temp = board[i][j];
        board[i][j] = '.';

        if(search(board, word, i, j-1, k+1) || search(board, word, i-1, j, k+1) || search(board, word, i, j+1, k+1) || search(board, word, i+1, j, k+1))
            return true;
        
        board[i][j] = temp;
        return false;
    }
    public boolean exist(char[][] board, String word) {
        int rows = board.length;
        int cols = board[0].length;
        boolean result = false;

        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                if(board[i][j]==word.charAt(0)){
                    result = search(board, word, i, j, 0);
                    if(result)
                        return true;
                }
            }
        }
        return false;
    }
}
