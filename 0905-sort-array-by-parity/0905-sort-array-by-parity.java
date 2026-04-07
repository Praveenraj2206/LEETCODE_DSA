class Solution 
{
    public int[] sortArrayByParity(int[] nums) 
    {
        int even = 0;
        for(int num : nums)
        {
            if(num%2 == 0)
                even++;
        }
        int odd=even;
        even = even -1;
        int[] arr = new int[nums.length];
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]%2 == 0)
            {
                arr[even--] = nums[i];
                // even--;
            }
            else
            {
                arr[odd++] = nums[i];
                // odd++;
            }
        }
        return arr;
    }
}