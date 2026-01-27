class Solution(object):
    def mostWordsFound(self, sentences):
        list1 = []
        for x in sentences:
            y = x.count(" ")
            list1.append(y+1)
        return max(list1)


        
        