class Solution 
{
    public boolean isPalindrome(String s) 
    {
        String ans="";
        for (char c : s.toCharArray()) 
        {
            if (Character.isLetterOrDigit(c))
                ans += c;
            else
                continue;
        }
        ans = ans.strip();
        ans = ans.toLowerCase();

        int left=0,right=ans.length()-1;
        for(int i=0;i<ans.length()/2;i++)
        {
            if(ans.charAt(left) != ans.charAt(right))
                return false;
            left++;
            right--;
        }
        return true;

    }
}