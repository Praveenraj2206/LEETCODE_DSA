class Solution(object):
    def repeatedCharacter(self, s):
        seen_letters=[]
        for c in s:
            if c in seen_letters:
                return c
            else:
                seen_letters.append(c)
        