class Solution 
{
    public int numOfSubarrays(int[] arr) 
    {
        int MOD=1000000007;
        int count = 0,sum = 0,odd = 0,even = 1;
        for(int num : arr)
        {
            sum+=num;
            if(sum%2 != 0)
            {
                count = (count+even)%MOD;
                odd++;
            }
            else
            {
                count = (count+odd)%MOD;
                even++; 
            }
        }
        return count;
    }
}

// ===========================================================================================
// class Solution 
// {
//     public int numOfSubarrays(int[] arr) 
//     {
//         int n=arr.length;
//         int count=0;
//         int MOD=1000000007;
//         for(int i=0;i<n;i++)
//         {
//             int sum=0;
//             for(int j=i;j<n;j++)
//             {
//                 sum +=arr[j];
//                 if(sum%2 != 0)
//                     count = (count+1)%MOD;
//             }
//         }
//         return count;
//     }
// }