class Solution 
{
    public int[] twoSum(int[] nums, int target) 
    {
        Map<Integer,Integer> map= new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            int compliemt=target-nums[i];
            if(map.containsKey(compliemt))
                return new int[] {map.get(compliemt),i};
            else
                map.put(nums[i],i);
        }
        throw new IllegalArgumentException("NO MATCH");
    }
}
