class Solution(object):
    def minimumIndex(self, capacity, itemSize):
        mini = float("inf")
        ans = -1
        for i in range(len(capacity)):
            if capacity[i] >= itemSize and capacity[i] < mini:
                mini = capacity[i]
                ans = i
        return ans