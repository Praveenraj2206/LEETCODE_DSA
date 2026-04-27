class Solution 
{
    public List<Integer> findValidElements(int[] nums) 
    {
        List<Integer> list = new ArrayList<>();
        int n=nums.length;
        if(n==1)
        {
            list.add(nums[0]);
            return list;
        }
        int[] prefix = new int[n];
        int[] suffix = new int[n];
        
        prefix[0] = Integer.MIN_VALUE;
        for(int i=1;i<n;i++)
            prefix[i]=Math.max(nums[i-1],prefix[i-1]);
            
        suffix[0] = Integer.MAX_VALUE;
        for(int i=n-2;i>=0;i--)
            suffix[i]=Math.max(nums[i+1],suffix[i+1]);

        for(int i=0;i<n;i++)
        {
            if(nums[i] > suffix[i] || nums[i] >prefix[i])
                list.add(nums[i]);
        }
        return list;
    }
}