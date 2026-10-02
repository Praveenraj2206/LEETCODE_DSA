class Solution 
{
    public String interpret(String command) 
    {
        StringBuilder ans = new StringBuilder();
        Stack<Character> stack = new Stack<>();
        int i=0;
        while(i<command.length())  
        {
            char ch = command.charAt(i);
            if(Character.isLetter(ch))
                ans.append(ch);
            else if(ch == '(')
            {
                i++;
                ch = command.charAt(i);
                if(ch == ')')
                    ans.append('o');
                else
                {
                    i += 2;
                    ans.append('a');
                    ans.append('l');
                }
            }
            i++;
        }
        return new String(ans);
    }
}