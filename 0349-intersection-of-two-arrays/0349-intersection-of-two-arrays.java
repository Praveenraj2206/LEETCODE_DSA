class Solution 
{
    public int[] intersection(int[] nums1, int[] nums2) 
    {
        Set<Integer> set = new HashSet<>();
        List<Integer> res = new ArrayList<>();
        for(int num:nums2)
            set.add(num);
        for(int num:nums1)
        {
            if(set.contains(num))
            {
                res.add(num);
                set.remove(num);
            }
        }
        int[] ans=new int[res.size()];
        int i=0;
        for(int num:res)
            ans[i++]=num;
        return ans;
    }
}