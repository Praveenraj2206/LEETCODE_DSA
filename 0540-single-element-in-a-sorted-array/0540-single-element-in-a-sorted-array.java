class Solution 
{
    public int singleNonDuplicate(int[] nums) 
    {
        return bs(nums, 0, nums.length - 1);
    }

    public int bs(int[] nums, int start, int end) 
    {
        if(start == end)
            return nums[start];
        int mid = (start + end) / 2;
        if(mid % 2 == 1)
            mid--;
        if(nums[mid] == nums[mid + 1])
            return bs(nums, mid + 2, end);
        else
            return bs(nums, start, mid);
    }
}