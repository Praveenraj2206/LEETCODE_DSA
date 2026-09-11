class Solution 
{
    public List<Integer> findMissingElements(int[] nums) 
    {
        List<Integer> list=new ArrayList<>();
        Set<Integer> set=new HashSet<>();
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        for(int num : nums)
        {
            set.add(num);
            if(num<min)
                min=num;
            if(num>max)
                max=num;
        }
        for(int i=min;i<max;i++)
        {
            if(!set.contains(i))
                list.add(i);
        } 
        return list;  
    }
}