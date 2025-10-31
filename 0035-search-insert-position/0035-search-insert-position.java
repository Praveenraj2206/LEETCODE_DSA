class Solution {
    public int searchInsert(int[] nums, int target) {

        int L=0;
        int R=nums.length-1;
        int mid=0;
        while (L<=R)
        {
            mid=(L+R)/2;
            if (nums[mid]>target)
            {
                R=mid-1;
            }
            else if((nums[mid])<target)
            {
                L=mid+1;
            }
            else
            {
                return mid;
            }
        }
        return L;
    }
}