class Solution(object):
    def toggleLightBulbs(self, bulbs):
        count=Counter(bulbs)
        new=[]
        for key,value in count.items():
            if value%2 != 0:
                new.append(key)
        return sorted(new)
            
        