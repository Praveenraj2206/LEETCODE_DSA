class Solution:
    def totalMoney(self,n):
        total = 0
        week_start = 1
        
        for day in range(n):
            total += week_start + day % 7
            if day % 7 == 6:
                week_start += 1
                
        return total
        