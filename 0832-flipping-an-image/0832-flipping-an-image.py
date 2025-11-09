class Solution(object):
    def flipAndInvertImage(self, image):
        list1 = []
        for row in image:
            row.reverse()
            inverted_row = [1 - x for x in row]
            list1.append(inverted_row)
        return list1

        