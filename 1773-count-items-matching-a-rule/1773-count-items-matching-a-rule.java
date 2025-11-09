class Solution 
{
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) 
    {
        int count = 0;
        if(ruleKey.equals("type"))
        {
            int j=0;
            for (int i = 0;i < items.size();i++)
            {
                if (items.get(i).get(j).equals(ruleValue))
                {
                    count++;
                }
            }
        }
        if(ruleKey.equals("color"))
        {
            int j=1;
            for (int i = 0;i < items.size();i++)
            {
                if (items.get(i).get(j).equals(ruleValue))
                {
                    count++;
                }
            }
        }
        if(ruleKey.equals("name"))
        {
            int j=2;
            for (int i = 0;i < items.size();i++)
            {
                if (items.get(i).get(j).equals(ruleValue))
                {
                    count++;
                }
            }
        }
        return count;
    }
}