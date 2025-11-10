class Solution 
{
    public int oddCells(int m, int n, int[][] indices) 
    {
        int[][] matrix = new int[m][n];
        for (int row= 0;row<m;row++)
        {
            for (int col=0;col<n;col++)
            {
                matrix[row][col]=0;
            }
        }
        for (int i=0;i<indices.length;i++)
        {
            int row = indices[i][0];
            int col = indices[i][1];
            for (int c=0;c<n;c++)
            {
                matrix[row][c] += 1;
            }
            for (int r=0;r<m;r++)
            {
                matrix[r][col] += 1;
            }
        }
        
        int count = 0;
        for (int row = 0; row < m; row++) {
            for (int col = 0; col < n; col++) {
                if (matrix[row][col] % 2 != 0) {
                    count++;
                }
            }
        }
        
        return count;
    }
}