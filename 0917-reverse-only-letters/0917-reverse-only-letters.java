class Solution 
{
    public String reverseOnlyLetters(String s) 
    {
        StringBuilder sb = new StringBuilder(s);
        int left = 0,right = s.length() - 1;
        while (left < right) 
        {
            char start = sb.charAt(left);
            char end = sb.charAt(right);
            if (!Character.isLetter(start))
                left++;
            else if (!Character.isLetter(end))
                right--;
            else 
            {
                sb.setCharAt(left, end);
                sb.setCharAt(right, start);
                left++;
                right--;
            }
        }
        return sb.toString();
    }
}