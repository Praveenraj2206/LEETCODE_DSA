class Solution 
{
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) 
    {
        int MaxVal = candies[0]; 
        for(int i=1;i<candies.length;i++)
        {
            if(candies[i]>MaxVal)
            {
                MaxVal = candies[i];
            }
        }
        ArrayList<Boolean>list = new ArrayList<>();
        for(int i=0;i<candies.length;i++)
        {
            if(candies[i] + extraCandies >= MaxVal)
            {
                list.add(true);
            }
            else
            {
                list.add(false);
            }
        }
        return list;
    }
}