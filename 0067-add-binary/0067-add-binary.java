class Solution 
{
    public String addBinary(String a, String b) 
    {
        StringBuilder ans = new StringBuilder();
        int carry=0;
        int sum=0;
        int n= a.length()-1;
        int m= b.length()-1;
        while(n>=0 || m>=0 || carry>0)
        {
            sum = carry;
            if(n>=0)
                sum += (a.charAt(n) == '1')?1:0;
            if(m>=0)
                sum += (b.charAt(m) == '1')?1:0;
            n--;
            m--;
            ans.append((sum%2 == 0)?'0':'1');
            carry = (sum>1)?1:0;
        }
        return ans.reverse().toString();
    }
}