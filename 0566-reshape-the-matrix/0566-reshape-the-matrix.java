class Solution 
{
    public int[][] matrixReshape(int[][] mat, int r, int c) 
    {
        int row=mat.length;
        int col=mat[0].length;
        int[] flat=new int[r*c];
        int[][] output=new int[r][c];
        if( row*col != r*c)
        {
            return mat;
        }
        for(int i=0,x=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                flat[x]=mat[i][j];
                x++;
            }
        }
        
        for(int i=0,x=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                output[i][j]=flat[x];
                x++;
            }
        }
        return output;
    }
}