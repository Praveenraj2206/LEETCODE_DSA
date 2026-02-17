class Solution(object):
    def findErrorNums(self, nums):
        duplicate = -1
        missing = -1
        for num in nums:
            index = abs(num)-1
            if nums[index]<0:
                duplicate = abs(num)
            else:nums[index] = -nums[index]
        for i in range(len(nums)):
            if nums[i]>0:
                missing = i+1
        return [duplicate,missing]

        # count=Counter(nums)
        # ans=[]
        # for key,value in count.items():
        #     if value>1:
        #         ans.append(key)
        #         break
        # for x in range(1,len(nums)+1):
        #     if x not in count.keys():
        #         ans.append(x)
        #         break
        # return ans     