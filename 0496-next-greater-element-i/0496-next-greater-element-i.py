class Solution:
    def nextGreaterElement(self, nums1, nums2):
        stack = []
        nextGreater = {}

        for num in nums2:
            while stack and stack[-1] < num:
                nextGreater[stack.pop()] = num
            stack.append(num)

        # Remaining elements have no next greater
        while stack:
            nextGreater[stack.pop()] = -1

        # Build result for nums1
        return [nextGreater[num] for num in nums1]