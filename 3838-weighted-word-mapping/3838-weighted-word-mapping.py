class Solution(object):
    def mapWordWeights(self, words, weights):
        list1=[]
        for word in words:
            add = 0
            for w in word:
                add += weights[ord(w) - ord('a')]
            list1.append(add%26)
        list1 = [x%26 for x in list1]
        w = ''
        for x in list1:
            value = ord('a') + (25-x)
            w += chr(value)
        return w
        
        