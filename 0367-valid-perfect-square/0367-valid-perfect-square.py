class Solution(object):
    def isPerfectSquare(self, num):
        if num<2: return True
        L,R=2,num
        while L<=R:
            mid=(L+R)//2
            square=mid * mid
            if num==square: return True
            elif square>num: R=mid-1
            else: L=mid+1
        return False
        