class Solution 
{
    public boolean isPalindrome(int x) 
    {
        if(x<0)
            return false;
        int y = x;
        int num=0;
        while(y>0)
        {
            num = 10 * num + (y%10);
            y /= 10;
        }
        return num == x;
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
