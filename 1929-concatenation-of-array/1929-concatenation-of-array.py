class Solution(object):
    def getConcatenation(self, nums):
        ans=[0]*(len(nums)*2)
        for i in range(0,len(nums)):
            ans[i]=nums[i]
            ans[i+len(nums)]=nums[i]
        return ans
        