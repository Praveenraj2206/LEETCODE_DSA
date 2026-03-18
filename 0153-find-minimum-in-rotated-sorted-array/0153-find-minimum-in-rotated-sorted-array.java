class Solution 
{
    public int findMin(int[] nums) 
    {
        return binearySearch(nums,0,nums.length-1);
    }
    public int binearySearch(int[]nums,int start,int end)
    {
        if(start==end)
            return nums[start];
        int mid = start + (end-start) / 2;
        if(nums[mid] > nums[end])
            return binearySearch(nums,mid+1,end);
        else
            return binearySearch(nums,start,mid);
    }
}