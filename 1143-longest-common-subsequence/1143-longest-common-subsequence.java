class Solution 
{
    public int longestCommonSubsequence(String s1, String s2) 
    {
        int m=s1.length();
        int n=s2.length();
        int[][] dp=new int[m+1][n+1];
        for(int row=0;row<=m;row++)
            dp[row][0]=0;
        for(int col=0;col<=n;col++)
            dp[0][col]=0;
        for(int i=1;i<m+1;i++)
        {
            for(int j=1;j<n+1;j++)
            {
                if(s1.charAt(i-1) == s2.charAt(j-1))
                    dp[i][j] = 1+dp[i-1][j-1];
                else
                    dp[i][j] = Math.max(dp[i-1][j],dp[i][j-1]);
            }
        }
        return dp[m][n];
    }
}


// class Solution 
// {
//     int m,n;
//     int[][] matrix;
//     public int longestCommonSubsequence(String s1, String s2) 
//     {
//         m=s1.length();
//         n=s2.length();
//         matrix=new int[m][n];
//         for(int[] row:matrix)
//             Arrays.fill(row,-1);
//         return function(s1,s2,0,0);
//     }
//     public int function(String s1, String s2,int i, int j)
//     {
//         if(i>=m || j>=n)
//             return 0;
//         if(matrix[i][j] != -1)
//             return matrix[i][j];
//         if(s1.charAt(i) == s2.charAt(j))
//             return matrix[i][j] = 1+function(s1,s2,i+1,j+1);
//         else
//             return Math.max(function(s1,s2,i,j+1),function(s1,s2,i+1,j));    
//     }
// }



// class Solution 
// {
//     public int longestCommonSubsequence(String s1, String s2) 
//     {
//         return function(s1,s2,0,0);
//     }
//     public int function(String s1, String s2,int i, int j)
//     {
//         if(i == s1.length() || j == s2.length())
//             return 0;
//         if(s1.charAt(i) == s2.charAt(j))
//             return 1+function(s1,s2,i+1,j+1);
//         else
//             return Math.max(function(s1,s2,i,j+1),function(s1,s2,i+1,j));    
//     }
// }