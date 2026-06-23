class Solution 
{
    public String countAndSay(int n) 
    {
        if (n == 1) 
            return "1";
        String prev = countAndSay(n - 1);
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < prev.length(); i++) 
        {
            char ch = prev.charAt(i);
            int count = 1;
            while (i < prev.length() - 1 && prev.charAt(i) == prev.charAt(i + 1)) 
            {
                count++;
                i++;
            }
            sb.append(count);
            sb.append(ch);
        }

        return sb.toString();
    }
}