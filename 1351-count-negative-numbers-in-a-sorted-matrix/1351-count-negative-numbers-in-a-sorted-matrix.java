class Solution 
{
    public int countNegatives(int[][] grid) 
    {
        int count = 0;
        for (int r = 0; r < grid.length; r++)
        {
            int left = 0;
            int right = grid[r].length - 1;
            while (left < right)
            {
                int mid = left + (right - left) / 2;
                if (grid[r][mid] < 0)
                    right = mid;
                else
                    left = mid + 1;
            }
            if (grid[r][left] < 0)
                count += grid[r].length - left;
        }
        return count;
    }
}