class Solution 
{
    public List<List<Integer>> list=new ArrayList<>();
    public List<List<Integer>> permute(int[] nums) 
    {
        solve(new ArrayList<>(),nums,0);
        return list;
    }
    public void solve(List<Integer> sublist,int[] nums,int index)
    {
        if(index==nums.length)
        {
            list.add(new ArrayList<>(sublist));
            return;
        }
        int num=nums[index];
        for(int i=0;i<=sublist.size();i++)
        {
            List<Integer> temp = new ArrayList<>(sublist);
            temp.add(i, num);
            solve(temp, nums, index + 1);
        }
    }
}