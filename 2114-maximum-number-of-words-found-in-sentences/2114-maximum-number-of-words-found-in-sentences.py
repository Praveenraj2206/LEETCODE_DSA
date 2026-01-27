class Solution(object):
    def mostWordsFound(self, sentences):
        list1 = []
        for x in sentences:
            list1.append(x.count(" ")+1)
        return max(list1)


        
        