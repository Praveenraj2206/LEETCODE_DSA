class Solution(object):
    def reverseString(self, s): 
        left,right=0,len(s)-1
        while left<right:
            s[left],s[right]=s[right],s[left]
            left+=1
            right-=1
        


        # or


        # rev=[]
        # for i in range(1,len(s)+1):
        #     i= -(1 * i)
        #     rev.append(s[i])
        # return rev


        # or


        # s.reverse()


        # or


        # return s[::-1]
        