class Solution(object):
    def twoSum(self, nums, target):
        dict1={}
        for key,value in enumerate(nums):
            diff=target-value
            if diff in dict1:
                return [dict1[diff],key]
            dict1[value]=key
                  
        