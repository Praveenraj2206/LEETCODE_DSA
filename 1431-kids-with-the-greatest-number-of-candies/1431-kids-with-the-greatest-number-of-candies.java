class Solution 
{
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) 
    {
        int MaxVal = Arrays.stream(candies).max().getAsInt();
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