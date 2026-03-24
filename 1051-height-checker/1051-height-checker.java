class Solution 
{
    public void countSort(int[] expected)
    {
        int[] count = new int[101];
        for (int num : expected)
            count[num]++;
        int j=0;
        for (int i = 1; i <= 100; i++) 
        {
            if(count[i] != 0)
            {
                while(count[i]>0)
                {
                    expected[j] = i;
                    j++;
                    count[i]--;
                }
            }
            if(j == expected.length)
                break;
        }
    }
    public int heightChecker(int[] heights) 
    {
        int[] expected = heights.clone();
        countSort(expected);
        int count=0;
        for(int i=0;i<expected.length;i++)
        {
            if(expected[i] != heights[i])
                count++;
        }
        return count;
    }
}