class Solution 
{
    public char findKthBit(int n, int k) 
    {
        int len=(int)Math.pow(2,n)-1;
        return solve(len,k);
    }
    public char solve(int len,int k)
    {
        if(len==1)
            return '0';
        int half=len/2;
        int mid=half+1;
        if(k == mid)
            return '1';
        else if(k<mid)
            return solve(half,k);
        else
        {
            char ans=solve(half,1+len-k);
            return (ans=='0')?'1':'0';
        }
    }
}







// class Solution 
// {
//     public char findKthBit(int n, int k) 
//     {
//         String[] S = new String[n+1];
//         S[1]="0";
//         for(int i=2;i<=n;i++)
//         {
//             S[i]=S[i-1] + "1" + reverse(invert(S[i-1]));
//         }
//         char ans = S[n].charAt(k-1);
//         return ans; 
//     }
//     public String invert(String inv)
//     {
//         char[] arr= inv.toCharArray();
//         for(int i=0;i<arr.length;i++)
//         {
//             if(arr[i] == '1')
//                 arr[i] = '0';
//             else
//                 arr[i] = '1';
//         }
//         return new String(arr);
//     }
//     public String reverse(String str)
//     {
//         char[] arr= str.toCharArray();
//         int l=0,r=arr.length-1;
//         while(l<r)
//         {
//             char temp=arr[l];
//             arr[l] = arr[r];
//             arr[r] = temp;
//             l++;
//             r--;
//         }
//         return new String(arr);
//     }
// }