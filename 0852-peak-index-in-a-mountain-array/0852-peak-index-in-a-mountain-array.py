class Solution(object):
    def peakIndexInMountainArray(self, arr):
        start,end=0,len(arr)-1
        while start < end:
            mid = start+(end-start)//2
            if arr[mid] > arr[mid+1]:
                end = mid
            else:
                start = mid + 1
        return start
        