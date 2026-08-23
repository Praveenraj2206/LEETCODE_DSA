class Solution 
{
    public boolean isValid(String s) 
    {
        HashMap<Character,Character> map = new HashMap<>();
        Stack<Character> stack = new Stack<>();
        map.put(')', '(');
        map.put(']', '[');
        map.put('}', '{');
        for(char ch : s.toCharArray())
        {
            if(!map.containsKey(ch))
                stack.push(ch);
            else
            {
                if(stack.isEmpty() || stack.pop() != map.get(ch))
                    return false;
            }
        }
        return stack.isEmpty();
    }



    // public boolean isValid(String s) 
    // {
    //     Stack<Character> stack = new Stack<>();
    //     for(char ch : s.toCharArray())
    //     {
    //         if(ch == '(' || ch == '[' || ch == '{')
    //             stack.push(ch);
    //         else
    //         {
    //             if(stack.isEmpty())
    //                 return false;
    //             char item=stack.peek();
    //             if( (item == '(' && ch == ')') || 
    //                 (item == '{' && ch == '}') || 
    //                 (item == '[' && ch == ']'))
    //                 stack.pop();
    //             else
    //                 return false;
    //         }
    //     }
    //     return stack.isEmpty();
    // }
}