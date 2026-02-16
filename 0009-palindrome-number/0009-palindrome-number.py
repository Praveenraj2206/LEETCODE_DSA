class Solution(object):
    def isPalindrome(self, x):
        if x < 0 or (x % 10 == 0 and x != 0):
            return False
        reversed_half = 0
        while x > reversed_half:
            reversed_half = reversed_half * 10 + x % 10
            x //= 10
        return x == reversed_half or x == reversed_half // 10
        # if x<0:return False
        # x=str(x)
        # l=0
        # r=len(x)-1
        # while l<r:
        #     if x[l] != x[r]:
        #         return False
        #     l += 1
        #     r -= 1
        # return True