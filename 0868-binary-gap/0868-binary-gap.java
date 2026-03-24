class Solution 
{
    public int binaryGap(int n) 
    {
        String binary = Integer.toBinaryString(n);
        int last_position = -1;
        int max_gap = 0;

        for (int i = 0; i < binary.length(); i++) 
        {
            char bit = binary.charAt(i);
            if (bit == '1') 
            {
                if (last_position != -1)
                    max_gap = Math.max(max_gap, i - last_position);
                last_position = i;
            }
        }
        return max_gap;
    }
}