class Solution 
{
    public int missingNumber(int[] nums) 
    {
        cyclic(nums);
        int i=0;
        while(i<nums.length)
        {
            if(i != nums[i])
                return i;
            i++;
        }
        return i;
    }
    public void cyclic(int[] nums)
    {
        int i=0;
        while(i<nums.length)
        {
            int correct = nums[i];
            if(correct == nums.length)
            {
                i++;
                continue;
            }
            else if(nums[i] != nums[correct])
                swap(nums, i, correct);
            else
                i++;
        }
    }
    void swap(int[] nums,int first,int second)
    {
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }
}