class Solution 
{
    public int[][] generateMatrix(int n) 
    {
        int[][] matrix=new int[n][n];
        int value=1;
        int RS = 0, CS = 0, RE = n - 1, CE = n - 1;
        while (RS <= RE && CS <= CE) 
        {
            for (int j = CS; j <= CE; j++)
            {
                matrix[RS][j] = value;
                value++;
            }
            RS++;

            for (int i = RS; i <= RE; i++)
            {
                matrix[i][CE] = value;
                value++;
            }
            CE--;

            if (RS <= RE) 
            {
                for (int j = CE; j >= CS; j--)
                {
                    matrix[RE][j] = value;
                    value++;
                }
                RE--;
            }

            if (CS <= CE) {
                for (int i = RE; i >= RS; i--)
                {
                    matrix[i][CS] = value;
                    value++;
                }
                CS++;
            }
        }
        return matrix;
    }
}