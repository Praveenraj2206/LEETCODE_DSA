class Solution 
{
    public int climbStairs(int n) 
    {
        if(n==1)
            return 1;
        int a=1;
        int b=2;
        for(int i=2;i<n;i++)
        {
            int temp = a+b;
            a = b;
            b = temp;
        }
        return b;
    }
}


// class Solution 
// {
//     public int climbStairs(int n) 
//     {
//         if (n <= 2)
//             return n;
            
//         int a=1,b=2;
//         for(int i=3;i<n+1;i++)
//         {
//             int temp = b;
//             b = a + b;
//             a = temp;
//         }
//         return b;
//     }
// }

// class Solution 
// {
//     public int climbStairs(int n) 
//     {
//         if(n==0 || n==1)
//             return 1;
//         return climbStairs(n-1) + climbStairs(n-2);
//     }
// }