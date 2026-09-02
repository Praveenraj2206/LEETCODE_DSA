class Solution 
{
    public boolean validPalindrome(String s) 
    {
        int left = 0;
        int right = s.length() - 1;
        while (left < right) 
        {
            if (s.charAt(left) != s.charAt(right)) 
            {
                return isPalindrome(s, left + 1, right) || 
                       isPalindrome(s, left, right - 1);
            }
            left++;
            right--;
        }
        return true;
    }

    private boolean isPalindrome(String s, int left, int right) 
    {
        while (left < right) 
        {
            if (s.charAt(left) != s.charAt(right))
                return false;
            left++;
            right--;
        }
        return true;
    }
}




// class Solution 
// {
//     public boolean validPalindrome(String s) 
//     {
//         int left = 0;
//         int right = s.length() - 1;
//         while (left < right) 
//         {
//             if (s.charAt(left) != s.charAt(right)) 
//             {
//                 boolean skipLeft = true;
//                 int l = left + 1;
//                 int r = right;
//                 while (l < r) 
//                 {
//                     if (s.charAt(l) != s.charAt(r)) 
//                     {
//                         skipLeft = false;
//                         break;
//                     }
//                     l++;
//                     r--;
//                 }

//                 boolean skipRight = true;
//                 l = left;
//                 r = right - 1;
//                 while (l < r) 
//                 {
//                     if (s.charAt(l) != s.charAt(r)) 
//                     {
//                         skipRight = false;
//                         break;
//                     }
//                     l++;
//                     r--;
//                 }
//                 return skipLeft || skipRight;
//             }
//             left++;
//             right--;
//         }

//         return true;
//     }
// }