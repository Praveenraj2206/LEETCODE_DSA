class Solution 
{
    public int[] sumZero(int n) 
    {
        int output[]=new int[n];
        int start=0;
        int end=n-1;
        while(start<end)
        {
            output[start] = -1*end;
            output[end] = end;
            start++;
            end--;
        }
        return output;
    }
}