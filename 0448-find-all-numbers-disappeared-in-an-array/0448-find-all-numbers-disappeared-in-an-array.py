class Solution(object):
    def findDisappearedNumbers(self, nums):
        flag = [0] * len(nums)
        ans=[]
        for i in nums:
            flag[i-1] = 1
        for i in range(0,len(nums)):
            if flag[i] == 0:
                ans.append(i+1)
        return ans