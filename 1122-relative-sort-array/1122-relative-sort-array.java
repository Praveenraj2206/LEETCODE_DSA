class Solution 
{
    public int[] relativeSortArray(int[] arr1, int[] arr2) 
    {
        int max=0;
        int n=arr1.length;
        int m=arr2.length;
        for(int i=0;i<n;i++)
            max=Math.max(max,arr1[i]);

        int[] countArr = new int[max+1];
        for(int i=0;i<n;i++)
        {
            int element = arr1[i];
            countArr[element]++;
        }

        int[] res = new int[n];
        int j=0;
        for(int i=0;i<m;i++)
        {
            int element = arr2[i];
            while(countArr[element]>0)
            {
                res[j] = element;
                j++;
                countArr[element]--;
            }
        }
        for(int i=0;i<max+1;i++)
        {
            while(countArr[i]>0)
            {
                res[j] = i;
                j++;
                countArr[i]--;
            }
        }
        return res;
    }
}