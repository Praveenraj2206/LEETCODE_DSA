class Solution 
{
    public List<Integer> addToArrayForm(int[] num, int k) 
    {
        ArrayList<Integer> ans = new ArrayList<>();
        int i = num.length-1;
        int carry=0;
        while(i>=0 || k>0)
        {
            int sum = carry;
            if(i>=0)
            {
                sum += num[i--];
            }
            if(k>0)
            {
                sum += k%10;
                k /= 10;
            }
            ans.add(sum%10);
            carry = sum/10;
        }
        if(carry>0)
        {
            ans.add(carry);
        }
        Collections.reverse(ans);
        return ans;
    }
}