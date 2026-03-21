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
        return nums.length;
    }
    public void cyclic(int[] nums)
    {
        int i=0;
        while(i<nums.length)
        {
            int correct = nums[i];
            if(nums[i]<nums.length && nums[i] != nums[correct])
                swap(nums, i, correct);
            else
                i++;
        }
    }
    public void swap(int[] nums,int first,int second)
    {
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }
}