class Solution 
{
    public void sortColors(int[] arr) 
    {
        int pointer = 0;
        for(int value = 0; value <= 2; value++)
        {
            for(int j = 0; j < arr.length; j++)
            {
                if(arr[j] == value)
                {
                    int temp = arr[pointer];
                    arr[pointer] = arr[j];
                    arr[j] = temp;
                    pointer++;
                }
            }
        }
    }
}