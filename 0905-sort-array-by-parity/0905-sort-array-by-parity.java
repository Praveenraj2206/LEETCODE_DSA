class Solution 
{
    public int[] sortArrayByParity(int[] nums) 
    {
        int i=0;
        for(int j=0;j<nums.length;j++)
        {
            if(nums[j]%2 == 0)
            {
                swap(nums,i,j);
                i++;
            }
        }
        return nums;
    }
    public void swap(int[] nums,int i, int j)
    {
        int temp=nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}