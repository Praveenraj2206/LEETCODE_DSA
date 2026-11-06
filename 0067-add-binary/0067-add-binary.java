class Solution 
{
    public String addBinary(String a, String b) 
    {
        int n=a.length()-1;
        int m=b.length()-1;
        int sum=0;
        int carry=0;
        StringBuilder res=new StringBuilder();
        while(n>=0 || m>=0)
        {
            sum = carry;
            if(n>=0)
            {
                sum += a.charAt(n) - '0';
                n--;
            }
            if(m>=0)
            {
                sum += b.charAt(m) - '0';
                m--;
            }
            res.append((sum%2 == 0)?'0':'1');
            carry = (sum>1)?1:0;
        }
        if(carry==1)
        {
            res.append('1');
        }
        res.reverse();
        return res.toString();
    }
}