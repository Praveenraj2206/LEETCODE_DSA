class Solution(object):
    def flipAndInvertImage(self, image):
        for row in image:
            row.reverse()
            for i in range(len(row)):
                if row[i]==0:
                    row[i]=1
                else:
                    row[i]=0 
        return image
        