class Solution 
{
    public int heightChecker(int[] heights) 
    {
        int[] freq = new int[101];

        for (int h : heights)
            freq[h]++;

        int count = 0;
        int i = 0;
        for (int h = 1; h <= 100; h++) 
        {
            while (freq[h] > 0) 
            {
                if (heights[i] != h)
                    count++;
                    
                i++;        
                freq[h]--; 
            }
        }
        return count;
    }
}