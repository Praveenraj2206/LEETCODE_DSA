class Solution(object):
    def buildArray(self, nums):
        ans=[0]*len(nums)
        for i in range(0,len(nums)):
            ans[i]=nums[nums[i]]
        return ans