class Solution(object):
    def isDigitorialPermutation(self, n): 
        # if n==0:
        #     return False    
        fact = [1] * 10
        for i in range(1, 10):
            fact[i] = fact[i - 1] * i
        
        def digit_factorial_sum(num):
            total = 0
            while num > 0:
                total += fact[num % 10]
                num //= 10
            return total
        
        original = n
        sum_n = digit_factorial_sum(n)
        if (digit_factorial_sum(sum_n) == sum_n and
            Counter(str(original)) == Counter(str(sum_n)) and
            len(str(original)) == len(str(sum_n))):
            return True
        
        return False