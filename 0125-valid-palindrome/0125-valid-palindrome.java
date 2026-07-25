class Solution 
{
    public boolean isPalindrome(String s) 
    {
        char[] arr= s.toCharArray();
        int l=0,r=arr.length-1;
        while(l<r)
        {
            if(!Character.isLetterOrDigit(arr[l]))
                l++;
            else if(!Character.isLetterOrDigit(arr[r]))
                r--;
            else if(Character.toLowerCase(arr[l]) != Character.toLowerCase(arr[r]))
                return false;
            else
            {
                l++;
                r--;
            }
        }
        return true;
    }
}