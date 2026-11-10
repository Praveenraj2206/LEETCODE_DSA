class Solution(object):
    def frequencySort(self, nums):
        freq = Counter(nums)
        nums.sort(key=lambda x:(freq[x],-x))
        return nums
        