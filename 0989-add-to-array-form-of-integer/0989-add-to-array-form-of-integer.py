class Solution(object):
    def addToArrayForm(self, num, k):
        ans = []
        i = len(num)-1
        carry = 0
        while(i>=0 or k>0):
            sum = carry
            if i>=0:
                sum += num[i]
                i -= 1
            if k>0:
                sum += k%10
                k /= 10
            ans.append(sum%10)
            carry=sum/10

        if carry>0:
            ans.append(carry)
        ans = ans[::-1]
        return ans
        