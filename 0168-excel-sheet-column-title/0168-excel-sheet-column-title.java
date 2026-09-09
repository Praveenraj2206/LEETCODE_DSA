class Solution 
{
    public String convertToTitle(int columnNumber) 
    {
        StringBuilder ans=new StringBuilder();
        while(columnNumber > 0)
        {
            columnNumber--;
            int rem = columnNumber % 26;
            char ch = (char)(rem + 'A');
            ans.insert(0,ch);
            columnNumber /= 26;
        }
        return ans.toString();
    }
}