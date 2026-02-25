class Solution(object):
    def intersection(self, nums1, nums2):
        nums1 = set(nums1)
        result = []
        for num in nums2:
            if num in nums1:
                result.append(num)
                nums1.remove(num)
        return result

        # return list(set(nums1).intersection(set(nums2)))