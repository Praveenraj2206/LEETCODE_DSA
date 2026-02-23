class Solution(object):
    def squareIsWhite(self, coordinates):
        # alphabet = ['a', 'b', 'c', 'd', 'e', 'f', 'g', 'h']
        value = ord(coordinates[0])
        return (value-97 + int(coordinates[1]))%2 == 0