class Solution 
{
    public int[][] matrixReshape(int[][] mat, int r, int c) 
    {
        int[] flat=new int[r*c];
        int[][] output=new int[r][c];
        if( mat.length*mat[0].length != r*c)
        {
            return mat;
        }
        for(int i=0,x=0;i<mat.length;i++)
        {
            for(int j=0;j<mat[0].length;j++)
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