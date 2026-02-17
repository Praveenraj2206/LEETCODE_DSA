class Solution(object):
    def mostWordsFound(self, sentences):
        i=0
        value=0
        ans=0
        for x in sentences:
            value=x.count(" ")+1
            ans=max(value,ans)
            i += 1
        return ans

        # list1 = []
        # for x in sentences:
        #     y = x.count(" ")
        #     list1.append(y+1)
        # return max(list1)