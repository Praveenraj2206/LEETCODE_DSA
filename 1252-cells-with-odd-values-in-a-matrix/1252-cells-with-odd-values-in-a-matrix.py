class Solution(object):
    def oddCells(self, m, n, indices):
        count = 0
        row_count = [0] * m
        col_count = [0] * n
        for r, c in indices:
            row_count[r] += 1
            col_count[c] += 1
        for i in range(m):
            for j in range(n):
                if (row_count[i] + col_count[j]) % 2 != 0:
                    count += 1
        return count