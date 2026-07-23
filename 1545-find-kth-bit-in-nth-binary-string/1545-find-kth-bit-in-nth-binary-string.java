class Solution 
{
    public char findKthBit(int n, int k) 
    {
        String[] S = new String[n+1];
        S[1]="0";
        for(int i=2;i<=n;i++)
        {
            S[i]=S[i-1] + "1" + reverse(invert(S[i-1]));
        }
        char ans = S[n].charAt(k-1);
        return ans; 
    }
    public String invert(String inv)
    {
        char[] arr= inv.toCharArray();
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i] == '1')
                arr[i] = '0';
            else
                arr[i] = '1';
        }
        return new String(arr);
    }
    public String reverse(String str)
    {
        char[] arr= str.toCharArray();
        int l=0,r=arr.length-1;
        while(l<r)
        {
            char temp=arr[l];
            arr[l] = arr[r];
            arr[r] = temp;
            l++;
            r--;
        }
        return new String(arr);
    }
}