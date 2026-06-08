class Solution 
{
    public int lengthOfLongestSubstring(String s) 
    {
        Map<Character,Integer> map=new HashMap<>();
        int n=s.length(),ws=0,curr=0,max=0;
        while(curr<n)
        {
            char c = s.charAt(curr);
            while(map.containsKey(c) && map.get(c)>=ws)
                ws = map.get(c)+1;

            map.put(c,curr);
            max = Math.max(max,curr-ws+1);
            curr++;
        }
        return max;
    }
}