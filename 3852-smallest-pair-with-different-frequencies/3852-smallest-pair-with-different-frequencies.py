class Solution(object):
    def minDistinctFreqPair(self, nums):
        counter = Counter(nums)
        small = min(counter)
        freq = counter[small]

        for key in sorted(counter):
            if key != small and counter[key] != freq:
                return [small, key]

        return [-1, -1]