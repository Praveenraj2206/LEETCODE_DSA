class Solution 
{
    public int[] twoSum(int[] numbers, int target) 
    {
        int start=0;
        int n=numbers.length;
        int end=n-1;
        int[] ans=new int[2];
        while(start<end)
        {
            if((numbers[start]+numbers[end]) > target)
                end--;
            else if((numbers[start]+numbers[end]) < target)
                start++;
            else
            {
                ans[0]=start+1;
                ans[1]=end+1;
                return ans;
            }
        }
        return ans;
    }
}