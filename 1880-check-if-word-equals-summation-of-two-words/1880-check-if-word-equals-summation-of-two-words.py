class Solution(object):
    def isSumEqual(self, firstWord, secondWord, targetWord):
        def word_to_number(word):
            value = 0
            for ch in word:
                digit = ord(ch) - ord('a')
                value = value*10 + digit
            return value

        num1 = word_to_number(firstWord)
        num2 = word_to_number(secondWord)
        num3 = word_to_number(targetWord)

        return num1+num2 == num3