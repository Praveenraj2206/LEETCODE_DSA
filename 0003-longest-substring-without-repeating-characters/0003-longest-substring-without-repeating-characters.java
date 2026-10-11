class Solution 
{
    public int lengthOfLongestSubstring(String s) 
    {
        HashSet<Character> set=new HashSet<>();
        int curr = 0,ws = 0;
        int n = s.length();
        int max=0;
        while(curr<n)
        {
            char ch = s.charAt(curr);
            while(set.contains(ch))
            {
                set.remove(s.charAt(ws));
                ws++;
            }
            set.add(ch);
            max = Math.max(max,curr-ws+1);
            curr++;
        }
        return max;
    }
}