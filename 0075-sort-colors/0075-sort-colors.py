class Solution:
    def sortColors(self, arr):
        pointer = 0

        for value in range(3):
            for j in range(len(arr)):
                if arr[j] == value:
                    arr[pointer], arr[j] = arr[j], arr[pointer]
                    pointer += 1
        