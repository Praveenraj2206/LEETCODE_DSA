class Solution 
{
    public int captureForts(int[] forts) 
    {
        int prev = -1;
        int result = 0;
        for (int i = 0; i < forts.length; i++) 
        {
            if (forts[i] != 0) {
                if (prev != -1 && forts[i] != forts[prev]) 
                    result = Math.max(result, i - prev - 1);
                prev = i;
            }
        }

        return result;
    }
}