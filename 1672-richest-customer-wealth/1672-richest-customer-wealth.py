class Solution(object):
    def maximumWealth(self, accounts):
        maxi=0
        for x in accounts:
            if sum(x) > maxi:
                maxi = sum(x)
        return maxi
