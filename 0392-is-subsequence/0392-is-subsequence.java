class Solution 
{
    public boolean isSubsequence(String s, String t) 
    {
        int curr = 0;
        int move = 0;
        while (curr < s.length() && move < t.length())
        {
            if (s.charAt(curr) == t.charAt(move))
                curr++;
            move++;
        }
        return curr == s.length();
    }
}