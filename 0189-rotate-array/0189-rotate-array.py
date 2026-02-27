class Solution(object):
    def rotate(self, nums, k):
        n = len(nums)
        k %= n   
        part = nums[-k:]
        nums[:] = part + nums[:-k]
        return nums