def reverse(nums,left,right):
    while left < right:
        nums[left],nums[right] = nums[right],nums[left]
        left += 1
        right -= 1
class Solution(object):
    def rotate(self, nums, k):
        n = len(nums)
        k %= n   
        reverse(nums,0,n-1)
        reverse(nums,0,k-1)
        reverse(nums,k,n-1)
    
        # n = len(nums)
        # k %= n   
        # part = nums[-k:]
        # nums[:] = part + nums[:-k]
        # return nums
    