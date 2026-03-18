class Solution(object):
    def maxArea(self, height):
        left, right = 0,len(height)-1
        marea = 0
        while left<=right:
            h = min(height[left],height[right])
            width = right - left
            carea = h*width
            marea = max(marea,carea)

            if height[left] < height[right]:
                left += 1
            else:
                right -= 1
        return marea