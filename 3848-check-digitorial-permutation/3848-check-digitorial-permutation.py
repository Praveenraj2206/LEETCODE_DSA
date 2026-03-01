class Solution(object):
    def isDigitorialPermutation(self, n):
        fact = [1] * 10
        for i in range(1, 10):
            fact[i] = fact[i - 1] * i
        
        def factorial_sum(num):
            total = 0
            while num > 0:
                total += fact[num % 10]
                num //= 10
            return total
        
        sum_n = factorial_sum(n)
        
        return (
            factorial_sum(sum_n) == sum_n and
            Counter(str(n)) == Counter(str(sum_n)) and
            len(str(n)) == len(str(sum_n))
        )