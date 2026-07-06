class Solution 
{
    public String reverseOnlyLetters(String s) 
    {
        char[] arr = s.toCharArray();
        int left = 0,right = arr.length - 1;
        while (left < right) 
        {
            if (Character.isLetter(arr[left])) 
            {
                if (Character.isLetter(arr[right])) 
                {
                    char temp = arr[left];
                    arr[left] = arr[right];
                    arr[right] = temp;
                    left++;
                    right--;
                } 
                else
                    right--;
            }
            else
                left++;
        }
        return new String(arr);
    }
}