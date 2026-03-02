class Solution(object):
    def checkIfExist(self, arr):
        for i in range(len(arr)):
            x = arr[i]
            for j in range(len(arr)):
                if x == arr[j]*2 and i!=j:
                    return True
        return False
        