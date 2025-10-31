class Solution(object):
    def mySqrt(self,x):
        if x < 2:
            return x  

        L, R = 2, x // 2
        while L <= R:
            M = (L + R) // 2
            M_square = M * M

            if M_square == x:
                return M
            elif M_square < x:
                L = M + 1
            else:
                R = M - 1
        return R