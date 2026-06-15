class Solution 
{
    public boolean isPalindrome(int x) 
    {
        if(x<0)
            return false;
        int temp = x, rev = 0;
        while(x > 0) 
        {
            rev = rev * 10 + x % 10;
            x /= 10;
        }
        return temp == rev;
    }
    
}





















// class Solution 
// {
//     public boolean isPalindrome(int x) 
//     {
//         if (x < 0 || (x % 10 == 0 && x != 0)) 
//         {
//             return false;
//         }
//         int reversedHalf = 0;
//         while (x > reversedHalf) 
//         {
//             reversedHalf = reversedHalf * 10 + x % 10;
//             x /= 10;
//         }
//         return x == reversedHalf || x == reversedHalf / 10;
//     }
// }
