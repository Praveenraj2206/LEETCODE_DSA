class Solution 
{
    public int kthGrammar(int n, int k) 
    {
        if (n == 1)
            return 0;

        int len = 1 << (n - 1);
        int half = len/2;

        if (k <= half)
            return kthGrammar(n-1, k);
        else
            return 1 - kthGrammar(n - 1, k - half);
        // else
        //     return flip(kthGrammar(n-1, k-half));
        
    }
}
    // private int flip(int x) 
    // {
    //     return x == 0 ? 1 : 0;
    // }