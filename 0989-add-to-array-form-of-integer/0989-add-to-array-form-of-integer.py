class Solution(object):
    def addToArrayForm(self, num, k):
        sum = ""
        for i in range(0,len(num)):
            sum += str(num[i])
        sum = int(sum)
        sum += k
        res =[]
        while (sum>0):
            res.append(sum%10)
            sum = sum//10
        return res[::-1]
        