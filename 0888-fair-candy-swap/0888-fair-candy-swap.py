class Solution(object):
    def fairCandySwap(self, aliceSizes, bobSizes):
        sumA = sum(aliceSizes)
        sumB = sum(bobSizes)
        diff = (sumA - sumB)//2
        setB = set(bobSizes)
        for x in aliceSizes:
            y = x - diff
            if y in setB:
                return [x,y]