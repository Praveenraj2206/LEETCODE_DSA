class Solution(object):
    def runningSum(self, nums):
        sum=0
        ans=[]
        for i in range(0,len(nums)):
            sum += nums[i]
            ans.append(sum)
        return ans