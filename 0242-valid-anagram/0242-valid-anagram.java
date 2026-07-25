class Solution 
{
    public boolean isAnagram(String s, String t) 
    {
        if(s.length() != t.length())
            return false;
        int[] s1=new int[26];
        
        for(int i=0;i<s.length();i++)
        {
            s1[s.charAt(i) - 'a']++;
            s1[t.charAt(i) - 'a']--;
        }
        for(int i=0;i<26;i++)
        {
            if(s1[i] != 0)
                return false;
        }
        return true;
    }
}