class Solution(object):
    def intersect(self, nums1, nums2):
        counter = Counter(nums1)
        result=[]
        for num in nums2:
            if num in counter and counter[num]>0:
                result.append(num)
                counter[num] -= 1
        
        return result