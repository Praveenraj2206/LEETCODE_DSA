class Solution:
    def hammingDistance(self,x,y):
        count = 0
        while x != 0 or y != 0:
            res = x ^ y
            if (res & 1) == 1:
                count += 1
            x = x >> 1
            y = y >> 1
        return count