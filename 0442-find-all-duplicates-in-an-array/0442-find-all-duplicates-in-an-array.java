class Solution 
{
    public List<Integer> findDuplicates(int[] nums) 
    {
        int j=0;
        while(j<nums.length)
        {
            int correct = nums[j]-1;
            if(nums[j] != nums[correct])
                swap(nums, j, correct);
            else
                j++;
        }
        List<Integer> list=new ArrayList<>();
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i] != i+1)
                list.add(nums[i]);
        }
        return list;
    }
    public void swap(int[] nums,int first,int second)
    {
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }
}