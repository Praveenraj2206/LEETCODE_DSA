class Solution(object):
    def isPalindrome(self, x):
        if x<0 or (x!=0 and x%10==0):
            return False
        y=0
        num=x
        while num!=0:
            y = y*10 + num%10
            num = num/10
        return y==x
            
        