class Solution 
{
    public boolean backspaceCompare(String s, String t) 
    {
        return check(s).equals(check(t));
    }
    private String check(String str)
    {
        StringBuilder s=new StringBuilder(str);
        int i=0;
        while (i < s.length()) 
        { 
            if (s.charAt(i) == '#') 
            { 
                if (i > 0) 
                { 
                    s.deleteCharAt(i);
                    s.deleteCharAt(i - 1);
                    i--;
                } 
                else 
                    s.deleteCharAt(i);
            } 
            else 
                i++;
        }
        return s.toString();
    }
}