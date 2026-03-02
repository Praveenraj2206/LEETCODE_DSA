class Solution(object):
    def checkIfExist(self, arr):
        arr=sorted(arr)
        for i in range(len(arr)):
            x = arr[i]
            element = x*2
            start,end=0,len(arr)-1
            while start<=end:
                mid = start +(end-start)//2
                if arr[mid] == element and mid != i:
                    return True
                elif arr[mid] > element:
                    end = mid - 1
                else:
                    start = mid + 1
        return False
        