class Solution 
{
    List<List<Integer>> list = new ArrayList<>();
    public List<List<Integer>> combinationSum(int[] candidates, int target) 
    {
        sum(candidates, target, 0, new ArrayList<>());
        return list;
    }

    public void sum(int[] candidates, int target, int index, List<Integer> sublist) 
    {
        if (target == 0) 
        {
            list.add(new ArrayList<>(sublist));
            return;
        }

        if (target < 0 || index == candidates.length) 
            return;

        // Take the current candidate
        sublist.add(candidates[index]);
        sum(candidates, target - candidates[index], index, sublist);
        sublist.remove(sublist.size() - 1);

        // Skip the current candidate
        sum(candidates, target, index + 1, sublist);
    }
}

// class Solution 
// {
//     List<List<Integer>> list=new ArrayList<>();
//     public List<List<Integer>> combinationSum(int[] candidates, int target) 
//     {
//         sum(candidates,target,0,new ArrayList<>(),0);
//         return list;
//     }
//     public void sum(int[] candidates,int target,int index,List<Integer> sublist,int sum_value)
//     {
//         if(sum_value == target)
//         {
//             list.add(new ArrayList<>(sublist));
//             return;
//         }
//         if(index == candidates.length)
//             return;
//         if(sum_value > target)
//             return;
//         sum_value += candidates[index];
//         sublist.add(candidates[index]);
//         sum(candidates,target,index,sublist,sum_value);
//         sum_value -= candidates[index];
//         sublist.remove(sublist.size()-1);
//         sum(candidates,target,index+1,sublist,sum_value);
//         return; 
//     }
// } 