class Solution 
{
    public int singleNumber(int[] nums) 
    {
        int x=0;
        int y=0;
        for(int num : nums){
            x ^= (num & ~y);
            y ^= (num & ~x);
        }
        return x;
    }
}