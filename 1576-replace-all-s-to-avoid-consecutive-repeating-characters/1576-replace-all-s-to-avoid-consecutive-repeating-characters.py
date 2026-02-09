class Solution:
    def modifyString(self,s):
        s = list(s)

        for i in range(len(s)):
            if s[i] == '?':
                for ch in 'abc':
                    left = s[i - 1] if i > 0 else ''
                    right = s[i + 1] if i < len(s) - 1 else ''
                    if ch != left and ch != right:
                        s[i] = ch
                        break

        return ''.join(s)     