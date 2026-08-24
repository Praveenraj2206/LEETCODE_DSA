class Solution 
{
    // public int evalRPN(String[] tokens) 
    // {
    //     Stack<Integer> stack = new Stack<>();
    //     for(int i = 0; i < tokens.length; i++)
    //     {
    //         String val = tokens[i];
    //         if(!val.equals("+") && !val.equals("-") && !val.equals("*") && !val.equals("/"))
    //             stack.push(Integer.parseInt(val));
    //         else
    //         {
    //             if(stack.isEmpty())
    //                 return 0;
    //             int first = stack.pop();
    //             if(stack.isEmpty())
    //                 return 0;
    //             int second = stack.pop();
    //             switch(val)
    //             {
    //                 case "+":
    //                     int add = first + second;
    //                     stack.push(add);
    //                     break;

    //                 case "-":
    //                     int sub = second - first;
    //                     stack.push(sub);
    //                     break;

    //                 case "*":
    //                     int multi = first * second;
    //                     stack.push(multi);
    //                     break;

    //                 case "/":
    //                     if(first == 0)
    //                         return 0;

    //                     int div = second / first;
    //                     stack.push(div);
    //                     break;
    //             }
    //         }
    //     }
    //     if(stack.isEmpty())
    //         return 0;
    //     return stack.pop();
    // }


    public int evalRPN(String[] tokens) 
    {
        Stack<Integer> stack = new Stack<>();
        for (String val : tokens) 
        {
            switch (val) 
            {
                case "+":
                    int a = stack.pop();
                    int b = stack.pop();
                    stack.push(b + a);
                    break;

                case "-":
                    a = stack.pop();
                    b = stack.pop();
                    stack.push(b - a);
                    break;

                case "*":
                    a = stack.pop();
                    b = stack.pop();
                    stack.push(b * a);
                    break;

                case "/":
                    a = stack.pop();
                    b = stack.pop();
                    stack.push(b / a);
                    break;

                default:
                    stack.push(Integer.parseInt(val));
            }
        }
        return stack.pop();
    }
}