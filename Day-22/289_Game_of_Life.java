class Solution {
    public int countLives(int[][] board, int i, int j){
        int count = 0;
        if(j>0 && board[i][j-1]==1) //left
            count++;
        if(j<board[0].length-1 && board[i][j+1]==1) // right
            count++;
        if(i>0 && board[i-1][j]==1) // up
            count++;
        if(i<board.length-1 && board[i+1][j]==1) // down
            count++;
        if(i>0 && j>0 && board[i-1][j-1]==1) // left up diagonal
            count++;
        if(i>0 && j<board[0].length-1 && board[i-1][j+1]==1) // right up diagonal
            count++;
        if(i<board.length-1 && j>0 && board[i+1][j-1]==1) // left down diagonal
            count++;
        if(i<board.length-1 && j<board[0].length-1 && board[i+1][j+1]==1) // right down diagonal
            count++;

        return count;
    }
    public void gameOfLife(int[][] board) {
        int rows = board.length;
        int cols = board[0].length;
        int[][] newBoard = new int[rows][cols];

        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                int count = countLives(board, i, j);
                if(board[i][j]==1){
                    if(count<2){
                        newBoard[i][j] = 0;
                    }
                    else if(count==2 || count==3){
                        newBoard[i][j] = 1;
                    }
                    else{
                        newBoard[i][j] = 0;
                    }
                }
                else{ // 0
                    if(count==3){
                        newBoard[i][j] = 1;
                    }
                    else{
                        newBoard[i][j] = 0;
                    }
                }
            }
        }

        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                board[i][j] = newBoard[i][j];
            }
        }
    }
}
