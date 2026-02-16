class Solution(object):
    def shuffle(self, nums, n):
        ans=[]
        for i in range(0, len(nums)//2):
            ans.append(nums[i])
            ans.append(nums[i+n])
        return ans
        