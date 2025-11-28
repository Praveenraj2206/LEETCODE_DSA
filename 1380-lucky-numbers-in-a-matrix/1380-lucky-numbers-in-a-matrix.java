class Solution 
{
    public List<Integer> luckyNumbers(int[][] matrix) 
    {
        List<Integer> res=new ArrayList<>();
        int n=matrix.length;
        int m=matrix[0].length;
        int[] lowest=new int[n];
        int[] highest=new int[m];
        for(int i=0;i<n;i++)
        {
            int min=Integer.MAX_VALUE;
            for(int j=0;j<m;j++)
            {
                min=Math.min(min,matrix[i][j]);
            }
            lowest[i]=min;
        }
        for(int i=0;i<m;i++)
        {
            int max=Integer.MIN_VALUE;
            for(int j=0;j<n;j++)
            {
                max=Math.max(max,matrix[j][i]);
            }
            highest[i]=max;
        }
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                int curr=matrix[i][j];
                if(curr == lowest[i] && curr== highest[j])
                {
                    res.add(curr);
                }
            }
            
        }
        return res;
    }
}