class Solution(object):
    def createTargetArray(self, nums, index):
        target=[]
        for i,num in enumerate(nums):
            target.insert(index[i],num)
        return target
        