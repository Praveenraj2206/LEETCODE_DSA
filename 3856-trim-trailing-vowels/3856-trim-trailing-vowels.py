class Solution(object):
    def trimTrailingVowels(self, s):
        vowels = ['a','e','i','o','u']
        i = len(s) - 1
        while i >= 0 and s[i] in vowels:
            i -= 1
        return s[:i+1]
        