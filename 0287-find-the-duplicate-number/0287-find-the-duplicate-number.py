class Solution(object):
    def findDuplicate(self, nums):
        ans=[0]*len(nums)
        for i in nums:
            if ans[i] == 1:
                return i
            else:
                ans[i] = 1
        return 0