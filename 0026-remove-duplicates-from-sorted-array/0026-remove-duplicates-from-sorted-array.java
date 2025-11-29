class Solution 
{
    public int removeDuplicates(int[] nums) 
    {
        int k=0;
        int i=0;
        while(i<nums.length)
        {
            if(nums[k] != nums[i])
            {
                k++;
                nums[k] = nums[i];
            }
            i++;
        }
        return k+1;
    }
}