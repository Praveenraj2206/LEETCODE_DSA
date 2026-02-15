class Solution 
{
    public int search(int[] nums,int target)
    {
        int pivot=findPivot(nums);
        if (pivot == -1) 
        {
            // normal BS
            return binarysearch(nums,target,0,nums.length-1);
        }
        //if pivot found,then we have 2 sorted array
        if(nums[pivot] == target)
        {
            return pivot;
        }
        if(target >= nums[0])
        {
            return binarysearch(nums, target,0, pivot-1);
        }
        return binarysearch(nums, target, pivot + 1, nums.length - 1);
    }
    
    public int binarysearch(int[] arr, int target,int start,int end) {
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

    // int findPivot(int[] arr)
    // {
    //     int start=0;
    //     int end=arr.length-1;
    //     while(start <= end)
    //     {
    //         int mid = start + (end-start)/2;
    //         if(mid < end && arr[mid]>arr[mid+1])
    //         {
    //             return mid;
    //         }
    //         if(mid > start && arr[mid]<arr[mid-1])
    //         {
    //             return mid-1;
    //         }
    //         if (arr[mid] <= arr[start]) 
    //         {
    //             end=mid-1;
    //         }
    //         else
    //         {
    //             start = mid +1;
    //         }
    //     }
    //     return -1;
    // }


    int findPivot(int[] arr)
    {
        int start=0;
        int end=arr.length-1;
        while(start <= end)
        {
            int mid = start + (end-start)/2;
            if(mid < end && arr[mid]>arr[mid+1])
            {
                return mid;
            }
            if(mid > start && arr[mid]<arr[mid-1])
            {
                return mid-1;
            }

            //if elements at mid,end,start are equal then just skip the duplicates
            if (arr[mid] == arr[start] && arr[mid] == arr[end]) 
            {
                //skip the duplicates
                //Note: what if these elements at start and end were the pivot?
                //check if the start is pivot
                if(start < end && arr[start] > arr[start+1])
                {   return start;   }
                start++;

                //check if the end is pivot
                if(end > start && arr[end] > arr[end-1])
                {   return end-1;   }
                end--;
            }

            //left side is sorted , so pivot should be in right
            else if(arr[start] < arr[mid] || (arr[start] == arr[mid] && arr[mid] > arr[end]))
            {
                start = mid+1;
            }
            else
            {
                end = mid-1;
            }
        }
        return -1;
    }
}