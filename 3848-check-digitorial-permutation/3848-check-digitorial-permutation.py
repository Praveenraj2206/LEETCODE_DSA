# class Solution(object):
#     def isDigitorialPermutation(self, n):
#         def factorial(value):
#             if value <= 1:
#                 return 1
#             return (value)*factorial(value-1)
            
#         def summation(value):
#             sum = 0
#             while value > 0:
#                 rem = value%10
#                 sum += factorial(rem)
#                 value //= 10
#             return sum
#         value = n
#         sum_n = summation(n)
#         counter1 = Counter(str(n))
#         counter2 = Counter(str(sum_n))
#         if summation(sum_n) == sum_n and counter1 == counter2 and len(str(n)) == len(str(sum_n)):
#             return True
#         return False

class Solution(object):
    def isDigitorialPermutation(self, n):     
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