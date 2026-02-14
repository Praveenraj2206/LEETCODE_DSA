class Solution(object):
    def singleNumber(self, nums):
        count=Counter(nums)
        for num in nums:
            if(count[num])==1:
                return num