class Solution 
{
    public boolean isValid(String s) 
    {
        Map<Character,Character> map = new HashMap<>();
        map.put('}','{');
        map.put(')','(');
        map.put(']','[');
        Stack<Character> stack=new Stack<>();
        for(char ch : s.toCharArray())
        {
            if(!map.containsKey(ch))
                stack.push(ch);
            else
            {
                if(stack.isEmpty() || map.get(ch) != stack.pop())
                    return false;
            }
        }
        return stack.isEmpty();
    }
}