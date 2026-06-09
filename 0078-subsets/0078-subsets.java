class Solution 
{
    List<List<Integer>> list = new ArrayList<>();
    public List<List<Integer>> subsets(int[] nums) 
    {
        findSubset(nums,0,new ArrayList<>());
        return list;
    }
    public void findSubset(int[] nums,int index,List<Integer> sublist)
    {
        if(index==nums.length)
        {
            list.add(new ArrayList<>(sublist));
            return;
        }

        sublist.add(nums[index]);
        findSubset(nums,index+1,sublist);
        sublist.remove(sublist.size()-1);
        findSubset(nums,index+1,sublist);

    }
}