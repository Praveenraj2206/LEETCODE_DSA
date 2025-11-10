class Solution(object):
    def oddCells(self, m, n, indices):
        matrix = [[0 for _ in range(n)] for _ in range(m)]
        count =0
        for i in range(len(indices)):
            row = indices[i][0]
            col = indices[i][1] 
            for j in range(n):
                matrix[row][j]+=1
            for k in range(m):
                matrix[k][col]+=1
        for i in range(m):
            for j in range(n):
                if matrix[i][j]%2!=0:
                    count +=1
        return count
        