class Solution(object):
    def isPowerOfFour(self, n):
        # if n <= 0:
        #     return False
        # while n % 4 == 0:
        #     n //= 4
        # return n == 1
        return n > 0 and (n & (n - 1)) == 0  and (n & 0x55555555) != 0

