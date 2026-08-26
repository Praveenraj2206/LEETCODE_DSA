class Solution 
{
    public int[][] floodFill(int[][] image, int sr, int sc, int color) 
    {
        if(image[sr][sc] == color)
            return image;
        dfs(image,sr,sc,color,image[sr][sc]);
        return image;
    }
    public void dfs(int[][] board,int row,int col,int val,int original)
    {
        if(row > board.length-1 || col > board[0].length-1)
            return;
        if(board[row][col] != original)
            return;
        if(board[row][col] == val)
            return;
        board[row][col] = val;
        if(row<board.length-1)
            dfs(board,row+1,col,val,original);
        if(col<board[0].length-1)
            dfs(board,row,col+1,val,original);
        if(row>0)
            dfs(board,row-1,col,val,original);
        if(col>0)
            dfs(board,row,col-1,val,original);
        return;
    }
}