class Solution 
{
    public boolean findRotation(int[][] mat, int[][] target) 
    {
        if (mat.length != target.length) return false;

        for (int k = 0; k < 4; k++) 
        {
            if (Arrays.deepEquals(mat, target)) return true;
            int n = mat.length;
            int[][] output = new int[n][n];
            for(int i = 0; i < n; i++)
            {
                for(int j = 0; j < n; j++)
                {
                    output[j][i] = mat[i][j];
                }
            }
            for(int i = 0; i < n; i++)
            {
                int m = output[i].length;
                for(int j = 0; j < m / 2; j++)
                {
                    int temp = output[i][j];
                    output[i][j] = output[i][m - j - 1];
                    output[i][m - j - 1] = temp;
                }
            }
            mat = output;
        }
        return false;
    }
}
