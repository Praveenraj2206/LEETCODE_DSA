class Solution 
{
    public int accountBalanceAfterPurchase(int purchaseAmount) 
    {
        int rounded = ((purchaseAmount + 5)/10)*10;
        return 100-rounded;
    }
}