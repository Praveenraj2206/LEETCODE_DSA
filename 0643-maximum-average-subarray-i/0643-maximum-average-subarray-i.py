class Solution(object):
    def findMaxAverage(self, nums, k):
        curr_sum = sum(nums[:k])
        max_sum = curr_sum

        l = 1
        r = k

        while r < len(nums):
            curr_sum = curr_sum - nums[l-1] + nums[r]
            max_sum = max(max_sum, curr_sum)
            l += 1
            r += 1

        return max_sum / float(k)
