class Solution 
{
    public String removeDuplicates(String s) 
    {
        StringBuilder stack = new StringBuilder();
        for (char c : s.toCharArray()) 
        {
            int n = stack.length();
            if (n > 0 && stack.charAt(n - 1) == c) 
                stack.deleteCharAt(n - 1);
            else
                stack.append(c);
            }
        return stack.toString();
    }
}

// class Solution 
// {
//     public String removeDuplicates(String s) 
//     {
//         Stack<Character> stack = new Stack<>();
//         for (char c : s.toCharArray()) 
//         {
//             if (!stack.isEmpty() && stack.peek() == c)
//                 stack.pop();
//             else
//                 stack.push(c);
//         }
//         StringBuilder ans = new StringBuilder();
//         while (!stack.isEmpty())
//             ans.append(stack.pop());
//         return ans.reverse().toString();
//     }
// }