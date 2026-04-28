class Solution 
{
    public int removeElement(int[] nums, int val) 
    {
        int i = nums.length - 1;
        int j = 0;
        while (j <= i) 
        {
            if (nums[j] == val) 
            {
                nums[j] = nums[i];
                i--;
            } 
            else
                j++;
        }
        return i + 1;
    }
}