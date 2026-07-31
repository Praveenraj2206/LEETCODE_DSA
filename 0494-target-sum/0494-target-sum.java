class Solution 
{
    public static int count=0;
    public int findTargetSumWays(int[] nums, int target) 
    {
        solve(nums,target,0,0);
        int temp=count;
        count=0;
        return temp;
    }
    public void solve(int[] nums,int target,int index,int sum)
    {
        if(index==nums.length)
        {
            if(sum==target)
                count++;
            return;
        }
        solve(nums,target,index+1,sum+nums[index]);
        solve(nums,target,index+1,sum-nums[index]);
    }
}