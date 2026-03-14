class Solution 
{
    public int firstUniqueEven(int[] nums) 
    {
        List<Integer> evens = new ArrayList<>();
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i] % 2 == 0)
                evens.add(nums[i]);
        }
        for(int i = 0; i < evens.size(); i++)
        {
            int count = 0;
            for(int j = 0; j < nums.length; j++) 
            {
                if(nums[j] == evens.get(i))
                    count++;
            }
            if(count == 1)
                return evens.get(i);
        }
        return -1;
    }
}