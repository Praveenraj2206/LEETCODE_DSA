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
                res.add(num);
                set.remove(num);
        }
        int[] arr = new int[res.size()];
        for(int i=0;i<res.size();i++)
            arr[i] = res.get(i);
        return arr;
    }
}