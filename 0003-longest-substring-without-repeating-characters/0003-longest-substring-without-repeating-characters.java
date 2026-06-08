class Solution 
{
    public int lengthOfLongestSubstring(String s) 
    {
        Set<Character> set=new HashSet<>();
        int n=s.length();
        int ws=0,curr=0,max=0;
        while(curr<n)
        {
            char c = s.charAt(curr);
            while(set.contains(c))
            {
                set.remove(s.charAt(ws));
                ws++;
            }
            set.add(c);
            max = Math.max(max,curr-ws+1);
            curr++;
        }
        return max;
    }
}