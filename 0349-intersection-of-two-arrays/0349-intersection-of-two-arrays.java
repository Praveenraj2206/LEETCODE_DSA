class Solution 
{
    public int[] intersection(int[] nums1, int[] nums2) 
    {
        Set<Integer> set = new HashSet<>();
        Set<Integer> res = new HashSet<>();
        for(int num:nums2)
            set.add(num);
        for(int num:nums1)
        {
            if(set.contains(num))
                res.add(num);
        }
        int[] arr = res.stream().mapToInt(Integer::intValue).toArray();
        return arr;
    }
}