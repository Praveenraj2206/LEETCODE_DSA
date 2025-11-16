import heapq
class Solution(object):
    def findKthLargest(self, nums, k):
        minheap = []
        for n in nums:
            heapq.heappush(minheap, n)
            if len(minheap) > k:
                heapq.heappop(minheap)  
        return minheap[0] 
        