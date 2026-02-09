class Solution:
    def isPossibleToSplit(self, nums):
        freq = [0] * 101

        for num in nums:
            freq[num] += 1
            if freq[num] > 2:
                return False

        return True