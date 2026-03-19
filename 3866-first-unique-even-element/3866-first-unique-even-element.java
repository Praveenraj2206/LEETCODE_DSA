class Solution 
{
    public int firstUniqueEven(int[] nums) 
    {
        int[] freq = new int[101];
        for (int num : nums) 
        {
            if (num % 2 == 0) 
                freq[num]++;
        }
        for (int num : nums) 
        {
            if (num % 2 == 0 && freq[num] == 1) 
                return num;
        }
        return -1;
    }
}