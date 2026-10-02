class Solution 
{
    public String reversePrefix(String word, char ch) 
    {
        char[] arr = word.toCharArray();
        int i=0;
        while(i<word.length())
        {
            if(arr[i]==ch)
            {
                int j=0;
                while(j<i)
                {
                    char temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                    j++;
                    i--;
                }
                break;
            }
            i++;
        }
        
        return new String(arr);
    }
}