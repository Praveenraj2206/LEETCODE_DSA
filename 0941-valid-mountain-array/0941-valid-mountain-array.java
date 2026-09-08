class Solution 
{
    public boolean validMountainArray(int[] arr) 
    {
        if(arr.length<3)
            return false;
        int i=1;
        if(arr[i]<arr[i-1])
            return false;
        while(i<arr.length)
        {
            if(arr[i]==arr[i-1])
                return false;
            if(!(arr[i]>arr[i-1]))
                break;
            i++;
        }
        if(i==arr.length)
            return false;
        while(i<arr.length)
        {
            if(arr[i]==arr[i-1])
                return false;
            if(!(arr[i]<arr[i-1]))
                return false;
            i++;
        }
        return true;
    }
}