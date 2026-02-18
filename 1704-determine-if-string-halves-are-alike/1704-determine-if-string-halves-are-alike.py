class Solution(object):
    def halvesAreAlike(self, s):
        s=s.lower()
        n=len(s)
        count1=0
        count2=0
        f_half=''
        s_half=''
        f_half = s[:n//2]
        s_half = s[n//2:]
        for i in range(0,n//2):
            count1 += 1 if f_half[i] in 'aeiou' else 0
            count2 += 1 if s_half[i] in 'aeiou' else 0
        return count1 == count2
        