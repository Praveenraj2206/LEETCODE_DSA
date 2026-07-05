class Solution 
{
    public int strStr(String haystack, String needle) 
    {
        if(needle.isEmpty())
            return 0;
        for(int i=0; i<= haystack.length() - needle.length(); i++)
        {
            if(haystack.startsWith(needle,i))
                return i;
        }
        return -1;
    }
}


// class Solution 
// {
//     public int strStr(String haystack, String needle) 
//     {
//         int n = haystack.length();
//         int m = needle.length();
//         char ch2 = needle.charAt(0);
//         for (int i = 0; i <= n - m; i++) 
//         {
//             char ch1 = haystack.charAt(i);
//             if (ch1 == ch2) 
//             {
//                 if (m == 1)
//                     return i;
//                 int n1 = i + 1;
//                 int m1 = 1;
//                 int res = i;
//                 while (m1 < m && n1 < n) 
//                 {
//                     if (haystack.charAt(n1) == needle.charAt(m1)) 
//                     {
//                         n1++;
//                         m1++;
//                     } 
//                     else
//                         break;
//                 }
//                 if (m1 == m)
//                     return res;
//             }
//         }
//         return -1;
//     }
// }