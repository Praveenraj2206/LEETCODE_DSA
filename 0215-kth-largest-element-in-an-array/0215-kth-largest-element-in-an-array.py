class Solution(object):
    def findKthLargest(self, nums, k):
        minheap = []
        for num in nums:
            heapq.heappush(minheap,num)
            if len(minheap)>k:
                heapq.heappop(minheap)
        return minheap[0]
        