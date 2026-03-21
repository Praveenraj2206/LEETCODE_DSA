class Solution 
{
    public int findDuplicate(int[] nums) 
    {
        int i=0;
        while(i<nums.length)
        {
            if(nums[i] != i+1)
            {
                int correct = nums[i]-1;
                if(nums[i] != nums[correct])
                    swap(nums, i, correct);
                else
                    return nums[i];
            }
            else
                i++;
        }
        return -1;
    }
    
    public void swap(int[] nums,int first,int second)
    {
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }
}

// public int findDuplicate(int[] nums) 
//     {
//         int i=0;
//         while(i<nums.length)
//         {
//             int correct = nums[i]-1;
//             if(nums[i] != nums[correct])
//                 swap(nums, i, correct);
//             else
//                 i++;
//         }
//         for(int j=0;j<nums.length;j++)
//         {
//             if(nums[j] != j+1)
//                 return nums[j];
//         }
//         return nums.length-1;
//     }