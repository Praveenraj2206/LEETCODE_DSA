class Solution 
{
    public int fib(int n) 
    {
        if (n <= 1) 
            return n;
        int a = 0, b = 1;
        for (int i = 2; i <= n; i++) 
        {
            int temp = a + b;
            a = b;
            b = temp;
        }
        return b;
    }
}



// class Solution 
// {
//     int[] arr;
//     public int fib(int n) 
//     {
//         arr = new int[n+1];
//         return solve(n);
//     }
//     public int solve(int n)
//     {
//         if(n<=1)
//             return n;
//         return solve(n-1)+solve(n-2);
//     }
// }