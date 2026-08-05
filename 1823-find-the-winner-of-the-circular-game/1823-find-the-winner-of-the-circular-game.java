class Solution 
{
    public int findTheWinner(int n, int k) 
    {
        return solve(n,k)+1;
    }
    public static int solve(int n,int k)
    {
        if(n==1)
            return 0;
        return (solve(n-1,k)+k)%n;
    }
}



// class Solution 
// {
//     public int findTheWinner(int n, int k) 
//     {
//         int ans = 0;
//         for (int i = 1; i <= n; i++)
//             ans = (ans + k) % i;
//         return ans + 1;
//     }
// }




// class Solution 
// {
//     public int findTheWinner(int n, int k) 
//     {
//         List<Integer> list=new ArrayList<>();
//         for(int i = 1; i <= n; i++)
//             list.add(i);
//         int index=0;
//         while(list.size() > 1)
//         {
//             index = (index + k - 1) % list.size();
//             list.remove(index);
//         }
//         return list.get(0);
//     }
// }