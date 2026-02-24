class Solution(object):
    def countNegatives(self, grid):
        count = 0
        for row in grid:
            left = 0
            right = len(row)-1
            while left < right:
                mid = (left + right)//2
                if row[mid] < 0:
                    right = mid
                else:
                    left = mid + 1
            if row[left] < 0:
                count += len(row) - left
        return count          