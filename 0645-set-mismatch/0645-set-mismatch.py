class Solution(object):
    def findErrorNums(self, nums):
        count=Counter(nums)
        ans=[]
        for key,value in count.items():
            if value>1:
                ans.append(key)
                break
        for x in range(1,len(nums)+1):
            if x not in count.keys():
                ans.append(x)
                break
        return ans
        